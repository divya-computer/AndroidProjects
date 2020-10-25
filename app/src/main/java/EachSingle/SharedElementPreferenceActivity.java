package EachSingle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.everything.R;

public class SharedElementPreferenceActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element_preference);

        //From line 27-34 not compulsary but to avoid flashing while clickng button we use this
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container) , true);
        fade.excludeTarget(android.R.id.statusBarBackground , true);
        fade.excludeTarget(android.R.id.navigationBarBackground , true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        final ImageView imageView = findViewById(R.id.image_activity_1);

        Button button = findViewById(R.id.buttonSEP);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SharedElementPreferenceActivity.this , SharedElement2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SharedElementPreferenceActivity.this , imageView , ViewCompat.getTransitionName(imageView));
                startActivity(intent , options.toBundle());
            }
        });

    }
}