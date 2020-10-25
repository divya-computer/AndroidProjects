package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.everything.R;

import java.io.IOException;

public class WallpaperButton extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_button);
    }

    public void click(View view)
    {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try
        {
            wallpaperManager.setResource(R.drawable.middlefinger);
            Toast.makeText(this, "Must check Wallpaper \n Thank You ", Toast.LENGTH_SHORT).show();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}