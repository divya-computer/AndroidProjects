package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.everything.R;

public class Passingvalueonetoanother1 extends AppCompatActivity
{
    Button btnActivity1;
    EditText editText1;
    String editTextVal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passingvalueonetoanother1);

        btnActivity1 = findViewById(R.id.gotoActivity2);
        editText1 = findViewById(R.id.inputanyhere);
    }

    public void gotoactivity2valuepass(View view)
    {
        Intent i = new Intent(this , Passingvalueonetoanother2.class);

        editTextVal = editText1.getText().toString();
        i.putExtra("Value",editTextVal);
        startActivity(i);
        finish();
    }
}