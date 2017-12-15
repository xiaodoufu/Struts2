package com.xdf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xdf.bean.User;

public class LoginAction  extends ActionSupport {


    public  String login(){
        System.out.println("进入了   loginAction");
        User user= (User) ActionContext.getContext().getSession().get("user");
        System.out.println(user);
        return   SUCCESS;
    }
}
