package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.everything.R;

import java.util.List;

public class GetWifiInfoActivity extends AppCompatActivity
{
    private static final int MY_PERMISSION_REQUEST_CHANGE_WIFI_STATE = 123;
    TextView vatTxt;
    Button varBtn;
    WifiManager mWifiManager;
    List <ScanResult> wifiList;
    StringBuilder sb = new StringBuilder();

//     public Example_WifiList(){
//
//     }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_wifi_info);
    }

    

}