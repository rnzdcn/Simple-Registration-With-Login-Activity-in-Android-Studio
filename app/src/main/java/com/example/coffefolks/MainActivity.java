package com.example.coffefolks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, birthdate, email, password;
    Button viewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.fNameTF);
        lastName = findViewById(R.id.lNameTF);
        birthdate = findViewById(R.id.bDayTF);
        email = findViewById(R.id.emailTF);
        password = findViewById(R.id.passwordTF);

        //View Button
        viewBtn = findViewById(R.id.viewBtn);
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Storing the data entered by the user
                GlobalVar.firstName = firstName.getText().toString();
                GlobalVar.lastName = lastName.getText().toString();
                GlobalVar.birthDate = birthdate.getText().toString();
                GlobalVar.email = email.getText().toString();
                GlobalVar.password = password.getText().toString();

                Intent info = new Intent(MainActivity.this, Information.class);
                startActivity(info);
            }
        });
    }
}