package com.adw.komal_temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Temp_in_Celcius;
    private EditText Result;
    Double Result_in_fareheit;
    private Button Convert;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Convert= findViewById(R.id.Convert);
        Temp_in_Celcius= findViewById(R.id.Temp_in_Celcius);
        Result= findViewById(R.id.Result);


        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double Celcius = Double.parseDouble(Temp_in_Celcius.getText().toString());
                Result_in_fareheit =(Celcius *1.8) +32;
                Result.setText(String.valueOf(Result_in_fareheit));
            }
        });
    }
}