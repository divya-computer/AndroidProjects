package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.everything.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationBNV);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.action_item1 :
                        Toast.makeText(BottomNavigationActivity.this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_item2 :
                        Toast.makeText(BottomNavigationActivity.this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_item3 :
                        Toast.makeText(BottomNavigationActivity.this, "Item 3 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}