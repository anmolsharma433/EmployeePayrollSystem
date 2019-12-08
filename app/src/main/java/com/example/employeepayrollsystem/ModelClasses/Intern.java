package com.example.employeepayrollsystem.ModelClasses;

public class Intern extends EmployeeData{
    private String schoolName;



    public Intern(String name, String age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double calEarnings()
    {
        return 1000;
    }



}
