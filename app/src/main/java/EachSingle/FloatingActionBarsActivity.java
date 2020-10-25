package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.everything.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingActionBarsActivity extends AppCompatActivity
{
    FloatingActionButton fabemail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_bars);

        fabemail = findViewById(R.id.idFabEmail);
        fabemail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Write Here
                Toast.makeText(FloatingActionBarsActivity.this, "Email Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}