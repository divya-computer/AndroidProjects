package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class SimpleToastActivity extends AppCompatActivity
{
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_toast);

        b1 = findViewById(R.id.toast1);
        b2 = findViewById(R.id.toast2);
    }

    public void longToast(View view)
    {
        Toast.makeText(this, "This is Long time Toast", Toast.LENGTH_LONG).show();
    }

    public void shortToast(View view)
    {
        Toast.makeText(this, "This is Short time Toast", Toast.LENGTH_SHORT).show();
    }
}