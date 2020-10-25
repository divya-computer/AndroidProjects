package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class BlinkActivity extends AppCompatActivity
{
    Button btnBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blink);

        final ImageView image = findViewById(R.id.idImageViewBlink);

        btnBlink = findViewById(R.id.btniconBlink);
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.blink);
                image.startAnimation(animation);
            }
        });
    }
}