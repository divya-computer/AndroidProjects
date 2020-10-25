package EachSingle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.everything.R;

public class VideoViewActivity extends AppCompatActivity
{
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

//        videoView = findViewById(R.id.idvideoView);
//        videoView.setVideoURI(Uri.parse(String.valueOf(R.raw.funnyvideo)));
//        videoView.setMediaController(new MediaController(this));
//        videoView.requestFocus();
//        videoView.start();

        videoView = findViewById(R.id.idvideoView);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.funnyvideo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}