package com.example.employeepayrollsystem.RoomDatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Customer_Info")
public class Customer {
    @PrimaryKey(autoGenerate = true)
    private int cid;

    @ColumnInfo(name = "FirstName")
    private String firstname;

    @ColumnInfo(name = "LastName")
    private String lastname;

    @ColumnInfo(name = "Email_ID")
    private String emailId;

    @ColumnInfo(name = "Password")
    private String password;

    @ColumnInfo(name = "Date_Of_Birth")
    private String dob;


    //Getter and Setter added

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
