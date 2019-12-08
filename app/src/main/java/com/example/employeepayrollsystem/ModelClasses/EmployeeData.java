package com.example.employeepayrollsystem.ModelClasses;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Customer_Info")
public class EmployeeData implements Parcelable {

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
    private String age;





    //Constructor

    public EmployeeData(String name, String age) {
        this.name = name;
//        this.lastname = lastname;
//        this.emailId = emailId;
        this.age = age;
    }

    protected EmployeeData(Parcel in) {
        if (in.readByte() == 0) {
            employeeID = null;
        } else {
            employeeID = in.readInt();
        }
        employeeType = in.readString();
        name = in.readString();
        emailId = in.readString();
        if (in.readByte() == 0) {
            age = null;
        } else {
            age = (in.readString());
        }
    }

    public static final Creator<EmployeeData> CREATOR = new Creator<EmployeeData>() {
        @Override
        public EmployeeData createFromParcel(Parcel in) {
            return new EmployeeData(in);
        }

        @Override
        public EmployeeData[] newArray(int size) {
            return new EmployeeData[size];
        }
    };

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (employeeID == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(employeeID);
        }
        dest.writeString(employeeType);
        dest.writeString(name);
        dest.writeString(emailId);
        if (age == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(age);
        }
    }

    //Getter and Setter added


}
