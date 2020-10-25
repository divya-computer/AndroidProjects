package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class FacebookActivity extends AppCompatActivity
{
    Button btn;
    String uriString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        btn = findViewById(R.id.idbtnFacebook);
    }

    public void btnFacebook(View view)
    {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");

        //Give url in uriString
        uriString = "https://www.forbes.com/#653bce7f2254";
        sharingIntent.putExtra(Intent.EXTRA_TEXT , uriString);
        sharingIntent.setPackage("com.facebook.katana");
        startActivity(sharingIntent);
    }
}