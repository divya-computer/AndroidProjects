package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

import com.example.everything.R;

public class CheckedTextViewActivity extends AppCompatActivity
{
    private CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked_text_view);

        checkedTextView = (CheckedTextView) findViewById(R.id.idchecktextview);

        checkedTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                checkedTextView.toggle();
            }
        });
    }
}