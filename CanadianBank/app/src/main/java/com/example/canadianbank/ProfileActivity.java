package com.example.canadianbank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ActionBar actionBar;
    Spinner spacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        // change the colour of action bar
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E8FF0200")));

        spacc=findViewById(R.id.accspinner);
        spacc.setOnItemSelectedListener(this);

        List<String> accounts =new ArrayList<>();

        accounts.add("Chequing");
        accounts.add("Savings");

        //create an addapter and fill it from the list

        ArrayAdapter<String> accAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,accounts);
        accAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        //fill the spinner with the aadapter item
        spacc.setAdapter(accAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

