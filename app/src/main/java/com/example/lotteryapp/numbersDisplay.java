package com.example.lotteryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class numbersDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_display);

        //THESE TEXTVIEW ARE TO BE USED STORE THE GENERATED LOTTO NUMBERS AND DISPLAY THEM USER
        TextView num1=(TextView)findViewById(R.id.results);
        TextView num2=(TextView)findViewById(R.id.results2);
        TextView num3=(TextView)findViewById(R.id.results3);
        TextView num4=(TextView)findViewById(R.id.results4);
        TextView num5=(TextView)findViewById(R.id.results5);
        TextView [] Thenumbers={num1,num2,num3,num4,num5};

        int min=1,max=50;
        int [] numbers=new int[5];
        int count=0;

        //BECAUSE AN ARRAY IS INITIALISED WITH ALL THE VALUES ASSIGNED TO ZERO THE WHILE LOOP BELOW CHECKS FOR A ZERO AND GENERATES ANUMBER TAHT HASNT BEEN GENERATED BEFORE
        while(iszero(numbers)){
            Random number=new Random();
            int randnumber=number.nextInt(max-min)+min;
            if(isthere(numbers,randnumber)){
                //IF NUMBER EXISTS IN THE GENRATED NUMBERS THEN THE NOTHINGMUST HAPPEN ANOTHER NUMBERR MUST BE GENERATED
            }
            else {
                numbers[count]=randnumber;
                count++;}
        }
        int indx=0;//TO INDEX THROUGH ARRAY OF TEXTVIEWS
        for(int i:numbers){
            String change= Integer.toString(i);
            Thenumbers[indx].setText(change);//ASSIGN EACHG GENERATED NUMBER A SPECIFIC TEXT VIEW
            indx++;


        }

    }
    //function to check for dupicates so they can be prevented
    public boolean isthere(int [] store,int x){
        for(int i:store){
            if(i==x){
                return true;
            }
        }
        return false;
    }

    //to check if theres a zero in the array so it can stop looping
    public boolean iszero(int [] store){
        for(int i:store){
            if(i==0){
                return true;
            }
        }
        return false;
    }

}