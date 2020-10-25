package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ExternalStorageActivity extends AppCompatActivity
{
    private static final int PERMISSION_WRITE_EXTERNAL_STORAGE = 123;
    String FileName = "myFile";
    Button btnSaveES , btnReadES;
    EditText editNameES;
    TextView readNameES;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage);

        btnSaveES = findViewById(R.id.idbtnSaveExternalStorage);
        btnSaveES.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int permissionCheck = ContextCompat.checkSelfPermission(getApplicationContext() , Manifest.permission.WRITE_EXTERNAL_STORAGE);

                if (permissionCheck == PackageManager.PERMISSION_GRANTED)
                {
                    saveFile();
                }
                else
                {
                    ActivityCompat.requestPermissions(ExternalStorageActivity.this , new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE} , PERMISSION_WRITE_EXTERNAL_STORAGE);
                }
            }
        });

        btnReadES = findViewById(R.id.idbtnReadExternalStorage);
        btnReadES.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                readFile();
            }
        });

        editNameES = findViewById(R.id.idNameExternalStorage);
        readNameES = findViewById(R.id.idReadtxtExternalStorage);
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        switch (requestCode)
        {
            case PERMISSION_WRITE_EXTERNAL_STORAGE :
            {
                //Permission to read storage
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    saveFile();
                }
                else
                {
                    Toast.makeText(this, "Please grant Permission to Save File", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    private void saveFile()
    {
        try
        {
            //To Save the File in the Directory called MyData in the root ...
            //Uncommment and replace the code
            /*  File myDir = new File(Environment.getExternalStorageDirectory() + "/MyData");
                myDir.mkdirs();
                File file = new File (myDir , FileName);
            */

            //To save the file directly the root
            File file = new File (Environment.getExternalStorageDirectory() , FileName);

            //Below code will remain the same
            FileOutputStream fos = new FileOutputStream(file);
            name = editNameES.getText().toString();
            fos.write(name.getBytes());
            fos.close();
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }

    private void readFile()
    {
        try
        {
            //To Read the File in the Directory called MyData in the root ...
            //Uncommment and replace the code
            /*  File myDir = new File(Environment.getExternalStorageDirectory() + "/MyData");
                myDir.mkdirs();
                File file = new File (myDir , FileName);
            */

            //To Read the file directly in root
            File file = new File(Environment.getExternalStorageDirectory() , FileName);

            //Below code will remain same
            FileInputStream fin = new FileInputStream(file);
            InputStreamReader inputStream = new InputStreamReader(fin);
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;

            while ((line = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(line);
            }

            fin.close();
            inputStream.close();
            readNameES.setText("Name : " +stringBuilder.toString());

            Toast.makeText(this, "Data Retrieved : " +stringBuilder.toString(), Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }


}