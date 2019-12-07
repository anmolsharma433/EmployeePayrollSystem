package com.example.employeepayrollsystem.ModelClasses;

public class FixedBasedPartTime extends PartTime{
    private double fixedAmount;



    public FixedBasedPartTime(String name, int age, double rate, double hoursWorked, double fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public double calEarnings()
    {
        return ((getRate()*getHoursWorked()) + getFixedAmount() + (getRate()*getHoursWorked()));
    }
}
