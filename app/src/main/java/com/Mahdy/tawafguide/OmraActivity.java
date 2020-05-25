package com.Mahdy.tawafguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class OmraActivity extends AppCompatActivity {

    private Button ehram;
    private Button tawaf;
    private Button saie;
    private Button halq;
    private ImageView omrapic;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omra);
        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
        omrapic=findViewById(R.id.pic);
        //PhotoViewAttacher photoViewAttacher =new PhotoViewAttacher(omrapic);
        //photoViewAttacher.update();
        ehram=findViewById(R.id.third_word);
        tawaf=findViewById(R.id.five_word);
        saie=findViewById(R.id.four_word);
        halq=findViewById(R.id.six_word);
        ehram.animate()
                .alpha(1)
                .setDuration(700)
                .setStartDelay(500)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();
        tawaf.animate()
                .alpha(1)
                .setDuration(800)
                .setStartDelay(600)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();
        saie.animate()
                .alpha(1)
                .setDuration(900)
                .setStartDelay(700)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();
        halq.animate()
                .alpha(1)
                .setDuration(1000)
                .setStartDelay(800)
                .setInterpolator(new FastOutSlowInInterpolator())
                .start();

    }

    public void openehram( View view ){

        Intent ehram = new Intent(OmraActivity.this,EhramActivity.class);
        startActivity(ehram);

    }
    public void opentawaf( View view ){



        Intent tawaf = new Intent(OmraActivity.this,TawafActivity.class);
        startActivity(tawaf);
    }
    public void opensaie( View view ){


        Intent saie = new Intent(OmraActivity.this,SaieActivity.class);
        startActivity(saie);
    }
    public void openhalq( View view ){

        Intent halq = new Intent(OmraActivity.this,HalqActivity.class);
        startActivity(halq);
    }
}
