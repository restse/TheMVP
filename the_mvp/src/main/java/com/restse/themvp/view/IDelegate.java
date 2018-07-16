package com.restse.themvp.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author restse
 * @time 2018/7/16 10:54
 * @description: View delegate base class   视图层代理的接口协议
 */
public interface IDelegate {

    void create(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState);

    int getOptionsMenuId();

    Toolbar getToolbar();

    View getRootView();

    void initWidget();
}
