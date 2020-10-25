package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.everything.R;

public class PopupMenuActivity extends AppCompatActivity
{
    Button btnpopupmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        btnpopupmenu = findViewById(R.id.idPopupMenu);
        btnpopupmenu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                PopupMenu popupMenu = new PopupMenu(PopupMenuActivity.this , btnpopupmenu);
                popupMenu.getMenuInflater().inflate(R.menu.activity_popup_menu2 , popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
                {
                    @Override
                    public boolean onMenuItemClick(MenuItem item)
                    {
                        Toast.makeText(PopupMenuActivity.this, "Item Clicked : " +item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}