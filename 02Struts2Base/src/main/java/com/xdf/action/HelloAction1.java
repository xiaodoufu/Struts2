package com.xdf.action;

/**
 * 普通类   写一个execute() 返回值是 String 类型 即可
 */
public class HelloAction1 {   //  action  controller  servlet

    public   String  execute(){
        System.out.println("进入了 HelloAction1  的execute()");
        return  "success";
    }
}
