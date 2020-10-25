package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class WhatsappActivity extends AppCompatActivity
{
    Button btnWhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

        btnWhatsapp = findViewById(R.id.idWhatsapp);
    }

    public void btnWhatsapp(View view)
    {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT , "To learn Android Development Visit : " + "https://developer.android.com/");
        sharingIntent.setPackage("com.whatsapp");
        startActivity(sharingIntent);
    }
}