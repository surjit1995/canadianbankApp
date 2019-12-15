package com.example.canadianbank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnprofile,btntransfer,btnpaybills,btntransactions,btnchangepwd,btnlogout;

    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // change the colour of action bar
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E8FF0200")));

        btnprofile=findViewById(R.id.profile);
        btnprofile.setOnClickListener(this);

        btntransfer=findViewById(R.id.trasfer);
        btntransfer.setOnClickListener(this);

        btnpaybills=findViewById(R.id.paybills);
        btnpaybills.setOnClickListener(this);

        btntransactions=findViewById(R.id.transactions);
        btntransactions.setOnClickListener(this);

        btnchangepwd=findViewById(R.id.changepassword);
        btnchangepwd.setOnClickListener(this);

        btnlogout=findViewById(R.id.logout);
        btnlogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.profile :
                Intent act1 = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(act1);
                break;
            case R.id.trasfer :
                Intent act2 = new Intent(getApplicationContext(), TransferActivity.class);
                startActivity(act2);
                break;

            case R.id.paybills :
                Intent act3 = new Intent(getApplicationContext(), PayBills.class);
                startActivity(act3);
                break;

            case R.id.transactions:
                Intent  act4 = new Intent(getApplicationContext(), TransactionsActivity.class);
                startActivity(act4);
                break;
            case R.id.changepassword :
                Intent act5 = new Intent(getApplicationContext(), ChangePasswordActivity.class);
                startActivity(act5);
                break;
            case R.id.logout :

                // show an alert to confirm whether the user want to exit or not
                AlertDialog.Builder builder = new AlertDialog.Builder(WelcomeActivity.this);
                builder.setTitle(R.string.app_name);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("Are you sure you would like to Logout?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent  act6 = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(act6);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
//            Intent  act6 = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(act6);
//                break;
        }

    }
}
