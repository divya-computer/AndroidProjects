package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.everything.R;

public class RotateActivity extends AppCompatActivity
{
    Button rotateClock , rotateAnticlock;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        final ImageView image = findViewById(R.id.idImageViewRotate);

        rotateClock = findViewById(R.id.idbtnRotateClock);
        rotateClock.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image = findViewById(R.id.idImageViewRotate);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.rotate_clockwise);
                image.startAnimation(animation);

                Toast.makeText(RotateActivity.this, "rotate", Toast.LENGTH_SHORT).show();
            }
        });

        rotateAnticlock = findViewById(R.id.idbtnRotateAntiClock);
        rotateAnticlock.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView imageView = findViewById(R.id.idImageViewRotate);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.rotate_anticlockwise);
                image.startAnimation(animation);

                Toast.makeText(RotateActivity.this, "antirotate", Toast.LENGTH_SHORT).show();

            }
        });
    }
}