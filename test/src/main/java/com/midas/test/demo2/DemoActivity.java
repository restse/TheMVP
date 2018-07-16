package com.midas.test.demo2;

import android.view.View;

import com.midas.test.R;
import com.midas.test.demo1.SimpleDelegate;
import com.restse.themvp.databind.DataBindActivity;
import com.restse.themvp.databind.DataBinder;

/**
 * @author Dell
 * @time 2018/7/16 13:47
 * 这里就偷懒直接复用demo1里面的simpleDelegate视图代理了
 * 同样也说明了，我们可以不用做任何改变就把一个视图层的东西拿来复用
 */
public class DemoActivity extends DataBindActivity<SimpleDelegate> {

    JavaBean data = new JavaBean("天明");

    @Override
    protected Class<SimpleDelegate> getDelegateClass() {
        return SimpleDelegate.class;
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        //模拟数据改变(比如也可以写在网络请求成功的时候改变数据)
        viewDelegate.get(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setName("改变了哟");
                //通知数据发生了改变
                notifyModelChanged(data);
            }
        });
    }

    @Override
    public DataBinder getDataBinder() {
        return new Demo2DataBinder();
    }
}
