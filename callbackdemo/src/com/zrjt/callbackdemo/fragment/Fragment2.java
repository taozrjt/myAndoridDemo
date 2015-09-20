package com.zrjt.callbackdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zrjt.callbackdemo.R;

/**
 * Created by ${zrjt} on 2015/9/18.
 */
public class Fragment2 extends Fragment{
    public Fragment2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment2_layout,container,false);

        TextView textView= (TextView) v.findViewById(R.id.detail_fragment);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String ss=arguments.getString("info");
            textView.setText(ss);
        }

        return v;
    }
}
