package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.everything.R;

public class ContextMenuActivity extends AppCompatActivity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        listView = findViewById(R.id.idListContextMenu);
        String[] planets = {"Mercury" , "Venus" , "Mars" , "Earth" , "Jupiter" , "Neptune" , "Saturn"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , planets);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v , ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the Action");
        menu.add(0,v.getId(),0,"Delete");
        menu.add(0,v.getId(),0,"UpparCase");
        menu.add(0,v.getId(),0,"LowerCase");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        if (item.getTitle() == "Delete")
        {
            Toast.makeText(this, "Delete is pressed", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle() == "UpparCase")
        {
            Toast.makeText(this, "Upparcase is pressed", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle() == "LowerCase")
        {
            Toast.makeText(this, "Lowercase is pressed", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Now work properly", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}