package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;

public class MapsActivity extends AppCompatActivity
{
    Button btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        btnMaps = findViewById(R.id.idBtnMaps);
    }

    public void btnClick(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);

        i.setData(Uri.parse("geo:23.005365,72.530048"));
        Intent chooser = Intent.createChooser(i,"Launch Maps");
        startActivity(chooser);
    }
}