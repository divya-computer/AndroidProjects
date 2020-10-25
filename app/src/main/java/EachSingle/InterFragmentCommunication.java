package EachSingle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.everything.R;

public class InterFragmentCommunication extends AppCompatActivity implements InterFragmentCommunicationFragment_A.FragmentAListener , InterFragmentCommunicationFragment_B.FragmentBListener
{
    private InterFragmentCommunicationFragment_A fragmentA;
    private InterFragmentCommunicationFragment_B fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_fragment_communication);

        fragmentA = new InterFragmentCommunicationFragment_A();
        fragmentB = new InterFragmentCommunicationFragment_B();

        getSupportFragmentManager().beginTransaction().replace(R.id.container_a , fragmentA)
                                                      .replace(R.id.container_b , fragmentB)
                                                      .commit();

    }

    @Override
    public void onInputASent(CharSequence input)
    {
        fragmentB.updateEditText(input);
    }

    @Override
    public void onInputBSent(CharSequence input)
    {
        fragmentA.updateEditText(input);
    }
}