package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class CustomToastActivity1 extends AppCompatActivity
{
    Button btn;
    View viewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast1);

        btn = findViewById(R.id.ClickforCustomtoast);
        LayoutInflater layoutInflater = getLayoutInflater();
        viewLayout = layoutInflater.inflate(R.layout.activity_custom_toast2 , (ViewGroup) findViewById(R.id.custom_layout));
    }

    public void customeToast(View view)
    {
        Toast toast1 = Toast.makeText(this, "Toast:Gravity.TOP", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,0);
        toast1.setView(viewLayout);
        toast1.show();
    }
}