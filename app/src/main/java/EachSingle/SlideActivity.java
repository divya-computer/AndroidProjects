package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class SlideActivity extends AppCompatActivity
{
    Button btnSlideRight , btnSlideLeft , btnSlideTop , btnSlideBottom ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        final ImageView image = findViewById(R.id.idImageViewSlide);

        btnSlideTop = findViewById(R.id.idbtnSlideTop);
        btnSlideTop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_top);
                image.startAnimation(animation);
            }
        });

        btnSlideRight = findViewById(R.id.idbtnSlideRight);
        btnSlideRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_right);
                image.startAnimation(animation);
            }
        });

        btnSlideBottom = findViewById(R.id.idbtnSlideBottom);
        btnSlideBottom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_bottom);
                image.startAnimation(animation);
            }
        });

        btnSlideLeft = findViewById(R.id.idbtnSlideLeft);
        btnSlideLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_left);
                image.startAnimation(animation);
            }
        });
    }
}