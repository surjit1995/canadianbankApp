package com.example.canadianbank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PayBills extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ActionBar actionBar;
    Spinner spaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bills);

        // change the colour of action bar
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E8FF0200")));

        spaccount=findViewById(R.id.accountspinner);
        spaccount.setOnItemSelectedListener(this);

        List<String> accounts =new ArrayList<>();

        accounts.add("Chequing");
        accounts.add("Savings");

        //create an addapter and fill it from the list

        ArrayAdapter<String> accAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,accounts);
        accAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        //fill the spinner with the aadapter item
        spaccount.setAdapter(accAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

