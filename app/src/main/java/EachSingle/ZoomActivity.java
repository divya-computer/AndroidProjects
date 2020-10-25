package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class ZoomActivity extends AppCompatActivity
{
    Button btnZoomIn,btnZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        final ImageView image = findViewById(R.id.idImageViewZoom);

        btnZoomIn = findViewById(R.id.idbtnZoomIn);
        btnZoomIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //ImageView image = findViewById(R.id.idImageViewZoom);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.zoom_in);
                image.startAnimation(animation);
            }
        });

        btnZoomOut = findViewById(R.id.idbtnZoomOut);
        btnZoomOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //ImageView image = findViewById(R.id.idImageViewZoom);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.zoom_out);
                image.startAnimation(animation);
            }
        });
    }
}