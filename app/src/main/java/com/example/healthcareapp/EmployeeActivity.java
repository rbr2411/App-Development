package com.example.healthcareapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class EmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
    }
    // To add a notification to remind user to update temperature and
    // has he visited a containment zone
}
