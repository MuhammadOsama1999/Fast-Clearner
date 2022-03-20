package com.example.fastcleaner.PagerAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fastcleaner.Fragments.BatterySaver;
import com.example.fastcleaner.Fragments.CPUCooler;
import com.example.fastcleaner.Fragments.JunkCleaner;
import com.example.fastcleaner.Fragments.PhoneBooster;

/**
 * Created by intag pc on 2/12/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MyPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PhoneBooster tab1 = new PhoneBooster();
                return tab1;
            case 1:
                BatterySaver tab2 = new BatterySaver();
                return tab2;
            case 2:
                CPUCooler tab3 = new CPUCooler();
                return tab3;
            case 3:
                JunkCleaner tab4 = new JunkCleaner();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
