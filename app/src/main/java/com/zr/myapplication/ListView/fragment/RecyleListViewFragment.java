package com.zr.myapplication.ListView.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.zr.myapplication.ListView.ItemBean;
import com.zr.myapplication.ListView.MyAdapter;
import com.zr.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecyleListViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyleListViewFragment extends Fragment {

    private List<Map<String, Object>> mapList;

    private SimpleAdapter simpleAdapter;

    public RecyleListViewFragment() {
        // Required empty public constructor
    }

    public static RecyleListViewFragment newInstance() {
        return new RecyleListViewFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view_recycle, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_list_view_test);
        List<ItemBean> itemList = new ArrayList<ItemBean>();
        for (int i = 0; i < 50; i++) {
            ItemBean itemBean = new ItemBean();
            itemBean.setImg(R.mipmap.ic_launcher);
            itemBean.setTitle("Title " + (i + 1));
            itemBean.setText((i + 1) + " 条数据");
            itemList.add(itemBean);
        }
        return view;
    }

    public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {
        private List<ItemBean> itemBeanList;
        private LayoutInflater myLayoutInflater;
        private Context mContext;

        public MyRecycleAdapter(Context context, List<ItemBean> itemBeanList) {
            this.itemBeanList = itemBeanList;
            this.mContext = context;
            this.myLayoutInflater = LayoutInflater.from(mContext);
        }

        @Override
        public int getItemCount() {
            return itemBeanList.size();
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = myLayoutInflater.inflate(R.layout.layout_test_simple_list_item, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            ItemBean itemBean = itemBeanList.get(position);
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            myViewHolder.img.setImageResource(itemBean.getImg());
            myViewHolder.title.setText(itemBean.getTitle());
            myViewHolder.text.setText(itemBean.getText());
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            TextView title;
            TextView text;
            ImageView img;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                this.img = itemView.findViewById(R.id.image_view);
                this.title = itemView.findViewById(R.id.image_title);
                this.text = itemView.findViewById(R.id.image_text);
            }
        }
    }
}