package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.everything.R;

public class AutoCompleteTextViewActivity extends AppCompatActivity
{
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        String [] texts = {"Arjun" , "Ankit", "Anuradha", "Amreen", "Abhis", "Arvind", "Ajay", "Anam", "Bharat","Bhaskar", "Bhau", "Bhabhi", "Hemant","Himat","Himanshu", "Heenat", "Irfan" ,"Imran" ,"Iqbal" ,"Imar" , "Raj" , "Rak" , "Rakesh" , "Rashmi" ,"Raksha"};
        autoCompleteTextView = findViewById(R.id.idAutoCompTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,texts);
        autoCompleteTextView.setAdapter(adapter);
    }
}