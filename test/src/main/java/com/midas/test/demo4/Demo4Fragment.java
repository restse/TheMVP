package com.midas.test.demo4;

import android.view.View;

import com.midas.test.R;
import com.restse.themvp.databind.DataBindFragment;
import com.restse.themvp.databind.DataBinder;

/**
 * @author Dell
 * @time 2018/7/16 14:07
 * @description: Demo4Fragment
 */
public class Demo4Fragment extends DataBindFragment<FragmentDelegate> {
    private User data = new User();

    @Override
    protected Class<FragmentDelegate> getDelegateClass() {
        return FragmentDelegate.class;
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
        viewDelegate.get(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setName(viewDelegate.getText(R.id.editText));
                data.setAge(viewDelegate.getText(R.id.editText2));
                notifyModelChanged(data);
            }
        });
    }

    @Override
    public DataBinder getDataBinder() {
        return new Demo4DataBinder();
    }
}
