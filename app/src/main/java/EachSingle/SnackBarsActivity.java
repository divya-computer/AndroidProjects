package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.everything.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class SnackBarsActivity extends AppCompatActivity
{
    FloatingActionButton fabEmailSB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bars);

        fabEmailSB = findViewById(R.id.idFabEmailSB);
        fabEmailSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Write Logic Here
                Snackbar snackbar = Snackbar.make(findViewById(R.id.idLayoutSB) , "No Internet Connection" , Snackbar.LENGTH_SHORT).setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Add if you want something to Add
                    }
                });
                snackbar.show();
            }
        });
    }
}