package com.zrjt.callbackdemo.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.zrjt.callbackdemo.R;
import com.zrjt.callbackdemo.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${zrjt} on 2015/9/18.
 */
public class Fragment1 extends Fragment implements AdapterView.OnItemClickListener {

    private CallBacks callBacks;
    private List<String> lists;

    public Fragment1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment1_layout,container,false);

        ListView listView= (ListView) v.findViewById(R.id.list_fragment);

        lists = new ArrayList<String>();

        lists.add("Android");
        lists.add("Ios");
        lists.add("html5");
        lists.add("大数据");
        lists.add("云计算");

        listView.setAdapter(new MyAdapter(getActivity(), lists));

        listView.setOnItemClickListener(this);

        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Bundle bundle=new Bundle();
        bundle.putString("info",lists.get(i).toString());
        callBacks.show(bundle);
    }


    public interface CallBacks{
        public void show(Bundle bundle);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callBacks= (CallBacks) activity;
    }
}
