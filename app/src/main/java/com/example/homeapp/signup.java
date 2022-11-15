package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class signup extends AppCompatActivity {

    TextInputLayout fullname_var,username_var,phonenumber_var,password_var,email_var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.signup);

        fullname_var = findViewById(R.id.user_full_name);
        username_var = findViewById(R.id.username);
        phonenumber_var = findViewById(R.id.user_phoneno);
        password_var = findViewById(R.id.password_input_field);
        email_var = findViewById(R.id.user_email);



    }

    public void registerButtonclick(View view) {
        String fullname = fullname_var.getEditText().getText().toString();
        String username = username_var.getEditText().getText().toString();
        String email = email_var.getEditText().getText().toString();
        String phoneNumber = phonenumber_var.getEditText().getText().toString();
        String password = password_var.getEditText().getText().toString();

        if(!fullname.isEmpty()){
            fullname_var.setError(null);
            fullname_var.setErrorEnabled(false);
            if(!username.isEmpty()){
                username_var.setError(null);
                username_var.setErrorEnabled(false);
                if(!email.isEmpty()){
                    email_var.setError(null);
                    email_var.setErrorEnabled(false);
                    if(!phoneNumber.isEmpty()){
                        phonenumber_var.setError(null);
                        phonenumber_var.setErrorEnabled(false);
                        if(password.isEmpty()){
                            password_var.setError(null);
                            password_var.setErrorEnabled(false);
                            if(email.matches("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")){

                            }else{
                                email_var.setError("Invalid Email");
                            }
                        }else{
                            password_var.setError("PLEASE ENTER THE PASSWORD!");
                        }
                    }else{
                        phonenumber_var.setError("PLEASE ENTER THE PHONE NUMBER");
                    }
                }else{
                    email_var.setError("PLEASE ENTER THE EMAIL");
                }
            }else{
                username_var.setError("PLEASE ENTER THE USERNAME");
            }
        }else{
            fullname_var.setError("PLEASE ENTER THE FULLNAME");
        }

    }

    public void for_loginclick(View view) {
        Intent intent = new Intent(getApplicationContext(),login.class);
        startActivity(intent);
        finish();
    }
}