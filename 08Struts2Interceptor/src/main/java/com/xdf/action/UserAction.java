package com.xdf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xdf.bean.User;

import java.util.Map;

public class UserAction extends ActionSupport {

    private User  user;
    public String  login(){
     Map<String,Object> session= ActionContext.getContext().getSession();
     session.put("user",user);
       return  SUCCESS;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
