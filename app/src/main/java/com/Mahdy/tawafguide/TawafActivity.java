package com.Mahdy.tawafguide;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class TawafActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tawaf);
        videoView=findViewById(R.id.video_view);
        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
        String videopath = "android.resource://" + getPackageName() +"//" +R.raw.twaff;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.findFocus();
        videoView.start();
        //MediaController mediaController = new MediaController(this);
        //videoView.setMediaController(mediaController);
        //mediaController.setAnchorView(videoView);
    }
}
