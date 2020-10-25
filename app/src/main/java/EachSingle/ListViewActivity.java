package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.everything.R;

public class ListViewActivity extends AppCompatActivity
{
    ListView lv;
    String [] characters = {"Flash" , "Arrow" , "SuperGirl" , "BatMan" , "SuperMan" , "Atom" , "WonderWoman" , "GreenLantern" , "Cyborg" , "CaptainCold" , "Darkseid" , "FireStrom" , "GreenArrow" , "Grodd" , "Joker" , "KillerFroast" , "Zoom" , "ReverseFlash"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv = findViewById(R.id.idListView);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,characters);
        lv.setAdapter(adapter);

        //Setting onClickListener on Listview
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id)
            {
                Toast.makeText(ListViewActivity.this, "Items Clicked : " +i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}