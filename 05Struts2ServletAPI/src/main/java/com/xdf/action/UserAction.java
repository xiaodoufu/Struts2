package com.xdf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

public class UserAction extends ActionSupport {

    /**
    *   01.耦合的方式 获取 前台输入的值     不推荐使用
    public  String  login(){
       String userName= ServletActionContext.getRequest().getParameter("userName");
       String password= ServletActionContext.getRequest().getParameter("password");
       //放进作用域
        ServletActionContext.getRequest().setAttribute("userName",userName);
        ServletActionContext.getRequest().setAttribute("password",password);
        return   SUCCESS;
     }
     */


    /**
     * 02.解耦合
     *    struts2中把request   session  application 封装成了Map
     */

    private  String  userName;
    private  String  password;

    public String  login(){
        //获取request对象
        Map<String,Object>  request= (Map<String, Object>) ActionContext.getContext().get("request");
        // ActionContext.getContext().getSession();  获取session
        request.put("userName",userName);
        request.put("password",password);
        return   SUCCESS;
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
