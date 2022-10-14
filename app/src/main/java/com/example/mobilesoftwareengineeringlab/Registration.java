package com.example.mobilesoftwareengineeringlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Registration extends AppCompatActivity {

    private Button goBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        goBackBtn = findViewById(R.id.register_btn);

        goBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}