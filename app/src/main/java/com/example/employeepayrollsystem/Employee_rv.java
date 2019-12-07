package com.example.employeepayrollsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.employeepayrollsystem.ModelClasses.EmployeeData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class Employee_rv extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String > mName= new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    String json,temps;
    ArrayList<EmployeeData> empdatalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_rv);
        JasonParsing jasonParsing = new JasonParsing();
        json = jasonParsing.loadJSONFromAsset(this);

        Gson gson = new Gson();

        try {
            JSONArray jsonarray = new JSONArray(json);

            for(int i =0 ; i<=jsonarray.length();i++)
            {

                temps = jsonarray.get(i).toString();
                EmployeeData employee = gson.fromJson(temps,EmployeeData.class);
                empdatalist.add(employee);



            }
        }catch (JSONException e)
        {
            e.printStackTrace();
        }


    }
    private void  initImageBitmaps(){
        mImageUrls.add("https://i.redd.it/zko12yo8o0341.jpg");
        mName.add("The Mandolorian");

        mImageUrls.add("https://images.unsplash.com/photo-1539908984098-993d1fc82820?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60");
        mName.add("two people");

    }
    private  void initRecycleView()
    {
        RecyclerView recyclerView = findViewById(R.id.employee_rv);
        EmployeeRVAdapter employeeRVAdapter = new EmployeeRVAdapter(mName,mImageUrls,this);
        recyclerView.setAdapter(employeeRVAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
