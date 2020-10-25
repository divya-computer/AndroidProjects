package EachSingle;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.everything.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ExpandableListViewActivity extends AppCompatActivity
{
    ExpandableListView expandableListView;
    List<String> listgroup;
    HashMap<String , List<String>> listItem;
    ExpandableListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandable_listview);
        listgroup = new ArrayList<>();
        listItem = new HashMap<>();

        adapter = new ExpandableListViewAdapter(this , listgroup , listItem);
        expandableListView.setAdapter(adapter);

        initListData();

    }

    private void initListData()
    {
        listgroup.add(getString(R.string.group1));
        listgroup.add(getString(R.string.group2));
        listgroup.add(getString(R.string.group3));
        listgroup.add(getString(R.string.group4));
        listgroup.add(getString(R.string.group5));

        String[] array;

        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for (String item : array)
        {
            list1.add(item);
        }

        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group2);
        for (String item : array)
        {
            list2.add(item);
        }

        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for (String item : array)
        {
            list3.add(item);
        }

        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group4);
        for (String item : array)
        {
            list4.add(item);
        }

        List<String> list5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group5);
        for (String item : array)
        {
            list5.add(item);
        }

        listItem.put(listgroup.get(0) , list1);
        listItem.put(listgroup.get(1) , list2);
        listItem.put(listgroup.get(2) , list3);
        listItem.put(listgroup.get(3) , list4);
        listItem.put(listgroup.get(4) , list5);

        adapter.notifyDataSetChanged();



    }
}