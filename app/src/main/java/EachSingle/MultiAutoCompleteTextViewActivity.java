package EachSingle;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.everything.R;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete_text_view);

        MultiAutoCompleteTextView mactw = findViewById(R.id.mactw);
        String [] texts = {"Arjun" ,"Arnav", "Ankol" ,"Arjit" ,"Abhinav" ,"Arul" ,"Bassi" ,"Bhakti" ,"Bhaijaan" ,"Bhau" ,"Brother" ,"Bhaskar" ,"Divya" ,"Dev" ,"Devarsh" ,"Devang" ,"Divyesh" ,"Reshma" ,"Rekhha" ,"Raj" ,"Rajneet" ,"Ruchit" ,"Rahul" ,"Rohan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,texts);
        mactw.setAdapter(adapter);
        mactw.setTokenizer(new android.widget.MultiAutoCompleteTextView.CommaTokenizer());
    }
}
