package com.example.authenticationapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class GrantedView extends AppCompatActivity
{
    private TextView resultId, resultName;
    User user = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granted_view);
        resultId = findViewById(R.id.resultId);
        resultName = findViewById(R.id.resultName);
    }
}