package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

public class TextToToastActivity extends AppCompatActivity
{
    TextView abc;
    Button red,blue,green;

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_toast);

        editText = findViewById(R.id.etext);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(TextToToastActivity.this, editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        abc   = findViewById(R.id.abc);
        red   = findViewById(R.id.red);
        blue  = findViewById(R.id.blue);
        green = findViewById(R.id.green);

        red.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc.setBackgroundColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc.setBackgroundColor(Color.BLUE);
            }
        });

        green.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc.setBackgroundColor(Color.GREEN);
            }
        });
    }
}