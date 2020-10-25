package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.everything.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public Toolbar toolbar1;
    public TabLayout tabLayout;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar1 = findViewById(R.id.toolbarNH);
        setSupportActionBar(toolbar1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this , drawer , toolbar1 , R.string.navigation_drawer_open , R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_viewNH);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.idItem1)
        {
            //Write....
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem2)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem3)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem4)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem5)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem6)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }
        else  if (id == R.id.idItem7)
        {
            Toast.makeText(this, item.getTitle() , Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}