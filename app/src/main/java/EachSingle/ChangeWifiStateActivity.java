package EachSingle;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.everything.R;

public class ChangeWifiStateActivity extends AppCompatActivity
{
    Button enableButton,disableButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_wifi_state);

        enableButton=(Button)findViewById(R.id.btnOn);
        disableButton=(Button)findViewById(R.id.btnOff);

        enableButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(ChangeWifiStateActivity.this, "Wifi On...", Toast.LENGTH_SHORT).show();
            }
        });

        disableButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(ChangeWifiStateActivity.this, "Wifi Off...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}