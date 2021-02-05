package com.hack.sw_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {
    private Spinner spinner_year, spinner_month, spinner_day;
    private Button backButton, signUpButton;
    private EditText idEditText, pwEditText, secpwEditText, nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ArrayList<String> y_list = new ArrayList<>();
        ArrayList<String> m_list = new ArrayList<>();
        ArrayList<String> d_list = new ArrayList<>();
        spinner_year = (Spinner) findViewById(R.id.year);
        spinner_month = (Spinner) findViewById(R.id.month);
        spinner_day = (Spinner) findViewById(R.id.day);
    }
}