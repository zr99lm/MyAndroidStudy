package com.zr.myapplication.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zr.myapplication.R;

import java.util.List;

import butterknife.InjectView;

public class MyAdapter extends BaseAdapter {

    private List<ItemBean> itemBeanList;

    private LayoutInflater inflater;

    private Context mContext;

    public MyAdapter(Context context, List<ItemBean> itemBeanList) {
        this.mContext = context;
        this.itemBeanList = itemBeanList;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return itemBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.layout_test_simple_list_item, parent, false);
        ImageView image = view.findViewById(R.id.image_view);
        TextView title = view.findViewById(R.id.image_title);
        TextView text = view.findViewById(R.id.image_text);
        image.setImageResource(itemBeanList.get(position).getImg());
        title.setText(itemBeanList.get(position).getTitle());
        text.setText(itemBeanList.get(position).getText());
        return view;
    }
}
