package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.everything.R;

public class GetWifiListActivity extends AppCompatActivity
{
    TextView varTxt;
    Button varBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_wifi_list);

        varTxt = findViewById(R.id.idTxtWifiList);
        varBtn = findViewById(R.id.idBtnWifiList);
    }

    public void getWifiInformation(View view)
    {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ip = wifiInfo.getIpAddress();
        String macAddress = wifiInfo.getMacAddress();
        String bssid = wifiInfo.getBSSID();
        int rssi = wifiInfo.getRssi();
        int linkspeed = wifiInfo.getLinkSpeed();
        String ssid = wifiInfo.getSSID();
        int networkId = wifiInfo.getNetworkId();
        String ipAddress = Formatter.formatIpAddress(ip);

        String info = "IpAddress : " + ipAddress +
                "\n" + "MacAddress : " + macAddress +
                "\n" + "BSSID : " + bssid +
                "\n" + "SSID : " +ssid +
                "\n" + "Network : " + networkId +
                "\n" + "RSSI : " + rssi +
                "\n" + "Link Speed" +linkspeed;

        varTxt.setText(info);
    }
}