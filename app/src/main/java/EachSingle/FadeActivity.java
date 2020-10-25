package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class FadeActivity extends AppCompatActivity
{
    Button btnFadeIn , btnFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade);

        final ImageView image = (ImageView) findViewById(R.id.idImageViewFade);

        btnFadeIn = findViewById(R.id.idBtnFadeIn);
        btnFadeIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image = (ImageView) findViewById(R.id.idImageViewFade);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.fade_in);
                image.startAnimation(animation);
            }
        });

        btnFadeOut = findViewById(R.id.idBtnFadeOut);
        btnFadeOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image = (ImageView) findViewById(R.id.idImageViewFade);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.fade_out);
                image.startAnimation(animation);
            }
        });
    }
}