package com.zr.myapplication.ListView.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.zr.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListViewSimpleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListViewSimpleFragment extends Fragment {

    private List<Map<String, Object>> mapList;

    private SimpleAdapter simpleAdapter;

    public ListViewSimpleFragment() {
        // Required empty public constructor
    }

    public static ListViewSimpleFragment newInstance() {
        return new ListViewSimpleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view_simple, container, false);
        ListView listView = view.findViewById(R.id.simple_list_view_test);
        mapList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("img", R.mipmap.ic_launcher);
            map.put("title", "Title " + (i + 1));
            map.put("text", "这是第 " + (i + 1) + " 条数据");
            mapList.add(map);
        }
        simpleAdapter = new SimpleAdapter(getActivity(), mapList, R.layout.layout_test_simple_list_item, new String[]{"img", "title", "text"}, new int[]{R.id.image_view, R.id.image_title, R.id.image_text}
        );

        listView.setAdapter(simpleAdapter);

        return view;
    }
}