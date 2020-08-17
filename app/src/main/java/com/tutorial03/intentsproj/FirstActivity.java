package com.tutorial03.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText Num1;
    EditText Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
    }
    public void openSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",Num1.getText().toString());
        intent.putExtra("n2",Num2.getText().toString());

    // according to tute video
       // Toast.makeText(this, "Sending message...", Toast.LENGTH_SHORT).show();


     /* According to tute 5 answer.
        Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
     */


        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        startActivity(intent);
    }
}