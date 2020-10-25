package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.everything.R;

public class SoundClickActivity extends AppCompatActivity
{
    private SoundPool soundPool;
    private  int sound1 , sound2 , sound3 , sound4 , sound5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_click);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            AudioAttributes audioAttributes = new AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION).setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build();

            soundPool = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAttributes).build();

        }
        else
        {
            soundPool = new SoundPool(6 , AudioManager.STREAM_MUSIC , 0);
        }

        sound1 = soundPool.load(this , R.raw.musicone , 1);
        sound2 = soundPool.load(this , R.raw.musictwo , 1);
        sound3 = soundPool.load(this , R.raw.musicthree , 1);
        sound4 = soundPool.load(this , R.raw.musicfour , 1);
        sound5 = soundPool.load(this , R.raw.musicfive , 1);


    }

    public void playSound(View v)
    {
        switch (v.getId())
        {
            case R.id.sound1 :
                soundPool.play(sound1 , 1 , 1 , 0 , 0 , 1);
                soundPool.autoPause();
                break;

            case R.id.sound2 :
                soundPool.play(sound2 , 1 , 1 , 0 , 0 , 1);
                soundPool.autoPause();
                break;

            case R.id.sound3 :
                soundPool.play(sound3 , 1 , 1 , 0 , 0 , 1);
                soundPool.autoPause();
                break;

            case R.id.sound4 :
                soundPool.play(sound4 , 1 , 1 , 0 , 0 , 1);
                soundPool.autoPause();
                break;

            case R.id.sound5 :
                soundPool.play(sound5 , 1 , 1 , 0 , 0 , 1);
                soundPool.autoPause();
                break;
        }
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}