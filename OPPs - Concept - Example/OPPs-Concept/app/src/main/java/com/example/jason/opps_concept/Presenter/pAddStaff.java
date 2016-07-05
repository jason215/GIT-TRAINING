package com.example.jason.opps_concept.Presenter;

import android.widget.Toast;

import com.example.jason.opps_concept.Model.Staff;
import com.example.jason.opps_concept.View.StaffAddActivity;

/**
 * Created by jason on 04/07/2016.
 */
public class pAddStaff {
    private StaffAddActivity mView;

    public pAddStaff(StaffAddActivity mView) {
        this.mView = mView;
    }

    public void setStaffInformation(String name, String sex, String age, String position){
        switch (position){
            case "Staff" : saveStaff(name, sex, age);
                break;
        }

    }

    public void saveStaff(String name, String sex, String age){
        Staff mStaff = new Staff(name,sex, Integer.parseInt(age), 1.2f, 5000000);
        Toast.makeText(mView, "Staff's Salary = " + mStaff.Payroll(), Toast.LENGTH_LONG).show();
    }
}
