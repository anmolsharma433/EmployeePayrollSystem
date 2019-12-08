package com.example.employeepayrollsystem.ModelClasses;

public class MotorCycle  extends  VehicleData{
    float enginePower;
    float topSpeed;



    public MotorCycle(String company, String plate, String colour, int year, float enginePower, float topSpeed) {
        super(company, plate, colour, year);
        this.enginePower = enginePower;
        this.topSpeed = topSpeed;
    }

    public MotorCycle(String company, String plate, String colour, int year) {
        super(company, plate, colour, year);
    }

    public float getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }
}


