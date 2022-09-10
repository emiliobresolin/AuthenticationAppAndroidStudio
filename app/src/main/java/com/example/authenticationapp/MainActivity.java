package com.example.authenticationapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onClick(View view)
    {
        AuthenticationFunc authenticationFunc = new AuthenticationFunc();
        EditText login = findViewById(R.id.loginInput);
        EditText password = findViewById(R.id.passwordInput);
        String loginS = login.getText().toString();
        String passwordS = password.getText().toString();
        if (authenticationFunc.Authentication(loginS, passwordS))
        {
            Intent intent = new Intent(view.getContext(), GrantedView.class);
            startActivity(intent);
        }
    }
}