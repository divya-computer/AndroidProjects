package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class InstagramActivity extends AppCompatActivity
{
    Button btnInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        btnInstagram = findViewById(R.id.btnInstagram);
    }


    public void clicktoInsta(View view)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT , "To leanr Android Development Visit : " + "https://developer.android.com/");
        i.setPackage("com.instagram.android");
        startActivity(i);
    }
}