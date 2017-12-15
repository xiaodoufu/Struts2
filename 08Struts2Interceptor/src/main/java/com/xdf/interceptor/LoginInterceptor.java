package com.xdf.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.xdf.bean.User;

public class LoginInterceptor implements Interceptor {


    public void init() {
        System.out.println("拦截器的init**************************");

    }

    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("进入了拦截器的intercept******************");
       User  user= (User) ActionContext.getContext().getSession().get("user");
       if (user!=null){
           return   invocation.invoke();
       }
        return  "error";
    }

    public void destroy() {
        System.out.println("拦截器的destroy**************************");
    }
}
