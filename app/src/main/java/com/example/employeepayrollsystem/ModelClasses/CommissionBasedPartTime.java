package com.example.employeepayrollsystem.ModelClasses;

import android.os.Parcel;

public class CommissionBasedPartTime extends PartTime {
    private double commissionPercentage;



    public CommissionBasedPartTime(String name, int age, double rate, double hoursWorked, double commissionPercentage) {
        super(name, age, rate, hoursWorked);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public double calEarnings(){
        return ((getRate()*getHoursWorked()) + ((commissionPercentage/100) *(getRate()*getHoursWorked())));
    }


}
