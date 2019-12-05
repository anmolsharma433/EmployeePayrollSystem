package com.example.employeepayrollsystem.RoomDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.Room;

import com.example.employeepayrollsystem.ModelClasses.EmployeeData;

@Database(entities = EmployeeData.class,exportSchema = false,version = 2)
public abstract class UserDatabase extends RoomDatabase{
    public static final String Database_name = "Employee_Payroll";
    private static  UserDatabase uInstance;


    public static UserDatabase getInstance(Context context)
    {
        if(uInstance == null)
        {
            uInstance = Room.databaseBuilder(context.getApplicationContext(),UserDatabase.class,UserDatabase.Database_name).allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return uInstance;
    }

    // *** have to add database object interface

}


