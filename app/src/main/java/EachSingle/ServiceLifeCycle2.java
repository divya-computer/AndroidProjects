package EachSingle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ServiceLifeCycle2 extends Service
{
//    public MyService()
//    {
//        return;
//    }

    @Override
    public IBinder onBind(Intent intent)
    {
        throw new UnsupportedOperationException("Not yr implemented");
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Toast.makeText(this, "onCreate in Service was Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Toast.makeText(this, "onStartCommand in Service was Called", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy in Service was Called", Toast.LENGTH_SHORT).show();
    }


}
