package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import com.example.everything.R;

public class SharedElement2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element2);

        //From line 21-28 not compulsary but to avoid flashing while clickng button we use this
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container) , true);
        fade.excludeTarget(android.R.id.statusBarBackground , true);
        fade.excludeTarget(android.R.id.navigationBarBackground , true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }
}