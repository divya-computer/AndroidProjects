package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

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

public class CacheStorageActivity extends AppCompatActivity
{
    String FileName = "myFile";
    Button btnSaveCS , btnReadCS;
    EditText editNameCS;
    TextView readNameCS;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache_storage);

        btnSaveCS = findViewById(R.id.idbtnSaveCacheStorage);
        btnSaveCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile();
            }
        });

        btnReadCS = findViewById(R.id.idbtnReadCacheStorage);
        btnReadCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFile();
            }
        });

        editNameCS = findViewById(R.id.idNameCacheStorage);
        readNameCS = findViewById(R.id.idReadtxtCacheStorage);
    }

    private void saveFile()
    {
        try
        {
            //To append the Data in the File use Context.MODE_APPEND
            File file = new File (getCacheDir() , FileName);

            FileOutputStream fos = new FileOutputStream(file);
            name = editNameCS.getText().toString();
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
            File file = new File(getCacheDir() , FileName);

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
            readNameCS.setText("Name : " +stringBuilder.toString());

            Toast.makeText(this, "Data Retrieved : " +stringBuilder.toString(), Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }
}