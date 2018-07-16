package com.midas.test.demo5;

import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.midas.test.R;
import com.restse.themvp.view.AppDelegate;
/**
 *
 *@author Dell
 *@time 2018/7/16 14:16
 *@description: Toolbar
 */
public class Demo5Delegate extends AppDelegate {

    @Override
    protected int getRootLayoutId() {
        return R.layout.activity_toolbar;
    }

    @Override
    public int getOptionsMenuId() {
        return R.menu.menu;
    }

    @Override
    public Toolbar getToolbar() {
        return get(R.id.toolbar);
    }
    public void setText(String text) {
        TextView textView = get(R.id.text);
        textView.setText(text);
    }
}
