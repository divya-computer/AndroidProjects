package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.everything.R;

public class StartActivityforResult2 extends AppCompatActivity
{
    EditText Message;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activityfor_result2);

        Message = findViewById(R.id.editTextResult1);
    }

    public void sumbitmessage(View view)
    {
        String message = Message.getText().toString();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("message" , message);

        setResult(RESULT_OK , returnIntent);
        finish();

    }
}

