package EachSingle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;

public class DialogFragmentActivity extends AppCompatActivity
{
    Button btnDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);
    }

    public void ShowDialog(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Divya Shaparia");
        builder.setMessage("Are you Sure You want to Quit ?");
        builder.setPositiveButton("OK!!!", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(DialogFragmentActivity.this, "OK was Clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        })

        .setNegativeButton("Cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(DialogFragmentActivity.this, "Cancel was Clicked", Toast.LENGTH_SHORT).show();
                //finish();
            }
        });

        //Create the AlertDialog object and return it
        builder.create().show();
    }
}