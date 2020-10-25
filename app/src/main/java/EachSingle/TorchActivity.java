package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.everything.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class TorchActivity extends AppCompatActivity
{
    ImageButton imageButton;
    boolean state;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);

        imageButton = findViewById(R.id.torchbtn);

        Dexter.withContext(this).withPermission(Manifest.permission.CAMERA).withListener(new PermissionListener()
        {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse)
            {
                runFlashLight();
            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse)
            {
                Toast.makeText(TorchActivity.this, "Camera permission is required", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {

            }
        }).check();
    }

    private void runFlashLight()
    {
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if (!state)
                {
                    CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

                    try
                    {
                        String cameraId = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(cameraId , true);
                        state = true;
                    }
                    catch (CameraAccessException e)
                    {

                    }

                    imageButton.setBackgroundResource(R.drawable.torch_on);
                    Toast.makeText(TorchActivity.this, "On Torch", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

                    try
                    {
                        String cameraId = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(cameraId , false);
                        state = false;
                    }
                    catch (CameraAccessException e)
                    {

                    }

                    imageButton.setBackgroundResource(R.drawable.torch_off);
                    Toast.makeText(TorchActivity.this, "Off Torch", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}