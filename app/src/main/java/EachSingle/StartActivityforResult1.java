package EachSingle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

public class StartActivityforResult1 extends AppCompatActivity
{
    public static final int message_request=01;
    private TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activityfor_result1);

        txtDisplay = findViewById(R.id.textViewResult1);
    }

    public void getMessage(View view)
    {
        Intent intent = new Intent(StartActivityforResult1.this , StartActivityforResult2.class);
        startActivityForResult(intent , message_request);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (message_request == requestCode)
        {
            if (resultCode == RESULT_OK)
            {
                String message = data.getStringExtra("message");
                txtDisplay.setText(message);
            }

            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        }
    }
}