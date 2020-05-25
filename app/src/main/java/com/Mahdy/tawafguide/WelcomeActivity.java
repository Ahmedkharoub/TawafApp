package com.Mahdy.tawafguide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

public class WelcomeActivity extends AppCompatActivity {
    private RelativeLayout logoview;
    private TextView logoname;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mediaPlayer = MediaPlayer.create(WelcomeActivity.this, R.raw.alsafawalmarwa);
        mediaPlayer.start();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.setVolume(0.8f, 0.8f);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayer.setVolume(0.6f, 0.6f);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mediaPlayer.setVolume(0.4f, 0.4f);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        mediaPlayer.setVolume(0.2f, 0.2f);
                                        handler.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                mediaPlayer.setVolume(0.0f, 0.0f);
                                                mediaPlayer.stop();
                                            }
                                        }, 250);
                                    }
                                }, 250);
                            }
                        }, 250);
                    }
                }, 250);
            }
        }, 10000);

        logoview = findViewById(R.id.logo_view);
        logoname = findViewById(R.id.logoName);
        logoview.setScaleY(0);
        logoview.setScaleX(0);
        logoview.animate()
                .scaleY(1)
                .scaleX(1)
                .setDuration(600)
                .setStartDelay(1000)
                .setInterpolator(new FastOutSlowInInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run () {
                        logoname.animate()
                                .translationY(0)
                                .alpha(1)
                                .setDuration(600)
                                .setStartDelay(200 + 600) // delay
                                .setInterpolator(new FastOutSlowInInterpolator())
                                .start();
                        logoview.animate()
                                .translationY(0)
                                .setDuration(600)
                                .setStartDelay(200 + 600)
                                .setInterpolator(new FastOutSlowInInterpolator())
                                .start();
                        logoview.animate()
                                .alpha(0)
                                .setDuration(400)
                                .setStartDelay(1500 + 1200)
                                .withEndAction(new Runnable() {
                                    @Override
                                    public void run () {
                                        finish();
                                        startActivity(new Intent(WelcomeActivity.this, SecondScreen.class));
                                    }
                                })
                                .start();
                    }
                })
                .start();
    }
}







