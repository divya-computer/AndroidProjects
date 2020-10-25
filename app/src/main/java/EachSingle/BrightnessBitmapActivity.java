package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.example.everything.R;

public class BrightnessBitmapActivity extends AppCompatActivity
{
    private ImageView imageView;
    private Bitmap bitmap;
    private SeekBar seekBar;

    private PictureThread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brightness_bitmap);

        bitmap = BitmapFactory.decodeResource(getResources() , R.drawable.galaxy);
        imageView = (ImageView) findViewById(R.id.imageViewBB);
        imageView.setImageBitmap(bitmap);

        thread = new PictureThread(imageView , bitmap);
        thread.start();

        seekBar = (SeekBar) findViewById(R.id.seekBarBB);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                thread.adjustBrightness(seekBar.getProgress() - 255);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }
}