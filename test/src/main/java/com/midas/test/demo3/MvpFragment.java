package com.midas.test.demo3;

import android.view.View;

import com.midas.test.R;
import com.midas.test.demo1.SimpleDelegate;
import com.restse.themvp.presenter.FragmentPresenter;

/**
 * @author Dell
 * @time 2018/7/16 13:57
 * 这里就偷懒直接复用demo1里面的simpleDelegate视图代理了
 * 同样也说明了，我们可以不用做任何改变就把一个视图层的东西拿来复用
 */
public class MvpFragment extends FragmentPresenter<SimpleDelegate> implements View.OnClickListener {
    @Override
    protected Class<SimpleDelegate> getDelegateClass() {
        return SimpleDelegate.class;
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        viewDelegate.setOnClickListener(this,R.id.button1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                viewDelegate.setText("你点击了button");
                break;
        }
    }
}
