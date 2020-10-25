package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.everything.R;

public class ToogleBarActivity extends AppCompatActivity
{
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_bar);

        toggleButton = findViewById(R.id.clickme);
    }

    public void onToogleClick(View view)
    {
        if (toggleButton.isChecked())
        {
            Toast.makeText(this, "Toggle is ON", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Toggle is OFF", Toast.LENGTH_SHORT).show();
        }
    }
}