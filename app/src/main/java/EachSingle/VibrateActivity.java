package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class VibrateActivity extends AppCompatActivity
{
    Button btnVibrate;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate);

        btnVibrate = findViewById(R.id.btnVibrate);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        btnVibrate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                vibrator.vibrate(1000);

                Toast.makeText(VibrateActivity.this, "Your Device is Vibrating", Toast.LENGTH_SHORT).show();
            }
        });
    }
}