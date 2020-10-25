package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class MoveActivity extends AppCompatActivity
{
    Button btnLeft,btnRight,btnTop,btnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        final ImageView image  = findViewById(R.id.idImageViewMove);

        btnLeft = findViewById(R.id.idbtnMoveLeft);
        btnLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image  = findViewById(R.id.idImageViewMove);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.move_left);
                image.startAnimation(animation);
            }
        });

        btnRight = findViewById(R.id.idbtnMoveRight);
        btnRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image  = findViewById(R.id.idImageViewMove);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.move_right);
                image.startAnimation(animation);
            }
        });

        btnTop = findViewById(R.id.idbtnMoveTop);
        btnTop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image  = findViewById(R.id.idImageViewMove);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.move_top);
                image.startAnimation(animation);
            }
        });

        btnBottom = findViewById(R.id.idbtnMoveBottom);
        btnBottom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                ImageView image  = findViewById(R.id.idImageViewMove);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.move_bottom);
                image.startAnimation(animation);
            }
        });
    }
}