package com.xdf.action;

import com.opensymphony.xwork2.Action;

/**
 * 普通类 实现 Action接口
 *
 * Action接口 定义了  5个静态常量 和一个 execute()
 String SUCCESS = "success";
 String NONE = "none";
 String ERROR = "error";
 String INPUT = "input";
 String LOGIN = "login";
 *
 */
public class HelloAction2  implements Action {   //  action  controller  servlet

    public   String  execute(){
        System.out.println("进入了 HelloAction2  的execute()");
        return  SUCCESS;
    }
}
