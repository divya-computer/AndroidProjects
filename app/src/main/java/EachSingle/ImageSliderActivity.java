package EachSingle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.everything.R;

public class ImageSliderActivity extends AppCompatActivity
{

    //Other ViewPageAdapter is the adapter of this activity

    private int[] imageUrls = new int[]{ R.drawable.wallpaper1 , R.drawable.wallpaper2 , R.drawable.wallpaper3 , R.drawable.wallpaper4 , R.drawable.wallpaper5 , R.drawable.wallpaper6 , R.drawable.wallpaper7 , R.drawable.wallpaper8};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        ViewPager viewPager = findViewById(R.id.view_PagerIS);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this , imageUrls);

        viewPager.setAdapter(adapter);
    }
}