package com.midas.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.midas.test.demo1.SimpleActivity;
import com.midas.test.demo2.DemoActivity;
import com.midas.test.demo3.ShellActivity;
import com.midas.test.demo4.Shell4Activity;
import com.midas.test.demo5.Demo5Activity;
import com.midas.test.demo6.Demo6Activity;

/**
 *
 *@author Dell
 *@time 2018/7/16 13:34
 *@description: The Mvp练习
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, SimpleActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, DemoActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, ShellActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, Shell4Activity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this, Demo5Activity.class));
                break;
            case R.id.button6:
                startActivity(new Intent(this, Demo6Activity.class));
                break;
            default:
                break;
        }
    }
}
