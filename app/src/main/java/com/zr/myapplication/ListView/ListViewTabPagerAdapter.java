package com.zr.myapplication.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zr.myapplication.ListView.fragment.ArrayListViewTestFragment;
import com.zr.myapplication.ListView.fragment.ListViewCustomFragment;
import com.zr.myapplication.ListView.fragment.ListViewSimpleFragment;

public class ListViewTabPagerAdapter extends FragmentPagerAdapter {

    private static final int LEARN_FRAGMENT_SIZE = 3;


    public ListViewTabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ArrayListViewTestFragment arrayListViewTestFragment = ArrayListViewTestFragment.newInstance();
                return arrayListViewTestFragment;
            case 1:
                ListViewSimpleFragment listViewSimpleFragment = ListViewSimpleFragment.newInstance();
                return listViewSimpleFragment;
            case 2:
                ListViewCustomFragment listViewCustomFragment = ListViewCustomFragment.newInstance();
                return listViewCustomFragment;
            default:
                ArrayListViewTestFragment defaultFragment = ArrayListViewTestFragment.newInstance();
                return defaultFragment;
        }
    }

    @Override
    public int getCount() {
        return LEARN_FRAGMENT_SIZE;
    }


}
