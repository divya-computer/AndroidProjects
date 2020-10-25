package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.everything.R;

public class GridViewActivity extends AppCompatActivity
{
    GridView gd;
    String[] datagd = {"Lion" , "Tiger" , "Elephant" , "Camel" , "Zebra" , "Rhinoceros" , "Deer" , "Monkey" , "Horse" , "Crocodile" , "Yak" , "Penguins" , "Fox"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gd = findViewById(R.id.idGridView);
        ArrayAdapter<String> adaptergd = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , datagd);
        gd.setAdapter(adaptergd);
    }
}