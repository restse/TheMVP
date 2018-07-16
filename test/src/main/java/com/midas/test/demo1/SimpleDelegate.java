package com.midas.test.demo1;

import android.widget.TextView;

import com.midas.test.R;
import com.restse.themvp.view.AppDelegate;

/**
 * @author Dell
 * @time 2018/7/16 13:39
 * View视图层，完全移除与Presenter业务逻辑的耦合
 */
public class SimpleDelegate extends AppDelegate {
    @Override
    protected int getRootLayoutId() {
        return R.layout.delegate_simple;
    }

    @Override
    public void initWidget() {
        super.initWidget();
        TextView textView = get(R.id.text);
        textView.setText("在视图代理层创建布局");
    }
    public void setText(String text){
        //get(id)等同于bindview(id)
        TextView textView = get(R.id.text);
        textView.setText(text);
    }
}
