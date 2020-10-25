package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.everything.R;

public class DisableButtonActivity extends AppCompatActivity
{
    EditText userdisable , passworddisable;
    Button disablebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disable_button);

        userdisable = findViewById(R.id.disablebuttonemail);
        passworddisable = findViewById(R.id.disablebuttonpassword);
        disablebtn = findViewById(R.id.disablebutton);

        userdisable.addTextChangedListener(loginTextWatcher);
        passworddisable.addTextChangedListener(loginTextWatcher);


    }

    private TextWatcher loginTextWatcher = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {
            String user = userdisable.getText().toString().trim();
            String pass = passworddisable.getText().toString().trim();

            disablebtn.setEnabled(!user.isEmpty() && !pass.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s)
        {

        }
    };

    public void logindisablebutton(View view)
    {
            Toast.makeText(this, "Thank for Filling the Field", Toast.LENGTH_SHORT).show();
    }
}