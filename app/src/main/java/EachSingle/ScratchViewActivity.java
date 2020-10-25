package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;
import com.example.everything.R;

public class ScratchViewActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scratch_view);

        ScratchView scratchView = findViewById(R.id.scratchView);
        scratchView.setRevealListener(new ScratchView.IRevealListener()
        {
            @Override
            public void onRevealed(ScratchView scratchView)
            {
                Toast.makeText(ScratchViewActivity.this, "Congratulations for your winning", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent)
            {
                Log.d("Revealed" , String.valueOf(percent));

            }
        });
    }
}