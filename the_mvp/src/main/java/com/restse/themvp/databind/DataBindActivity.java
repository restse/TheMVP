package com.restse.themvp.databind;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.restse.themvp.model.IModel;
import com.restse.themvp.presenter.ActivityPresenter;
import com.restse.themvp.view.IDelegate;

/**
 * @author Dell
 * @time 2018/7/16 13:11
 *
 * 集成数据-视图绑定的Activity基类(Presenter层)
 * @param <T> View层代理类
 */
public abstract class DataBindActivity<T extends IDelegate> extends ActivityPresenter<T> {

    protected DataBinder binder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = getDataBinder();
    }

    public abstract DataBinder getDataBinder();

    public <D extends IModel> void notifyModelChanged(D data) {
        if (binder != null) {
            binder.viewBindModel(viewDelegate, data);
        }
    }
}
