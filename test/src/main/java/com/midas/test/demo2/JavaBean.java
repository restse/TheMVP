package com.midas.test.demo2;

import com.restse.themvp.model.IModel;

/**
 * @author Dell
 * @time 2018/7/16 13:46
 *
 * 一个简单的javabean类
 * javabean必须实现Imodel接口
 */
public class JavaBean implements IModel {
    private String name;

    public JavaBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
