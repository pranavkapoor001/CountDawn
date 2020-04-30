package com.app.pk.HelFit;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPageAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;
    public MyPageAdapter(FragmentManager fm,int numberOfTabs){

        super(fm);
        this.noOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0: return new Profile();
            case 1: return new Home();
            case 2: return new Steps();
        }
        return null;
    }

    @Override
    public int getCount(){
        return noOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
        case 0: return "Profile";
        case 1: return "Home";
        case 2: return "Steps";
        default: return null;
    }
    }
}
