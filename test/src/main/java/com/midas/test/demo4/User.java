package com.midas.test.demo4;

import com.restse.themvp.model.IModel;
/**
 *
 *@author Dell
 *@time 2018/7/16 14:02
 *@description: User
 */
public class User implements IModel {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
