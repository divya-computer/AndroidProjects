package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class SequentialActivity extends AppCompatActivity
{
    Button btnSequential;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequential);

        final ImageView image = findViewById(R.id.idImageViewSequential);

        btnSequential = findViewById(R.id.btniconSequential);
        btnSequential.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.sequential);
                image.startAnimation(animation);
            }
        });
    }
}