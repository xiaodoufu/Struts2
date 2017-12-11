package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xdf.bean.User;


public class HelloAction3 extends ActionSupport {

    /**
     * 实体类的属性名必须和form表单中的name属性值一致
     * 对象必须有set和get
     *
     * 前提form中的name属性值 必须是 user.userName  user.password
     */
    private User  user;


    public  String  login(){
        System.out.println("进入了 login 方法");
        System.out.println("用户名是："+user.getUserName());
        System.out.println("密码是："+user.getPassword());
        return  SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
