package com.amir_hamza_sabuz.findyourage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText etBirthYear;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBirthYear= findViewById(R.id.etBirthYear);
        tvAge = findViewById(R.id.tvAge);
    }

    public void buFindAge(View view) {
        int birthYear = Integer.parseInt(etBirthYear.getText().toString());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = year-birthYear;
        tvAge.setText("Your age is " + String.valueOf(age));
    }
}
