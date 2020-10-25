package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

import java.util.Random;

public class RandomNumberGeneratorActivity extends AppCompatActivity
{
    EditText et_min,et_max;
    Button b_generate;
    TextView tv_output;

    Random r;
    int min = 0,max = 1,output;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number_generator);

        et_min = findViewById(R.id.editText1);
        et_max = findViewById(R.id.editText2);
        b_generate = findViewById(R.id.b_generate);
        tv_output = findViewById(R.id.tv_output);

        r = new Random();


        b_generate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                min = Integer.parseInt(et_min.getText().toString());
                max = Integer.parseInt(et_max.getText().toString());

                String tempMin,tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();

                if (!tempMin.equals("") && !tempMax.equals(""))
                {
                    if (max > min)
                    {
                        output = r.nextInt((max - min) + 1) + min;

                        tv_output.setText("" + output);
                    }

                    else
                    {
                        Toast.makeText(RandomNumberGeneratorActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(RandomNumberGeneratorActivity.this, "Enter any value !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
