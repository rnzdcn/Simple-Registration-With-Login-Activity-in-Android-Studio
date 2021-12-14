package com.example.coffefolks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    TextView fullName;
    Button back2regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        fullName = findViewById(R.id.fullNameTV);
        fullName.setText(GlobalVar.lastName + "," + " " + GlobalVar.firstName);

        back2regBtn = findViewById(R.id.bck2regBtn);
        back2regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(Homepage.this, MainActivity.class);
                startActivity(reg);
            }
        });

    }
}

