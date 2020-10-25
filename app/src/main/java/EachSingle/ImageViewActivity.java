package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.everything.R;

public class ImageViewActivity extends AppCompatActivity
{
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = findViewById(R.id.idImageViewaaa);
    }

    public void onImageClickaa(View view)
    {
        Toast.makeText(this, "Image was Clicked", Toast.LENGTH_SHORT).show();
    }
}