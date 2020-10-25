package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class ActivityTransition2 extends AppCompatActivity
{
    Button btnactivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition2);

        btnactivity1 = findViewById(R.id.jumtoActivity1);
    }

    public void jumpActivity1(View view)
    {
        Toast.makeText(this, "Button Clicked..", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(ActivityTransition2.this , ActivityTransition1.class);
        startActivity(i);
    }
}