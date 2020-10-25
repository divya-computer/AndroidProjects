package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.everything.R;

import java.util.Random;

public class SpintheBottleActivity extends AppCompatActivity
{
    private ImageView bottle;
    private Random random = new Random();
    private int lastDir;
    private boolean spinning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinthe_bottle);

        bottle = findViewById(R.id.bottleSpin);

    }

    public void spinBottle(View v)
    {
        if (!spinning)
        {
            //newDir is random number between 0-1800 and 1800 will divided bye 360 that is 5 means bottle will spin 0 and 5 rounds
            int newDir = random.nextInt(1800);

            float pivotX = bottle.getWidth() / 2;
            float pivotY = bottle.getHeight() / 2;

            Animation rotate = new RotateAnimation(lastDir, newDir, pivotX, pivotY);
            rotate.setDuration(2500);
            rotate.setFillAfter(true);

            rotate.setAnimationListener(new Animation.AnimationListener()
            {
                @Override
                public void onAnimationStart(Animation animation)
                {
                    spinning = true;
                }

                @Override
                public void onAnimationEnd(Animation animation)
                {
                    spinning = false;
                }

                @Override
                public void onAnimationRepeat(Animation animation)
                {

                }
            });

            //This means if you want to rotate bottle after 1st time it will rotate from that position not from initial position
            lastDir = newDir;

            bottle.startAnimation(rotate);
        }

    }
}