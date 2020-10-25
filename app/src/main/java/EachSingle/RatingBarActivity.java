package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.everything.R;

public class RatingBarActivity extends AppCompatActivity
{
    RatingBar ratingBar;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        ratingBar = findViewById(R.id.idratingbar);
        btn = findViewById(R.id.button);

    }

    public void onBtnClick(View view)
    {
        float ratingvalue = ratingBar.getRating();

        Toast.makeText(this, "Rating is : " +ratingvalue, Toast.LENGTH_SHORT).show();
    }
}