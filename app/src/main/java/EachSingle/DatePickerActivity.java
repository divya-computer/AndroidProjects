package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.everything.R;

import java.time.Month;
import java.util.Calendar;

public class DatePickerActivity extends AppCompatActivity
{
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        datePicker = findViewById(R.id.datePicker);
        Calendar calendar = Calendar.getInstance();

        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener()
        {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth)
            {
                Toast.makeText(DatePickerActivity.this, datePicker.getDayOfMonth() + "-" + datePicker.getMonth() + "-" + datePicker.getYear() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}