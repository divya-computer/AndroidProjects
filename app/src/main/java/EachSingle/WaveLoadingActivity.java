package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.example.everything.R;

import me.itangqi.waveloadingview.WaveLoadingView;

public class WaveLoadingActivity extends AppCompatActivity
{
    WaveLoadingView waveLoadingView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_loading);

        seekBar = findViewById(R.id.seekBar);
        waveLoadingView = findViewById(R.id.waveLoadingView);
        waveLoadingView.setProgressValue(0);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                waveLoadingView.setProgressValue(progress);
                if (progress < 50)
                {
                    waveLoadingView.setBottomTitle(String.format("%d%%" , progress));
                    waveLoadingView.setCenterTitle("");
                    waveLoadingView.setTopTitle("");
                }

                else if (progress < 80)
                {
                    waveLoadingView.setBottomTitle("");
                    waveLoadingView.setCenterTitle(String.format("%d%%" , progress));
                    waveLoadingView.setTopTitle("");
                }

                else
                {
                    waveLoadingView.setBottomTitle("");
                    waveLoadingView.setCenterTitle("");
                    waveLoadingView.setTopTitle(String.format("%d%%" , progress));
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}