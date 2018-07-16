package com.midas.test.demo4;

import com.restse.themvp.databind.DataBinder;

/**
 * @author Dell
 * @time 2018/7/16 14:09
 * 设值器，将数据与视图显示绑定，会在数据改变时调用
 */
public class Demo4DataBinder implements DataBinder<FragmentDelegate, User> {
    @Override
    public void viewBindModel(FragmentDelegate viewDelegate, User user) {
        if (user != null && user.getAge() != null && user.getName() != null) {
            viewDelegate.setResult(user.getName(),user.getAge());
        }
    }
}
