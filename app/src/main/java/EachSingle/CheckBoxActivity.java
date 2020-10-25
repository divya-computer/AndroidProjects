package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.everything.R;

public class CheckBoxActivity extends AppCompatActivity
{
    Button btn;
    CheckBox checkBox1,checkBox2,checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        btn = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);


    }


    public void clickme(View view)
    {
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        else if (checkBox1.isChecked() == true && checkBox2.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        }
        else if (checkBox1.isChecked() == true && checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }
        else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }
        else if (checkBox1.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        }
        else if (checkBox2.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        }
        else if (checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }
        else
        {
            Toast.makeText(this, "Please select atleast one Button", Toast.LENGTH_SHORT).show();
        }
    }
}