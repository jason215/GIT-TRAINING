package com.example.jason.opps_concept.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.jason.opps_concept.Presenter.pAddStaff;
import com.example.jason.opps_concept.R;

import java.util.ArrayList;
import java.util.List;

public class StaffAddActivity extends AppCompatActivity implements iAddStaffView {

    private EditText edtName, edtAge;
    private Spinner spnSex, spnPosition;
    private String Name = null, Sex = null, Position = null, Age = null;
    private pAddStaff mPAddStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_add);

        mPAddStaff = new pAddStaff(this);

        //EditText call view item
        edtName = (EditText) findViewById(R.id.editText_staff_name);
        edtAge = (EditText) findViewById(R.id.editText_staff_age);
        //Spinner call view item
        spnSex = (Spinner) findViewById(R.id.spinner_staff_sex);
        spnPosition = (Spinner) findViewById(R.id.spinner_staff_position);
        //Setup spinner data
        setSpinner(spnSex, setListSex());
        setSpinner(spnPosition, setListPosition());
        //Set spinner onItemSelectClick()
        spnSex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Sex = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spnPosition.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Position = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void addStaff(View v){
        Name = edtName.getText().toString();
        Age = edtAge.getText().toString();
        mPAddStaff.setStaffInformation(Name, Sex, Age, Position);
    }

    @Override
    public void setSpinner(Spinner spinner, List<String> list) {
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public List<String> setListSex(){
        List<String> list = new ArrayList<>();
        list.add("Male");
        list.add("Female");
        return list;
    }

    @Override
    public List<String> setListPosition(){
        List<String> list = new ArrayList<>();
        list.add("Staff");
        list.add("Leader");
        list.add("PM");
        list.add("CEO");
        return list;
    }


}
