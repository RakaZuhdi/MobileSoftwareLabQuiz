package com.example.mobilesoftwareengineeringlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button login;
    private Button register;
    private EditText inputUsername;
    private EditText inputPassword;
    private String usernameString;
    private String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login = findViewById(R.id.login_btn);
        register = findViewById(R.id.register_btn);

        inputUsername = findViewById(R.id.username_field);
        inputPassword = findViewById(R.id.password_field);

        login.setOnClickListener(view -> {

            usernameString = inputUsername.getText().toString();
            passwordString = inputPassword.getText().toString();



            //finish();

            Log.d("username", usernameString);
            Log.d("password", passwordString);
            Log.d("boolUser", String.valueOf(usernameString.equalsIgnoreCase("Admin")));
            Log.d("boolPassword", String.valueOf(passwordString.equalsIgnoreCase("Password")));

            if(!usernameString.equalsIgnoreCase("Admin") && !passwordString.equalsIgnoreCase("Password")){
                Toast.makeText(getApplicationContext(), "Wrong Username and Password", Toast.LENGTH_SHORT).show();

            }else{
                Intent intent = new Intent(view.getContext(), ListMenu.class);
                startActivity(intent);
                finish();
            }
        });

        register.setOnClickListener(view -> {

            usernameString = inputUsername.getText().toString();
            passwordString = inputPassword.getText().toString();


            Intent intent = new Intent(view.getContext(), Registration.class);
            startActivity(intent);
        });
    }
}