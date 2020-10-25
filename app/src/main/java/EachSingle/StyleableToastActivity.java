package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.everything.R;
import com.muddzdev.styleabletoast.StyleableToast;

public class StyleableToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styleable_toast);
    }

    public void showToast(View view)
    {
        StyleableToast.makeText(this , "Hello World" , R.style.exampleToastST).show();
    }
}