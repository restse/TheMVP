package com.midas.test.demo4;

import android.widget.EditText;
import android.widget.TextView;

import com.midas.test.R;
import com.restse.themvp.view.AppDelegate;
/**
 *
 *@author Dell
 *@time 2018/7/16 14:06
 *@description: FragmentDelegate
 */
public class FragmentDelegate extends AppDelegate {
    @Override
    protected int getRootLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    public void initWidget() {
        super.initWidget();
        EditText et = get(R.id.editText);
        EditText et2 = get(R.id.editText2);
        et.setHint("姓名");
        et2.setHint("年龄");
    }
    public String getText(int id) {
        EditText et = get(id);
        return et.getText().toString();
    }

    public void setResult(String name, String age) {
        TextView textView = get(R.id.text);
        textView.setText(String.format("姓名: %s   年龄 : %s", name, age));
    }
}
