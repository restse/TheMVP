package com.midas.test.demo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.midas.test.R;

/**
 * @author Dell
 * @time 2018/7/16 13:53
 * 为了说明MVPFragment用法而存在，一个普通Activity外壳，
 */
public class ShellActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);
        getSupportFragmentManager().beginTransaction().replace(R.id.content,new MvpFragment())
                .commit();
    }
}
