package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.everything.R;

public class Passingvalueonetoanother2 extends AppCompatActivity
{
    Button btnActivity2;
    TextView txtView2;
    String valFromAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passingvalueonetoanother2);

        btnActivity2 = findViewById(R.id.idbtnActivity2);
        txtView2 = findViewById(R.id.idTextActivity2);

        valFromAct1 = getIntent().getExtras().getString("Value");
        txtView2.setText(valFromAct1);
    }

    public void btnClickAct2(View view)
    {
        Intent i = new Intent(this,Passingvalueonetoanother1.class);
        startActivity(i);

        finish();
    }
}