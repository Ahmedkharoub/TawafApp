package com.Mahdy.tawafguide;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class SaieActivity extends AppCompatActivity {
    private VideoView videoView2;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saie);
        videoView2=findViewById(R.id.video2);
        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
        String videopath = "android.resource://" + getPackageName() +"//" +R.raw.saie;
        Uri uri = Uri.parse(videopath);
        videoView2.setVideoURI(uri);
        //videoView2.findFocus();
        videoView2.start();
        final MediaController mediaController = new MediaController(this);
        videoView2.setMediaController(mediaController);
        mediaController.setAnchorView(videoView2);
        videoView2.post(new Runnable() {
            @Override
            public void run() {
                mediaController.show(2000);
            }
        });
    }
}
