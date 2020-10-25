package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.everything.R;

public class ColorPickerActivity extends AppCompatActivity
{
    ImageView mImageViewCP;
    TextView mResultTv;
    View mColorView;

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        mImageViewCP = findViewById(R.id.imageViewColorPicker);
        mResultTv = findViewById(R.id.resultTvCP);
        mColorView = findViewById(R.id.colorViewCP);

        mImageViewCP.setDrawingCacheEnabled(true);
        mImageViewCP.buildDrawingCache(true);

        //Image view on touch listener
        mImageViewCP.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE)
                {
                    bitmap = mImageViewCP.getDrawingCache();

                    int pixel = bitmap.getPixel( (int)event.getX() , (int)event.getY() );

                    //Getting RGB values
                    int r = Color.red(pixel);
                    int g = Color.green(pixel);
                    int b = Color.blue(pixel);

                    //Getting Hex value
                    String hex = "#" +Integer.toHexString(pixel);

                    //set the background color of view according to the picker
                    mColorView.setBackgroundColor(Color.rgb(r,g,b));

                    //set RGB, HEX values to textview
                    mResultTv.setText("RGB :" +r+ ", " +g+ ", " +b+ "\nHEX: " +hex);

                }
                return true;
            }
        });

    }
}