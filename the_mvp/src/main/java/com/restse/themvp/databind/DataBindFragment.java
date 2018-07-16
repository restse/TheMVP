package com.restse.themvp.databind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.restse.themvp.model.IModel;
import com.restse.themvp.presenter.FragmentPresenter;
import com.restse.themvp.view.IDelegate;

/**
 * @param <T> View层代理类
 * @author Dell
 * @time 2018/7/16 13:18
 * <p>
 * 集成数据-视图绑定的Fragment基类(Presenter层)
 */
public abstract class DataBindFragment<T extends IDelegate> extends FragmentPresenter<T> {

    protected DataBinder binder;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binder = getDataBinder();
    }

    public abstract DataBinder getDataBinder();

    public <D extends IModel> void notifyModelChanged(D data) {
        if (binder != null) {
            binder.viewBindModel(viewDelegate, data);
        }
    }
}
