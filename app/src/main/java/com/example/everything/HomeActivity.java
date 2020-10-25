package com.example.everything;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity
{
    Button main , profile;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        main = findViewById(R.id.mainnactivity);
        profile = findViewById(R.id.profile);
    }

    public void clicktomain(View view)
    {
        Intent i = new Intent(HomeActivity.this , MainActivity.class);
        startActivity(i);
    }

    public void clicktoprofile(View view)
    {
        Intent i = new Intent(HomeActivity.this , ProfilePage.class);
        startActivity(i);

    }
}