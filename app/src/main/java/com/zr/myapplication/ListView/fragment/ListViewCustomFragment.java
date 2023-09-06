package com.zr.myapplication.ListView.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.fragment.app.Fragment;

import com.zr.myapplication.ListView.ItemBean;
import com.zr.myapplication.ListView.MyAdapter;
import com.zr.myapplication.ListView.myView.MyListView;
import com.zr.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListViewCustomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListViewCustomFragment extends Fragment {

    private List<ItemBean> itemBeanList;

    private SimpleAdapter simpleAdapter;

    @InjectView(R.id.simple_list_view_test)
    MyListView listView;

    public ListViewCustomFragment() {
        // Required empty public constructor
    }

    public static ListViewCustomFragment newInstance() {
        return new ListViewCustomFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view_simple, container, false);
//        ButterKnife.inject(this, view);
//        itemBeanList = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            itemBeanList.add(new ItemBean(R.mipmap.ic_launcher, (i + 1) + "title", (i + 1) + "数据"));
//        }
//        MyAdapter myAdapter = new MyAdapter(getContext(), itemBeanList);
//        listView.setAdapter(myAdapter);
        return view;
    }
}