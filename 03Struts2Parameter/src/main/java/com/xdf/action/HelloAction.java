package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 直接在action中书写对应的成员变量，变量名要和前端form表中中的name属性值一致！
 * 成员变量要有对应的set 和get
 */
public class HelloAction  extends ActionSupport {

    private  String  userName;  //用户名
    private  String  password;  //密码

    public  String  login(){
        System.out.println("进入了 login 方法");
        System.out.println(userName);
        System.out.println(password);
        return  SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
