package com.Mahdy.tawafguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class HajjActivity extends AppCompatActivity {
    private Button day1;
    private Button day2;
    private Button day3;
    private Button day4;
    private Button day5;
    private Button button6;
    private TextView text;
    private TextView text2;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);
        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
        day1=findViewById(R.id.button1);
        day2=findViewById(R.id.button3);
        day3=findViewById(R.id.button2);
        day4=findViewById(R.id.button4);
        day5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        text = findViewById(R.id.type);
        text2 = findViewById(R.id.hajj_type);


        text2.animate()
                .alpha(1)
                .setDuration(600)
                .setStartDelay(200)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();

        text.animate()
                .alpha(1)
                .setDuration(700)
                .setStartDelay(300)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();

    }
    public void openday1( View view ){


                Intent day1 = new Intent(HajjActivity.this,TawreaActivity.class);
                startActivity(day1);



    }
    public void openday2( View view ){


                Intent day2 = new Intent(HajjActivity.this,ArafaActivity.class);
                startActivity(day2);
            }



    public void openday3( View view ){

                Intent day3 = new Intent(HajjActivity.this,MozdalefaActivity.class);
                startActivity(day3);

    }
    public void openday4( View view ){

                Intent day4 = new Intent(HajjActivity.this,ZoElhejjaActivity.class);
        startActivity(day4);

    }
    public void openday5( View view ){

                Intent day5 = new Intent(HajjActivity.this,TashreqActivity.class);

        startActivity(day5);
    }
    public void openbutton6( View view ){

                Intent button6 = new Intent(HajjActivity.this,TashreActivity.class);
                startActivity(button6);


    }
}
