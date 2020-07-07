package com.example.clinics;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlidePageAdapter extends FragmentStatePagerAdapter {
    Context mContext;

    public SlidePageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Home();
        } else if (position == 1) {
            return new FavFragment();
        } else if (position == 2) {
            return new ChatFragment();
        } else if (position == 3) {
            return new AppFragment();
        } else if (position == 4) {
            return new ShareFragment();
        } else {
            return new ProfileFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}