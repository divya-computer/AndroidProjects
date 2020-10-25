package EachSingle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everything.R;

import java.util.Set;

public class BluetoothActivity extends AppCompatActivity
{
    private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVER_BT = 1;

    TextView mStatusBlueTv , mPairedTv;
    ImageView mBlueIv;
    Button mOnBtn , mOffBtn , mDiscoverBtn , mPairedBtn;

    BluetoothAdapter mBlueAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        mStatusBlueTv = findViewById(R.id.statusBluetoothTvB);
        mPairedBtn = findViewById(R.id.pairedBtnB);
        mPairedTv = findViewById(R.id.pairedTvB);
        mBlueIv = findViewById(R.id.bluetoothIvB);
        mOnBtn = findViewById(R.id.onBtnB);
        mOffBtn = findViewById(R.id.offBtnB);
        mDiscoverBtn = findViewById(R.id.discoverableBtnB);

        //Adapter
        mBlueAdapter = BluetoothAdapter.getDefaultAdapter();

        //Check bluetooth is available or not
        if (mBlueAdapter == null)
        {
            mStatusBlueTv.setText("Bluetooth is not available");
        }
        else
        {
            mStatusBlueTv.setText("Bluetooth is available");
        }

        //Set the image according to bluetooth status (on/off)


        try
        {
            if (mBlueAdapter.isEnabled())
            {
                mBlueIv.setImageResource(R.drawable.bluetooth1);
            }
            else
            {
                mBlueIv.setImageResource(R.drawable.bluetooth2);
            }



            //On-btn click
            mOnBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if (!mBlueAdapter.isEnabled())
                    {
                        showToast("Turning On-Bluetooth");

                        //intent to on Bluetooth
                        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(intent , REQUEST_ENABLE_BT);
                    }
                    else
                    {
                        showToast("Bluetooth is Already On");
                    }

                }
            });

            //Off-btn click
            mOffBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if (mBlueAdapter.isEnabled())
                    {
                        mBlueAdapter.disable();
                        showToast("Turning Bluetooth Off ...");

                        mBlueIv.setImageResource(R.drawable.bluetooth2);
                    }
                    else
                    {
                        showToast("Bluetooth is Already Off");
                    }

                }
            });

            //Discoverable click
            mDiscoverBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if (!mBlueAdapter.isDiscovering())
                    {
                        showToast("Making Your Device Discoverable");
                        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                        startActivityForResult(intent , REQUEST_DISCOVER_BT);
                    }

                }
            });

            //Paired click
            mPairedBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    if (mBlueAdapter.isEnabled())
                    {
                        mPairedTv.setText("Paired Devices");
                        Set<BluetoothDevice> devices = mBlueAdapter.getBondedDevices();

                        for (BluetoothDevice device : devices)
                        {
                            mPairedTv.append("\n Devices : " +device.getName() + "," +device);
                        }
                    }
                    else
                    {
                        showToast("Turn on bluetooth to get Paired devices");
                    }
                }
            });

        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        switch (requestCode)
        {
            case REQUEST_ENABLE_BT:
                if (resultCode == RESULT_OK)
                {
                    mBlueIv.setImageResource(R.drawable.bluetooth1);
                    Toast.makeText(this, "Bluetooth is On", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //User denied to turn-On bluetooth
                    Toast.makeText(this, "No permission to enable Bluetooth", Toast.LENGTH_SHORT).show();
                }
                break;

        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    //Toast
    private void showToast (String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}