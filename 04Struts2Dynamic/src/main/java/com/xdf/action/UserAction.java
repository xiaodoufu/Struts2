package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction  extends ActionSupport{  //动态方法调用需要的action

    public  String add(){
        System.out.println("进入了 用户的 add");
        return SUCCESS;
    }
    public  String del(){
        System.out.println("进入了 用户的 del");
        return SUCCESS;
    }
    public  String update(){
        System.out.println("进入了 用户的 update");
        return SUCCESS;
    }
    public  String find(){
        System.out.println("进入了 用户的 find");
        return SUCCESS;
    }
}
