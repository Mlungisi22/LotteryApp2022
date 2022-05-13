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
        TextView txtchange=(TextView)findViewById(R.id.results);

        int min=1,max=50;
        int [] numbers=new int[5];
        int count=0;
        while(iszero(numbers)){
            Random number=new Random();
            int randnumber=number.nextInt(max-min)+min;
            if(isthere(numbers,randnumber)){
                //do nothing
            }
            else {
                numbers[count]=randnumber;
                count++;}
        }
        String convert=" ";
        for(int i:numbers){
            String change= Integer.toString(i);
            convert+=change+",";
        }
        txtchange.setText(convert);

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