package EachSingle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.everything.R;

public class PhoneDialActivity extends AppCompatActivity
{
    Button btn;
    EditText numTxt;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dial);

        btn = findViewById(R.id.idbtnCall);
        numTxt = findViewById(R.id.idNumTxt);
    }


    public void btnCall(View view)
    {
        Intent i = new Intent(Intent.ACTION_CALL);
        sNum = numTxt.getText().toString();

        if (sNum.trim().isEmpty())
        {
            Toast.makeText(this, "Please Enter Some Number", Toast.LENGTH_SHORT).show();
        }
        else
        {
            i.setData(Uri.parse("tel:" + sNum));
        }

        if (ActivityCompat.checkSelfPermission(this , Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            Toast.makeText(this, "Please Granted the Permission", Toast.LENGTH_SHORT).show();
            requestPermissions();
        }
        else
        {
            startActivity(i);
        }
    }

    private void requestPermissions()
    {
        ActivityCompat.requestPermissions(this , new String[]{Manifest.permission.CALL_PHONE} , 1);
    }


}