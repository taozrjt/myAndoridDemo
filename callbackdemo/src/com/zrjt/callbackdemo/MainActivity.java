package com.zrjt.callbackdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.zrjt.callbackdemo.fragment.Fragment1;
import com.zrjt.callbackdemo.fragment.Fragment2;

public class MainActivity extends FragmentActivity implements Fragment1.CallBacks {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        getSupportFragmentManager().beginTransaction().replace(R.id.main_list, new Fragment1()).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_detail, new Fragment2()).commit();

    }


    @Override
    public void show(Bundle bundle) {
        Fragment2 fragment2 = new Fragment2();
        fragment2.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_detail, fragment2).commit();
    }
}
