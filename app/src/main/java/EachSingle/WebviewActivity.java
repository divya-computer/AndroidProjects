package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.everything.R;

import java.util.Timer;
import java.util.TimerTask;

public class WebviewActivity extends AppCompatActivity
{
    private boolean exit=false;
    private WebView webView;
    Button btnwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = (WebView)findViewById(R.id.webview);      //This is and that nxt line is used to navigate that page
        btnwebview = findViewById(R.id.btnwebview);
    }

    @Override
    public void onBackPressed()            //for example you play any video in yt and you click on back then it will return to yt page with the help of this otherwise the app will direcctly closed when you press back button
    {
        if (webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            //super.onBackPressed();
            if (exit)
            {
                finish();
            }
            else
            {
                Toast.makeText(this, "Press again to exit...", Toast.LENGTH_SHORT).show();
            }

            Timer timer= new Timer();                    //you have to click on back button twice to get back
            timer.schedule(new TimerTask()
            {
                @Override
                public void run()
                {
                    exit = false;
                }
            },2000);                            //This 2000 is millisec means 2sec it means you have to press back 2 times within 2sec to come back
            exit = true;

            webView.setVisibility(View.GONE);
            btnwebview.setVisibility(View.VISIBLE);

        }
    }

    public void viewviewview(View view)
    {
        Toast.makeText(this, "Opening Website", Toast.LENGTH_SHORT).show();

        btnwebview.setVisibility(View.GONE);
        webView.setVisibility(View.VISIBLE);

        webView.loadUrl("https://www.youtube.com/");

        WebSettings webSettings = webView.getSettings();        //This and next line is used to allow that webpage of js
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

    }
}