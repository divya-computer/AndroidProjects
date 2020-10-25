package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.divyanshu.colorseekbar.ColorSeekBar;
import com.example.everything.R;

public class SeekbarBackgroundActivity extends AppCompatActivity
{
    //Variable initialize
    View view;
    ColorSeekBar colorSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_background);

        //Assign Variable
        view = findViewById(R.id.viewSBB);
        colorSeekBar = findViewById(R.id.color_seekbarSBB);

        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener()
        {
            @Override
            public void onColorChangeListener(int i)
            {
                //Set background color to View
                view.setBackgroundColor(i);
            }
        });
    }
}