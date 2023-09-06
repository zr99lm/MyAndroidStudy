package com.zr.myapplication.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.zr.myapplication.ListView.ItemBean;
import com.zr.myapplication.ListView.fragment.RecyleListViewFragment;
import com.zr.myapplication.ListView.myView.MyListView;
import com.zr.myapplication.R;
import com.zr.myapplication.databinding.FragmentScrollViewTestBinding;
import com.zr.myapplication.ListView.myView.MyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ScrollViewTestFragment extends Fragment {

    private FragmentScrollViewTestBinding binding;

    @InjectView(R.id.test_view_pager)
    ViewPager viewPager;

    @InjectView(R.id.click_text_view_in_sv)
    TextView textView;

    @InjectView(R.id.lv_in_sv)
    MyListView listView;

    @InjectView(R.id.rv_in_sv)
    RecyclerView recycleView;

    private ImageView[] imgs;
    private List<String> mStringList;
    private List<ItemBean> itemList;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_scroll_view_test, container, false);
        ButterKnife.inject(this, view);
        initData();
        textView.setOnClickListener(click -> Toast.makeText(getActivity(), "click textView", Toast.LENGTH_SHORT).show());
        viewPager.setAdapter(new PagerAdapter() {
            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                ImageView imgView = imgs[position];
                container.addView(imgView);
                return imgView;
            }

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView((View) object);
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return view == object;
            }

            @Override
            public int getCount() {
                return imgs.length;
            }
        });
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mStringList));
        recycleView.setAdapter(new RecyleListViewFragment.MyRecycleAdapter(getContext(), itemList));
        recycleView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void initData() {
        mStringList = new ArrayList<>();
        itemList = new ArrayList<ItemBean>();
        imgs = new ImageView[2];
        ImageView imageView1 = new ImageView(getActivity());
        ImageView imageView2 = new ImageView(getActivity());
        imageView1.setImageResource(R.mipmap.img_adaptive_verup01);
        imageView2.setImageResource(R.mipmap.img_adaptive_verup02);
        imgs[0] = imageView1;
        imgs[1] = imageView2;
        for (int i = 0; i < 50; i++) {
            ItemBean itemBean = new ItemBean(
                    R.mipmap.ic_launcher,
                    "Title " + (i + 1),
                    (i + 1) + " 条数据");
            itemList.add(itemBean);
            mStringList.add(i + 1 + "item");

        }
    }
}