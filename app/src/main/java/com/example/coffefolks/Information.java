package com.example.coffefolks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    TextView firstNameTV, lastNameTV, birthDateTV, emailTV;
    Button saveBtn, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        firstNameTV = findViewById(R.id.fNameTV);
        lastNameTV = findViewById(R.id.lNameTV);
        birthDateTV = findViewById(R.id.bDateTV);
        emailTV = findViewById(R.id.emailTV);

        firstNameTV.setText(GlobalVar.firstName);
        lastNameTV.setText(GlobalVar.lastName);
        birthDateTV.setText(GlobalVar.birthDate);
        emailTV.setText(GlobalVar.email);

        //Save Button
        saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(Information.this, Login.class);
                startActivity(log);
            }
        });

        //Back Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    // onBackPressed Method
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}