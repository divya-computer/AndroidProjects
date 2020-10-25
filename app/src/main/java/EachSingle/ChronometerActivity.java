package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

import com.example.everything.R;

public class ChronometerActivity extends AppCompatActivity
{
    Chronometer chronometer1,chronometer2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer);

        chronometer1 = findViewById(R.id.idchronoMeter);
        chronometer2 = findViewById(R.id.idchronoMeter2);
    }

    public void Starttime(View view)
    {
        chronometer1.setBase(SystemClock.elapsedRealtime());
        chronometer1.start();

        chronometer2.setBase(SystemClock.elapsedRealtime());
        chronometer2.start();
    }

    public void Stopitem(View view)
    {
        chronometer1.stop();
        chronometer2.stop();
    }
}