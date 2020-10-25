package EachSingle;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.everything.R;

public class InterFragmentCommunicationFragment_A extends Fragment
{
    private EditText editText;
    private Button buttonOk;
    private FragmentAListener listener;

    public interface FragmentAListener
    {
        void onInputASent(CharSequence input);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.inter_fragment_a , container , false);

        editText = v.findViewById(R.id.edit_text);
        buttonOk = v.findViewById(R.id.button_ok);

        buttonOk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CharSequence input = editText.getText();
                listener.onInputASent(input);

            }
        });

        return v;
    }

    public void updateEditText(CharSequence newText)
    {
        editText.setText(newText);
    }

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);

        if (context instanceof FragmentAListener)
        {
            listener = (FragmentAListener) context;
        }
        else
        {
            throw new RuntimeException(context.toString() + " must implement FragmentAListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;

    }
}
