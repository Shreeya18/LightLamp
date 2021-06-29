package com.androidp.lightlamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class registerPage extends AppCompatActivity {
    private TextView rlog;
    private EditText rname;
    private EditText rdob;
    private EditText remail;
    private EditText rcpass;
    private EditText rpass;
    private Button rbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);


        rlog = findViewById(R.id.rlog);
        rname = findViewById(R.id.rname);
        remail = findViewById(R.id.remail);
        rdob = findViewById(R.id.rdob);
        rpass = findViewById(R.id.rpass);
        rcpass = findViewById(R.id.rcpass);

        rlog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(registerPage.this, HomePage.class);
                startActivity(intent);
            }
        });
             rbtn = findViewById(R.id.rbtn);
             rbtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     String name = rname.getText().toString();
                     if (name.isEmpty()){
                         Toast.makeText(registerPage.this,"Name cannot be Empty!", LENGTH_SHORT).show();
                     }

                 }
             });

    }
}