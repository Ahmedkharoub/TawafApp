package com.Mahdy.tawafguide;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ZoElhejjaActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zo_elhejja);
        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
    }
}
