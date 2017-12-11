package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xdf.bean.User;

/**
 * 实现ModelDriven
 */
public class HelloAction2 extends ActionSupport implements ModelDriven {

    /**
     * 实体类的属性名必须和form表单中的name属性值一致
     */
    private User  user=new User();


    public  String  login(){
        System.out.println("进入了 login 方法");
        System.out.println("用户名是："+user.getUserName());
        System.out.println("密码是："+user.getPassword());
        return  SUCCESS;
    }

    public Object getModel() {
        return user;
    }
}
