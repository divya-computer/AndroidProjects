package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class LottiesActivity extends AppCompatActivity
{
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotties);

        b1 = findViewById(R.id.Lottie1Button);
        b2 = findViewById(R.id.Lottie2Button);
        b3 = findViewById(R.id.Lottie3Button);
        b4 = findViewById(R.id.Lottie4Button);
        b5 = findViewById(R.id.Lottie5Button);
    }

    public void beachdance(View v)
    {
        Intent i = new Intent(LottiesActivity.this , LottiesActivity1.class);
        startActivity(i);
    }

    public void dance(View v)
    {
        Intent i = new Intent(LottiesActivity.this , LottiesActivity2.class);
        startActivity(i);
    }

    public void dancingbear(View v)
    {
        Intent i = new Intent(LottiesActivity.this , LottiesActivity3.class);
        startActivity(i);
    }

    public void studentuniversity(View v)
    {
        Intent i = new Intent(LottiesActivity.this , LottiesActivity4.class);
        startActivity(i);
    }

    public void website(View v)
    {
        Intent i = new Intent(LottiesActivity.this , LottiesActivity5.class);
        startActivity(i);
    }
}