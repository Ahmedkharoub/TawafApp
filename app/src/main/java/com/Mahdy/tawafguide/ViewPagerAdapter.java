package com.Mahdy.tawafguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;


    public ViewPagerAdapter ( @NonNull FragmentManager fm ,Context context ) {
        super(fm);
        mContext = context;

    }

    @NonNull
    @Override
    public Fragment getItem ( int position ) {
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;
            default:
                return null;
        }
    }



    @Override
    public int getCount () {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.textview8);
            case 1:
                return mContext.getString(R.string.textview9);
            case 2:
                return mContext.getString(R.string.textview10);
            case 3:
                return mContext.getString(R.string.textview11);
            default:
                return null;
        }
    }
}
