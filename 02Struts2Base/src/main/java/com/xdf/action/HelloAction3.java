package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 普通类  继承  ActionSupport类
 */
public class HelloAction3 extends ActionSupport {   //  action  controller  servlet

    public   String  execute(){
        System.out.println("进入了 HelloAction3  的execute()");
        return  "success";
    }
}
