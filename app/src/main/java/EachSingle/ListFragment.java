package EachSingle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.everything.R;

public class ListFragment extends Fragment
{
    ListView lv;
    ArrayAdapter<String> adapter;
    String[] data = {"Aardvark" , "Arfican Civet" , "Akita" , "American CoonHound" , "Amur Leopard" , "Baboon" , "Barb" , "Bat" , "Bear" , "Bengal Tiger" , "Bird" , "Bongo" , "Butterfly" , "Camel" , "Catfish" , "Cheetah" , "Chimpanzee" , "Cockroach" , "Crab" , "Deer" , "Dog" , "Donkey" , "Duck" , "Eagle" , "Elephant" , "Emu" , "Falcon" , "Ferret" , "Fish" , "Fly" , "Fox", "Frog" , "Giiraffe" , "Hummingbird" , "Jackal" , "Jaguar" , "JellyFish" , "King Crab" , "Koala" , "Leopard" , "Liger" , "Lion" , "Lynx" , "Macaw" , "Mole" , "Molly" , "Mongoose" , "Moose" , "Mouse" , "Octopus" , "Parrot" , "Penguin" , "Pike" , "Pug"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listfragment , container , false);
        lv = view.findViewById(R.id.idListViewFragment);
        adapter = new ArrayAdapter<String>(getActivity() , android.R.layout.simple_list_item_1 , data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getActivity(), "Item Clicked : " +position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
