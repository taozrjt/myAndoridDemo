package com.zrjt.callbackdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zrjt.callbackdemo.R;

import java.util.List;

/**
 * Created by ${zrjt} on 2015/9/18.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;

    private List<String> lists;

    public MyAdapter(Context context, List<String> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        int count=0;
        if (lists != null) {
            count=lists.size();
        }
        return count;
    }

    @Override
    public Object getItem(int i) {
        return lists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=null;
        if (view!=null){
            v=view;
        }
        v= LayoutInflater.from(context).inflate(R.layout.listview_layout,viewGroup,false);

        ViewHolder holder= (ViewHolder) v.getTag();
        if (holder == null) {
            holder=new ViewHolder();
            holder.textView= (TextView) v.findViewById(R.id.list_item);
            v.setTag(holder);
        }

        holder.textView.setText(lists.get(i).toString());

        return v;
    }

    private class ViewHolder{
        TextView textView;
    }
}
