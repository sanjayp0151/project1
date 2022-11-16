package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {


    TextInputLayout username_var, password_var;
    TextView signup;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);

         signup = findViewById(R.id.for_signup);
         login_btn = findViewById(R.id.login_button);
        username_var = findViewById(R.id.username_text_field_design);
        password_var = findViewById(R.id.password_input_field);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username_var.getEditText().getText().toString();
                String password = password_var.getEditText().getText().toString();

                if(!username.isEmpty()){
                    username_var.setError(null);
                    username_var.setErrorEnabled(false);

                    if(!password.isEmpty()){
                        password_var.setError(null);
                        password_var.setErrorEnabled(false);
                    }else{
                        password_var.setError("PLEASE ENTER THE PASSWORD");
                    }
                }else{
                    username_var.setError("PLEASE ENTER THE USERNAME");
                }
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),signup.class);
                startActivity(intent);
            }
        });



    }


}