package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

public class PhoneDetailActivity extends AppCompatActivity
{
    Button btnStart;
    TextView varTxt;
    String info;
    String strphoneType = "";
    static final int PERMISSION_READ_STATE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_detail);
    }

    //Method to start the Service
    public void StartPhoneDetail(View v)
    {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED)
        {
            //Name of the Method
            MyTelephonyManager();
        }
        else
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, PERMISSION_READ_STATE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode)
        {
            case PERMISSION_READ_STATE:
                {
                    if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                    {
                        //Name of Method for Calling Message
                        MyTelephonyManager();
                    }
                    else
                    {
                        Toast.makeText(this, "You dont have required permission to do this", Toast.LENGTH_SHORT).show();
                    }
                }
        }
    }

    private void MyTelephonyManager()
    {
        TelephonyManager manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        int phoneType = manager.getPhoneType();

        switch (phoneType)
        {
            case (TelephonyManager.PHONE_TYPE_CDMA):
                strphoneType = "CDMA";
                break;

            case (TelephonyManager.NETWORK_TYPE_GSM):
                strphoneType = "GSM";
                break;

            case (TelephonyManager.PHONE_TYPE_NONE):
                strphoneType = "NONE";
                break;
        }

        boolean isRoaming = manager.isNetworkRoaming();


        String IMEINumber = manager.getDeviceId();
        String subscriberId = manager.getDeviceId();
        String SIMSerialNumber = manager.getSimSerialNumber();
        String networkCountryISO = manager.getNetworkCountryIso();
        String SIMCountryISO = manager.getSimCountryIso();
        String softwareVersion = manager.getDeviceSoftwareVersion();
        String voiceMailNumber = manager.getVoiceMailNumber();

        info = "Phone Details : \n\n";
        info = info + "IMEI Number : " +IMEINumber;
        info = info + "\nSubscriberId : " +subscriberId;
        info = info + "\nSIMSerialNumber : " +SIMSerialNumber;
        info = info + "\nnetworkCountryISO : " +networkCountryISO;
        info = info + "\nSIMCountryISO : " +SIMCountryISO;
        info = info + "\nsoftwareVersion : " +softwareVersion;
        info = info + "\nvoiceMailNumber : " +voiceMailNumber;
        info = info + "\nIn Roaming : " +isRoaming;

        btnStart = (Button) findViewById(R.id.idbtnStartPhoneDetail);
        varTxt = (TextView) findViewById(R.id.idtxtViewPhoneDetail);
        varTxt.setText(info);

    }
}

//import android.Manifest;
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.os.Bundle;
//import android.telephony.TelephonyManager;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//import com.example.everything.R;
//
//public class PhoneDetailActivity extends AppCompatActivity
//{
//    Button btnStart;
//    TextView varText;
//    String info;
//    String strPhoneType = "";
//    static final int PERMISSION_READ_STATE = 123;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_phone_detail);
//
//    }
//
//    public void StartPhoneDetail(View view)
//    {
//        Toast.makeText(this, "you jst clicked", Toast.LENGTH_SHORT).show();
//
//        int permissionCheck = ContextCompat.checkSelfPermission(this , Manifest.permission.READ_PHONE_STATE);
//
//        if (permissionCheck == PackageManager.PERMISSION_GRANTED)
//        {
//            MyTelephonyManager();
//        }
//        else
//        {
//            ActivityCompat.requestPermissions(this , new String[] {Manifest.permission.READ_PHONE_STATE} , PERMISSION_READ_STATE);
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
//    {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults );
//
//        switch (requestCode)
//        {
//            case PERMISSION_READ_STATE :
//            {
//                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
//                {
//                    MyTelephonyManager();
//                }
//                else
//                {
//                    Toast.makeText(this, "You dont have permission", Toast.LENGTH_SHORT).show();
//                }
//            }
//        }
//    }
//
//    private void MyTelephonyManager()
//    {
//        TelephonyManager manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//        int phoneType = manager.getPhoneType();
//
//        switch (phoneType)
//        {
//            case (TelephonyManager.PHONE_TYPE_CDMA) :
//                strPhoneType = "CDMA";
//                break;
//
//            case (TelephonyManager.PHONE_TYPE_GSM) :
//                strPhoneType = "GSM";
//                break;
//
//            case (TelephonyManager.PHONE_TYPE_NONE) :
//                strPhoneType = "NONE";
//                break;
//
//        }
//
//        boolean isRoaming = manager.isNetworkRoaming();
//
//        String PhoneType = strPhoneType;
//        String IMEINumber = manager.getDeviceId();
//        String subscriberID = manager.getDeviceId();
//        String SIMSerialNumber = manager.getSimSerialNumber();
//        String networkCountryISO = manager.getNetworkCountryIso();
//        String SIMCountryISO = manager.getSimCountryIso();
//        String softwareVersion = manager.getDeviceSoftwareVersion();
//        String voiceMailNumber = manager.getVoiceMailNumber();
//
//        info = "Phone Details : \n";
//        info += "\n Phone Network Type : " +PhoneType;
//        info += "\n IMEI Number : " +IMEINumber;
//        info += "\n SubscriberID : " +subscriberID;
//        info += "\n Sim Serial Number : " +SIMSerialNumber;
//        info += "\n Network Country ISO : " +networkCountryISO;
//        info += "\n SIM country ISO : " +SIMCountryISO;
//        info += "\n Software Version : " +softwareVersion;
//        info += "\n Voice Mail Number : " +voiceMailNumber;
//        info += "\n In Roaming : " +isRoaming;
//
//        btnStart = (Button) findViewById(R.id.idbtnStartPhoneDetail);
//        varText = (TextView) findViewById(R.id.idtxtViewPhoneDetail);
//        varText.setText(info);
//    }
//}