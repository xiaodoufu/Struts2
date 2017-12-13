package com.xdf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * 实现对应的接口 从而达到我们 向作用域传递值的目的！
 * SessionAware
 */
public class UserAction2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

    private  String  userName;
    private  String  password;
    private   Map<String, Object> request;
    private   Map<String, Object> session;
    private   Map<String, Object> application;
    public void setApplication(Map<String, Object> application) {
        this.application=application;
    }

    public void setSession(Map<String, Object> session) {
        this.session=session;
    }

    public void setRequest(Map<String, Object> request) {
    this.request=request;
    }


    public String  login(){
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
