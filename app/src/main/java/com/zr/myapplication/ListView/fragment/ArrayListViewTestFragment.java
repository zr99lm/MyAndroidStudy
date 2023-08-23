package com.zr.myapplication.ListView.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zr.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ArrayListViewTestFragment extends Fragment {

    ListView listView;

    private List<String> mStringList;

    private ArrayAdapter<String> arrayAdapter;

    public ArrayListViewTestFragment() {
        // Required empty public constructor
    }

    public static ArrayListViewTestFragment newInstance() {
        ArrayListViewTestFragment fragment = new ArrayListViewTestFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_array_list_view_test, container, false);
        ListView arrayListView = view.findViewById(R.id.array_list_view_test);
        initData();
        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mStringList);
        arrayListView.setAdapter(arrayAdapter);
        return view;
    }

    private void initData() {
        mStringList = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            mStringList.add(i + 1 + "item");
        }
    }
}