package com.example.employeepayrollsystem;

import com.example.employeepayrollsystem.ModelClasses.EmployeeData;

import java.util.ArrayList;

public  class Singleton {

    private static Singleton myObj;


    ArrayList<EmployeeData> arrayListEmployee = new ArrayList<>();

    public static Singleton getInstance()
    {
        if (myObj == null)
        {
            myObj = new Singleton();
        }
            // Return the instance
            return myObj;
    }

    public void addEmployee(EmployeeData employeeData){
        arrayListEmployee.add(employeeData);
    }

    public ArrayList<EmployeeData> returnemplst(){
return arrayListEmployee;
    }



}

