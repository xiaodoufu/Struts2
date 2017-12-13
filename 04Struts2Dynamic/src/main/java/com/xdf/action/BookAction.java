package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

    public  String add(){
        System.out.println("进入了 图书的 add");
        return "add";
    }
    public  String delete(){
        System.out.println("进入了 图书的 del");
        return "delSuccess";
    }
    public  String update(){
        System.out.println("进入了 图书的 update");
        return SUCCESS;
    }
    public  String find(){
        System.out.println("进入了 图书的 find");
        return SUCCESS;
    }

    public  String BookAction_update(){
        System.out.println("进入了 图书的 BookAction_update");
        return SUCCESS;
    }
}
