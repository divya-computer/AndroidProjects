package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class CameraActivity extends AppCompatActivity
{
    Button btnCamera;
    private static final int CAMERA_REQUEST = 123;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnCamera = findViewById(R.id.idbtnCameraClick);
        imageView = findViewById(R.id.imageViewCamera);
    }

    public void btnClickCamera(View v)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent , CAMERA_REQUEST);
    }

    public void onActivityResult(int requestCode , int resultCode , Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK)
        {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}