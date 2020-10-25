package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.everything.R;

public class CustomlistViewActivity extends AppCompatActivity
{
    String [] titles = {"Title 1" , "Title 2" , "Title 3" , "Title 4" , "Title 5"};
    String [] description = {"Desription 1" , "Desription 2" , "Desription 3" , "Desription 4" , "Desription 5"};
    int [] images = {R.drawable.icon1 , R.drawable.icon2 , R.drawable.icon3 , R.drawable.icon4 , R.drawable.icon5};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist_view);

        lv = findViewById(R.id.idListViewCustomlistView);

        MyAdapter adaptercustom = new MyAdapter( this, titles,description,images);
        lv.setAdapter(adaptercustom);
    }
}

class MyAdapter extends ArrayAdapter
{
    int[] imageArray;
    String[] titleArray;
    String [] descArray;

    public MyAdapter (Context context , String[] titles1 , String[] description1 , int[] img1)
    {
        //Overriding default constructor
        super(context , R.layout.activity_customlist_view_1 , R.id.idTitlecustomlist , titles1);

        this.imageArray = img1;
        this.titleArray = titles1;
        this.descArray = description1;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Inflate the layout
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_customlist_view_1 , parent , false);

        //Get the reference to the view object
        ImageView myImage = row.findViewById(R.id.idPic);
        TextView myTitle = row.findViewById(R.id.idTitlecustomlist);
        TextView myDescription = row.findViewById(R.id.idDescription);

        //Providing the elements of an array by specifying its position
        myImage.setImageResource(imageArray[position]);
        myTitle.setText(titleArray[position]);
        myDescription.setText(descArray[position]);

        return row;
    }


}