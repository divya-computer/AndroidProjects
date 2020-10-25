package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.everything.R;

public class SwitchActivity extends AppCompatActivity
{
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        aSwitch = findViewById(R.id.idSwitch);
    }

    public void onSwitchClick(View view)
    {
        if (aSwitch.isChecked())
        {
            Toast.makeText(this, "Switch On", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Switch Off", Toast.LENGTH_SHORT).show();
        }
    }
}