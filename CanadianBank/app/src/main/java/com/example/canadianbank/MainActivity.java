package com.example.canadianbank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etcardno,etpassword;
    Button btnsignin,btnforget;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //change the colour of action bar
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E8FF0200")));

        etcardno=findViewById(R.id.cardnumber);
        etpassword=findViewById(R.id.password);

        btnsignin=findViewById(R.id.signin);
        btnsignin.setOnClickListener(this);
        btnforget=findViewById(R.id.forget);
        btnforget.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.signin:

                if (etcardno.getText().toString().equals("") && etpassword.getText().toString().equals("")) {
                    Toast.makeText(this, "Please enter Card Number and Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(etcardno.getText().toString().equals("")) {
                    Toast.makeText(this, "Please enter Card Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(etpassword.getText().toString().equals("")) {
                    Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }


                    Intent act = new Intent(getApplicationContext(), WelcomeActivity.class);
                    startActivity(act);
                break;
            case R.id.forget:
                break;
        }
    }
}
