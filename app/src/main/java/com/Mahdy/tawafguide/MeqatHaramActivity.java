package com.Mahdy.tawafguide;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MeqatHaramActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener,Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener,Tab4.OnFragmentInteractionListener {

Toolbar toolbar;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meqat_haram);

       //collapsingToolbarLayout.setContentScrimColor(Color.parseColor("#00796B"));
        toolbar = findViewById(R.id.tool_bar);
        ViewPager viewPager = findViewById(R.id.view_pager);
        //viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),this);
        viewPager .setAdapter(adapter);


    }

    @Override

    public void onFragmentInteraction ( Uri uri ) {

    }
}
