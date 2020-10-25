package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class ActivityTransition1 extends AppCompatActivity
{
    Button btntoactivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition1);

        btntoactivity2 = findViewById(R.id.jumpActivity2);
    }

    public void jumpActivityto2(View view)
    {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(ActivityTransition1.this , ActivityTransition2.class);
        startActivity(i);
    }
}