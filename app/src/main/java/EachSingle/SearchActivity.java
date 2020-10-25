package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.everything.R;

public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Arjun" , "Arvind" , "Arun" , "Ajay" , "Amrish" , "Animesh" , "Bhai" , "Bhopal" , "Brijesh" , "Bihar" , "Cat" , "Divya" , "Devil" , "Demon" , "Dipesh" , "divyang" , "Snake" , "Shop" , "Snow" , "Men" , "Man" , "Male" , "Manish" , "Mohan" , "Monoharlal" , "Mohit"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        lv = findViewById(R.id.idListSearchview);
        searchView = findViewById(R.id.idSearchView);
        adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , data);
        lv.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        String text = newText;
        adapter.getFilter().filter(newText);
        Toast.makeText(this, "Query is : " + text, Toast.LENGTH_SHORT).show();

        return false;
    }
}