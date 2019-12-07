package com.example.employeepayrollsystem.ModelClasses;

public class FullTime extends EmployeeData {
    private double salary;
    private double bonus;

    public FullTime()
    {
        super();

    }

    public FullTime(String name, int age, double salary, double bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calEarnings()
    {
        return (getSalary() + getBonus());
    }

}
