package com.Mahdy.tawafguide;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class EhramActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehram);
        ViewPager viewPager = findViewById(R.id.ehram_vpager);
        EhramAdapter adapter = new EhramAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        CollapsingToolbarLayout coll = findViewById(R.id.coll);
        coll.setExpandedTitleColor(Color.TRANSPARENT);
    }

    class EhramAdapter extends FragmentStatePagerAdapter {

        public EhramAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new EhramPlaceFragment(R.drawable.abiar_ali, getString(R.string.textview8));
            } else if (position == 1) {
                return new EhramPlaceFragment(R.drawable.yalamlam, getString(R.string.textview10));
            }else if (position== 2){
                return new EhramPlaceFragment(R.drawable.miqaat_wadi_mahram1, getString(R.string.textview9));
            }else if (position == 3){
                return new EhramPlaceFragment(R.drawable.qarnu__l_man_zil, getString(R.string.textview11));
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
