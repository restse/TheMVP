package com.midas.test.demo1;

import android.view.View;

import com.midas.test.R;
import com.restse.themvp.presenter.ActivityPresenter;
/**
 *
 *@author Dell
 *@time 2018/7/16 13:41
 * 在这里做业务逻辑操作，通过viewDelegate操作View层控件
 */
public class SimpleActivity extends ActivityPresenter<SimpleDelegate> implements View.OnClickListener {

    @Override
    protected Class<SimpleDelegate> getDelegateClass() {
        return SimpleDelegate.class;
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        //可以同时对多个控件设置同一个点击事件,后面id参数可以传多个
        viewDelegate.setOnClickListener(this, R.id.button1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                viewDelegate.setText("你点击了button");
                break;
        }
    }
}
