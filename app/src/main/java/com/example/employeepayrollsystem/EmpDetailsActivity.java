package com.example.employeepayrollsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.employeepayrollsystem.ModelClasses.EmployeeData;

public class EmpDetailsActivity extends AppCompatActivity {
    TextView mytext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_details);
        mytext = findViewById(R.id.textempdetail);
        EmployeeData empnewdata = getIntent().getParcelableExtra("empobject");
        mytext.setText(empnewdata.getName() + "\n" +empnewdata.getAge());
    }
}
