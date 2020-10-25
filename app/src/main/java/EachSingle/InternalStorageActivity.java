package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class InternalStorageActivity extends AppCompatActivity
{
    String FileName = "myFile";
    Button btnSaveIS , btnReadIS;
    EditText editTextIS;
    TextView readNameIS;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage);

        btnSaveIS = findViewById(R.id.idBtnSaveInternalStorage);
        btnSaveIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile();
            }
        });

        btnReadIS = findViewById(R.id.idBtnReadInternalStorage);
        btnReadIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFile();
            }
        });

        editTextIS = findViewById(R.id.idNameInternalStorage);
        readNameIS = findViewById(R.id.idReadTextInternalStorage);
    }

    private void saveFile()
    {
        try
        {
            FileOutputStream fos = openFileOutput(FileName , Context.MODE_PRIVATE);
            name = editTextIS.getText().toString();
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
            FileInputStream fin = openFileInput(FileName);
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
            readNameIS.setText("Name : " +stringBuilder.toString());
            Toast.makeText(this, "Data Retrived : " +stringBuilder, Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }
}