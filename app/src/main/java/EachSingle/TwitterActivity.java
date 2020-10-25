package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class TwitterActivity extends AppCompatActivity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        btn = findViewById(R.id.idTwitter);
    }

    public void clickTwitter(View view)
    {
        try
        {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT , "To leanr Android Development Visit : " + "https://developer.android.com/");
            i.setPackage("advanced.twitter.android");
            startActivity(i);
            Toast.makeText(this, "Please Install Twitter App", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}