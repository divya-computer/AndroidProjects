package EachSingle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.everything.R;

public class ImagesSwitcherActivity extends AppCompatActivity
{
    private ImageSwitcher switcher;
    private Button btnPrevious, btnNext;
    private static final int[] Images = { R.drawable.icon1 , R.drawable.icon2 , R.drawable.icon3 , R.drawable.icon4 , R.drawable.icon5 };
    private int mPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_switcher);

        btnPrevious = findViewById(R.id.idBtnPrevious11);
        btnNext = findViewById(R.id.idBtnNExt11);

        switcher = findViewById(R.id.idImagesSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory()
        {
            @Override
            public View makeView()
            {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT , ActionBar.LayoutParams.WRAP_CONTENT));

                return imageView;
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition < Images.length-1)
                {
                    mPosition = mPosition + 1;
                    switcher.setBackgroundResource(Images[mPosition]);
                    Toast.makeText(ImagesSwitcherActivity.this, "Position : " + mPosition, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPosition > 0)
                {
                    mPosition = mPosition - 1;
                    switcher.setBackgroundResource(Images[mPosition]);
                    Toast.makeText(ImagesSwitcherActivity.this, "Position : " + mPosition, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}