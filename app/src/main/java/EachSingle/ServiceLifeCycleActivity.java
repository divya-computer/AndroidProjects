package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class ServiceLifeCycleActivity extends AppCompatActivity
{
    Button btnStartServiceLife , btnStopServiceLife;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_life_cycle);

        btnStartServiceLife = findViewById(R.id.idbtnStartServiceLifeCycle);
        btnStopServiceLife = findViewById(R.id.idbtnStopServiceLifeCycle);
    }

    //Method to Start the Service
    public void ServiceStart(View view)
    {
        Intent i = new Intent(this , ServiceLifeCycle2.class);
        startService(i);
    }

    //Method to Stop the Service
    public void ServiceStop(View view)
    {
        Intent i = new Intent(this , ServiceLifeCycle2.class);
        stopService(i);
    }
}