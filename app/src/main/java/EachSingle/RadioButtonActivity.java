package EachSingle;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.everything.R;

public class RadioButtonActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int i)
            {
                switch (i)
                {
                    case R.id.radioButton1:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;

                    case R.id.radioButton2:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;

                    case R.id.radioButton3:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        break;

                    case R.id.radioButton4:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
                        break;

                    case R.id.radioButton5:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#008000"));
                        break;

                    case R.id.radioButton6:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFB6C1"));
                        break;

                    default:
                        Toast.makeText(RadioButtonActivity.this, "Please Select Atleast One", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}