package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.everything.R;

public class TextSwitcherActivity extends AppCompatActivity
{
    private TextSwitcher switcher;
    private Button btnPrevious,btnNext;
    private static final String [] TEXT = {"Hi My name is Divya Shaparia" , "Change is Only Constant" , "Never Quit" , "I am Even" , "Change Passion into Profit" , "Never Settle"};
    private int mPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_switcher);

        btnPrevious = findViewById(R.id.idBtnPrevious);
        btnNext = findViewById(R.id.idBtnNext);

        switcher = findViewById(R.id.idtextSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory()
        {
            @Override
            public View makeView()
            {
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(18);
                return textView;
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mPosition < TEXT.length-1)
                {
                    mPosition = mPosition+1;
                    switcher.setText(TEXT[mPosition]);
                }
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mPosition > 0)
                {
                    mPosition = mPosition-1;
                    switcher.setText(TEXT[mPosition]);
                }
            }
        });
    }
}