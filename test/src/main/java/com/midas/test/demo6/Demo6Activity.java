package com.midas.test.demo6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.midas.test.R;
import com.midas.test.demo1.SimpleDelegate;
import com.restse.themvp.presenter.ActivityPresenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * @author Dell
 * @time 2018/7/16 14:24
 * 使用EvenBus实现简易数据绑定
 */
public class Demo6Activity extends ActivityPresenter<SimpleDelegate> {
    @Override
    protected Class<SimpleDelegate> getDelegateClass() {
        return SimpleDelegate.class;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        viewDelegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Demo6Data data = new Demo6Data();
                data.setName("点击修改了名字");
            }
        }, R.id.button1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Demo6Data data) {
        viewDelegate.setText(data.getName());
    }
}
