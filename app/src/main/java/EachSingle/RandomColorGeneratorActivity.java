package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.everything.R;

import java.util.Random;

public class RandomColorGeneratorActivity extends AppCompatActivity
{
    private RelativeLayout layoutcolor;
    private Button btngeneratecolor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_color_generator);

        layoutcolor = findViewById(R.id.randomcolorgenerator);
        btngeneratecolor =findViewById(R.id.btnrandomcolor);

        btngeneratecolor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Random random = new Random();

                int color = Color.argb(255 , random.nextInt(256) , random.nextInt(256) , random.nextInt(256));

                layoutcolor.setBackgroundColor(color);

                Toast.makeText(RandomColorGeneratorActivity.this, "Click again to Generate new Color", Toast.LENGTH_SHORT).show();
            }
        });
    }
}