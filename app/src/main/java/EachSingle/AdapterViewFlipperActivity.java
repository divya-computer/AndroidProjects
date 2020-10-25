package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.everything.R;

import org.w3c.dom.Text;

public class AdapterViewFlipperActivity extends AppCompatActivity
{
    private AdapterViewFlipper adapterViewFlipper;
    private Button btnPrevious,btnNext;
    private static final String [] TEXT = {"Start building an app" , "Whether you're an experienced developer or creating your first Android app" , "here are some resources to get you started." , "Android Studio provides the fastest tools for building apps on every type of Android device"};
    private static final int[] Images = {R.drawable.icon1 , R.drawable.icon2 , R.drawable.icon3 , R.drawable.icon4 , R.drawable.icon5};
    private int mPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_flipper);

        adapterViewFlipper = findViewById(R.id.idAdapterViewFlipperAVF);

        //Creating adapter object
        FlipperAdapter adapter = new FlipperAdapter(this , TEXT , Images );
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setAutoStart(true);

    }

    class FlipperAdapter extends BaseAdapter
    {
        Context ctx;
        int[] images;
        String[] text;
        LayoutInflater inflater;

        public FlipperAdapter(Context context , String[] myText , int[] myImages )
        {
            this.ctx = context;
            this.images = myImages;
            this.text = myText;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount()
        {
            return text.length;
        }

        @Override
        public Object getItem(int position)
        {
            return null;
        }

        @Override
        public long getItemId(int position)
        {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            view = inflater.inflate(R.layout.flipper_items , null);
            TextView txtName = view.findViewById(R.id.idTextViewAVF);
            ImageView txtImage = view.findViewById(R.id.idImageViewAVF);

            txtName.setText(text[i]);
            txtImage.setImageResource(images[i]);
            return view;
        }
    }
}