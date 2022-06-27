package com.example.lotteryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RadioGroup type;
    RadioButton choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void move(View view){
        Intent myIntent=new Intent(MainActivity.this, numbersDisplay.class);
        startActivity(myIntent);
       // int radioId= type.getCheckedRadioButtonId();
        //choice=findViewById(radioId);

        /*if(choice.getText()=="Lotto"){
            Intent myIntent=new Intent(MainActivity.this, numbersDisplay.class);
            startActivity(myIntent);
        }
        else if(choice.getText()=="Powerball"){
            Intent myIntent=new Intent(MainActivity.this, Powerballinter.class);
            startActivity(myIntent);
        }*/
    }


}

