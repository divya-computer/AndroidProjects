package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class EmailActivity extends AppCompatActivity
{
    Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btnEmail = findViewById(R.id.idBtnEmail);
    }

    public void btnClickEmail(View view)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        String[] s = {"shaparia95@gmail.com","shaparia20@gmail.com"};

        i.putExtra(Intent.EXTRA_EMAIL , s);
        i.putExtra(Intent.EXTRA_SUBJECT , "This is a Subject");
        i.putExtra(Intent.EXTRA_TEXT , "Hi This is the Email Body");
        i.setType("message/rfc822");

        Intent chooser = Intent.createChooser(i,"Launch Email");
        startActivity(chooser);
    }
}