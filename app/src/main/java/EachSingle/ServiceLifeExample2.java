package EachSingle;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.everything.R;

public class ServiceLifeExample2 extends Service
{
    MediaPlayer myPlayer;


    @Override
    public IBinder onBind(Intent intent)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Toast.makeText(this, "onCreate in Service was Called", Toast.LENGTH_SHORT).show();
        myPlayer = MediaPlayer.create(this , R.raw.demomusic);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        myPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        myPlayer.stop();
        Toast.makeText(this, "onDestroy in Service was Called", Toast.LENGTH_SHORT).show();
    }
}
