package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;


import com.example.everything.R;

public class GooglePlusActivity extends AppCompatActivity
{
    Button btngoogleplus;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_plus);

        btngoogleplus = findViewById(R.id.idGoogleplus);
    }

    public void btnGoogleplus(View view)
    {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT , "To leanr Android Development Visit : " + "https://developer.android.com/");
        sharingIntent.setPackage("com.google.android.apps.plus");
        startActivity(sharingIntent);
    }
}