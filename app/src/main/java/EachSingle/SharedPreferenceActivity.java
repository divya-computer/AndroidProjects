package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

public class SharedPreferenceActivity extends AppCompatActivity
{
    String FileName = "myFile";
    Button btnSaveSP , btnReadSP;
    EditText editTextSP;
    TextView readNameSP;
    String nameSP;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        btnSaveSP = findViewById(R.id.idbtnSaveSharedPreference);
        btnSaveSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile();
            }
        });

        btnReadSP = findViewById(R.id.idbtnReadSharedPreference);
        btnReadSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFile();
            }
        });

        editTextSP = findViewById(R.id.idNameSharedPreference);
        readNameSP = findViewById(R.id.idReadtxtSharedPReference);
    }

    private void saveFile()
    {
        String strName = editTextSP.getText().toString();
        SharedPreferences sharedPref = getSharedPreferences(FileName , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("name" , strName);
        editor.commit();
        Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    private void readFile()
    {
        SharedPreferences sharedPref = getSharedPreferences(FileName , Context.MODE_PRIVATE);
        String defaultValue = "DefaultName";
        String name = sharedPref.getString("name" , defaultValue);
        readNameSP.setText(name);
        Toast.makeText(this, "Data : " +name, Toast.LENGTH_SHORT).show();
    }
}