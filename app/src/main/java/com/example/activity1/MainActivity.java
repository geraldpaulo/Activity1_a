package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_yellow,button_green,button_pink,button_reset;
    View background_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_red = (Button)findViewById(R.id.btn_red);
        button_blue = (Button)findViewById(R.id.btn_blue);
        button_yellow = (Button)findViewById(R.id.btn_yellow);
        button_green = (Button)findViewById(R.id.btn_green);
        button_pink = (Button)findViewById(R.id.btn_pink);
        button_reset = (Button)findViewById(R.id.btn_reset);
        background_view = this.getWindow().getDecorView();

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_red.getText().equals("Red"))
                {
                    background_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to red",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_blue.getText().equals("Blue"))
                {
                    background_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to blue",Toast.LENGTH_LONG).show();
                }

            }
        });

        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_yellow.getText().equals("Yellow"))
                {
                    background_view.setBackgroundResource(R.color.yellow);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to yellow",Toast.LENGTH_LONG).show();
                }

            }
        });

        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_green.getText().equals("Green"))
                {
                    background_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to green",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_pink.getText().equals("Pink"))
                {
                    background_view.setBackgroundResource(R.color.pink);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to pink",Toast.LENGTH_LONG).show();
                }
            }
        });
        
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_reset.getText().equals("Reset"))
                {
                    background_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to default",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}