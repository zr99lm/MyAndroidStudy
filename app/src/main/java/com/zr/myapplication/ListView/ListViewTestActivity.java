package com.zr.myapplication.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.zr.myapplication.ListView.ListViewTabPagerAdapter;
import com.zr.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewTestActivity extends AppCompatActivity {
    ViewPager viewPager;

    private List<String> mStringList;

    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);
        viewPager = findViewById(R.id.list_view_test_view_pager);
        pagerAdapter = new ListViewTabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

}