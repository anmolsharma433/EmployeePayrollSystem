package com.example.employeepayrollsystem.ModelClasses;

public  class PartTime extends  EmployeeData {
    private double rate;
    private double hoursWorked;



    public PartTime(String name, Integer age, double rate, double hoursWorked) {
        super(name,age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }



    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

//    public  double calEarnings();



}
