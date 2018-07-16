package com.midas.test.demo2;

import com.midas.test.demo1.SimpleDelegate;
import com.restse.themvp.databind.DataBinder;

/**
 * @author Dell
 * @time 2018/7/16 13:52
 * 设值器，将数据与视图显示绑定，会在数据改变时调用
 */
public class Demo2DataBinder implements DataBinder<SimpleDelegate, JavaBean> {
    @Override
    public void viewBindModel(SimpleDelegate viewDelegate, JavaBean data) {
        viewDelegate.setText(data.getName());
    }
}
