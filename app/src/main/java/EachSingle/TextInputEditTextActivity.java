package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.everything.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextInputEditTextActivity extends AppCompatActivity
{
    TextInputEditText txtUserNAme , txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_edit_text);

        txtUserNAme = (TextInputEditText) findViewById(R.id.idUserName);
        txtPassword = (TextInputEditText) findViewById(R.id.idPassword);

        btnLogin = findViewById(R.id.idBtnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login()
    {
        if (TextUtils.isEmpty(txtUserNAme.getText().toString().trim()) || TextUtils.isEmpty(txtPassword.getText().toString().trim()))
        {
            txtUserNAme.setError("Fill can't be Empty");
            txtPassword.setError("Fill can't be Empty");
        }
        else if (!emailValidator(txtUserNAme.getText().toString()))
        {
            txtUserNAme.setError("Please Enter Valid Email Address");
        }
        else
        {
            Toast.makeText(this, "You have SuccessFully Login \n Work in Progress ...", Toast.LENGTH_SHORT).show();
        }
    }

    //Email Validation Using Regex
    private boolean emailValidator(String email)
    {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }


}