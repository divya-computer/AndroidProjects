package EachSingle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

public class ViewPagerAdapter extends PagerAdapter
{
    private Context context;
    private int[] imageURLs;

    ViewPagerAdapter(Context context , int[] imageURLs)
    {
        this.context = context;
        this.imageURLs = imageURLs;
    }

    //This is the number of images that we will add in imageslider will that number will store in imageURLs
    @Override
    public int getCount()
    {
        return imageURLs.length;
    }

    //By doing view==object all the images will set in the view
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view == object;
    }

    //Here we are fetching all the images into imageView.
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        ImageView imageView = new ImageView(context);
        Picasso.get().load(imageURLs[position]).fit().centerCrop().into(imageView);

        container.addView(imageView);

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((View) object);
    }
}
