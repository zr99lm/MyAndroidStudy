package com.zr.myapplication.ListView.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.zr.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListViewCustomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListViewCustomFragment extends Fragment {

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
        View view = inflater.inflate(R.layout.fragment_list_view_custom, container, false);
        ListView listView = view.findViewById(R.id.custom_list_view_test);
        return view;
    }
}