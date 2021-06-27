package com.androidp.lightlamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.validation.Validator;

public class HomePage extends AppCompatActivity {
   private EditText email;
   private EditText epass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
                // Declared Variables For user Input , Button and Text View
                 email = findViewById(R.id.email);
                 epass = findViewById(R.id.epass);
        Button elogin = findViewById(R.id.elogin);
        Button login = findViewById(R.id.login);

        elogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String emailid = email.getText().toString();
                 String epassw = epass.getText().toString();

                Toast.makeText(HomePage.this,"Logged In !",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(HomePage.this,feedPage.class);
                startActivity(intent);




            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,registerPage.class);
                startActivity(intent);

            }
        });






    }
}