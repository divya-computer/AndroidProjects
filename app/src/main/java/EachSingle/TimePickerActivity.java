package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.everything.R;

public class TimePickerActivity extends AppCompatActivity
{
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.idtimePicker);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener()
        {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute)
            {
                Toast.makeText(TimePickerActivity.this, "Time is " + hourOfDay + ":" + minute , Toast.LENGTH_SHORT).show();
            }
        });
    }
}