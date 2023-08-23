package com.zr.myapplication.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zr.myapplication.ListView.fragment.ArrayListViewTestFragment;

public class ListViewTabPagerAdapter extends FragmentPagerAdapter {

    private static final int LEARN_FRAGMENT_SIZE = 2;


    public ListViewTabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ArrayListViewTestFragment arrayListViewTestFragment = ArrayListViewTestFragment.newInstance();
        return arrayListViewTestFragment;
    }

    @Override
    public int getCount() {
        return LEARN_FRAGMENT_SIZE;
    }


}
