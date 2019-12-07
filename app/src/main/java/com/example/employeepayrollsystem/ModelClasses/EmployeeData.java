package com.example.employeepayrollsystem.ModelClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Customer_Info")
public class EmployeeData {

    @SerializedName("employeeid")
    @Expose
    @PrimaryKey(autoGenerate = true)

    private Integer employeeID;
//    @SerializedName("dob")
//    @Expose
//    private String dob;
    @SerializedName("employeeType")
    @Expose
    private String employeeType;
    @SerializedName("name")
    @Expose
    private String name;
//    @SerializedName("lastname")
//    @Expose
//    private String lastname;

    @SerializedName("emailid")
    @Expose
    private String emailId;
    @SerializedName("age")
    @Expose
    private Integer age;



    //Constructor

    public EmployeeData(String name, Integer age) {
        this.name = name;
//        this.lastname = lastname;
//        this.emailId = emailId;
        this.age = age;
    }

    public EmployeeData() {

    }


    //Getter and Setter added


}
