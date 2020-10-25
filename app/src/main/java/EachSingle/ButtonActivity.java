package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.everything.R;

public class ButtonActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void buttonclick(View view)
    {
        Toast.makeText(this, "The button is Clicked...", Toast.LENGTH_SHORT).show();
    }
}