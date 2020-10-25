package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.everything.R;

public class ImageButtonActivity extends AppCompatActivity
{
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        imageButton = findViewById(R.id.idImageButton);
    }

    public void onImageButtonClick(View view)
    {
        Toast.makeText(this, "Image was Clicked ", Toast.LENGTH_SHORT).show();
    }
}