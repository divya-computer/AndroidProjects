package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class TogetherActivity extends AppCompatActivity
{
    Button btnTogether;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_together);

        final ImageView image = findViewById(R.id.idImageViewTogether);

        btnTogether = findViewById(R.id.btniconTogether);
        btnTogether.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.together);
                image.startAnimation(animation);
            }
        });
    }
}