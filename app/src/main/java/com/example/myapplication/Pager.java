package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Юра on 11.12.2016.
 */

public class Pager extends FragmentStatePagerAdapter {

    private int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabMD();
            case 1:
                return new TabND();
            case 2:
                return new TabTB();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

