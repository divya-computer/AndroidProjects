package EachSingle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.everything.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetsActivity extends AppCompatActivity
{
    Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheets);

        View bottomSheet = findViewById(R.id.design_bottom_sheet);
        final BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback()
        {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState)
            {
                switch (newState)
                {
                    case BottomSheetBehavior.STATE_DRAGGING:
                        //Write Logic here
                        Log.i("BottomSheetCallback" , "BottomSheetBehaviour.State_Dragging");
                        break;

                    case BottomSheetBehavior.STATE_SETTLING:
                        //Write Logic here
                        Log.i("BottomSheetCallback" , "BottomSheetBehaviour.State_SETTLING");
                        break;

                    case BottomSheetBehavior.STATE_EXPANDED:
                        //Write Logic here
                        Log.i("BottomSheetCallback" , "BottomSheetBehaviour.State_EXPANDED");
                        break;

                    case BottomSheetBehavior.STATE_COLLAPSED:
                        //Write Logic here
                        Log.i("BottomSheetCallback" , "BottomSheetBehaviour.State_COLLAPSED");
                        break;

                    case BottomSheetBehavior.STATE_HIDDEN:
                        //Write Logic here
                        Log.i("BottomSheetCallback" , "BottomSheetBehaviour.State_HIDDEN");
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View view, float slideOffset)
            {
                //Write Logic
                Log.i("BottomSheetCallback" , "slideOffset : " +slideOffset);

            }
        });

        Button button = (Button) findViewById(R.id.buttonBS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (behavior.getState() == BottomSheetBehavior.STATE_COLLAPSED)
                {
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
                else
                {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
    }
}