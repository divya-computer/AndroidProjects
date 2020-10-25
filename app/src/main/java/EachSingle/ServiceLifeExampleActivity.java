package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class ServiceLifeExampleActivity extends AppCompatActivity
{
    Button btnStartServiceExample , btnStopServiceExample;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_life_example);

        btnStartServiceExample = findViewById(R.id.idbtnStartServiceExample);
        btnStopServiceExample = findViewById(R.id.idbtnStopServiceExample);
    }

    //Method to Start the Service
    public void ServiceExampleStart(View view)
    {
        Intent i = new Intent(this , ServiceLifeExample2.class);
        startService(i);
    }

    public void ServiceExampleStop(View view)
    {
        Intent i = new Intent(this , ServiceLifeExample2.class);
        stopService(i);
    }
}