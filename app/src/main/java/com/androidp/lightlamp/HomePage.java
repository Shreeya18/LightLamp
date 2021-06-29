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
   String name = "dholeshreeya18@gmail.com";
   String password = "shree@18";
   boolean isValid = false;

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


                 if (emailid.isEmpty() || epassw.isEmpty()) {
                     Toast.makeText(HomePage.this, "Log In Fields Cannot be Empty", Toast.LENGTH_LONG).show();
                 }
                 else {
                     isValid = Validate(emailid, epassw);
                     if (!isValid) {
                         Toast.makeText(HomePage.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
                     } else {
                         Toast.makeText(HomePage.this, "Successfully Logged In !", Toast.LENGTH_SHORT).show();

                         Intent intent = new Intent(HomePage.this, feedPage.class);
                         startActivity(intent);
                     }
                 }


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

    private boolean Validate(String username, String passw){
        return username.equals(name) && passw.equals(password);
    }
}