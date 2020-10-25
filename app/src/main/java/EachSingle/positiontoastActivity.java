package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class positiontoastActivity extends AppCompatActivity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positiontoast);

        btn = findViewById(R.id.positiontoast);
    }

    public void poToast(View view)
    {
        Toast toast1 = Toast.makeText(this , "Toast : Gravity.Top" , Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.TOP,0,0);
        toast1.show();

        Toast toast2 = Toast.makeText(this , "Toast : Gravity.Center" , Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER,0,0);
        toast2.show();

        Toast toast3 = Toast.makeText(this , "Toast : Gravity.Bottom" , Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.BOTTOM,0,0);
        toast3.show();

        Toast toast4 = Toast.makeText(this , "Toast : Gravity.Left" , Toast.LENGTH_SHORT);
        toast4.setGravity(Gravity.LEFT,0,0);
        toast4.show();

        Toast toast5 = Toast.makeText(this , "Toast : Gravity.Right" , Toast.LENGTH_SHORT);
        toast5.setGravity(Gravity.RIGHT,0,0);
        toast5.show();

        Toast toast6 = Toast.makeText(this , "Toast : Gravity.Top Left" , Toast.LENGTH_SHORT);
        toast6.setGravity(Gravity.TOP | Gravity.LEFT , 0 , 0);
        toast6.show();

        Toast toast7 = Toast.makeText(this , "Toast : Gravity Bottom Right" , Toast.LENGTH_SHORT);
        toast7.setGravity(Gravity.BOTTOM | Gravity.RIGHT ,0 ,0);
        toast7.show();
    }
}