package com.example.karl.officium20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
    }

    public void OnSetSignUpButton(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUp.class);
        startActivityForResult (intent,0);
    }

    public void OnSetLogInButton(View view) {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivityForResult (intent,0);
    }
}
