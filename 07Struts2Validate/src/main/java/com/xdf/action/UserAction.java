package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xdf.bean.User;
import org.apache.commons.lang3.StringUtils;

/**
 * 使用xml文件验证方法
 *
 * ActionClassName-validation.xml　全局验证
 * UserAction-validation.xml
 *
 * ActionClassName-ActionName-validation.xml  局部验证
 * ActionName 是struts.xml文件中  action的name属性值
 *
 */
public class UserAction  extends ActionSupport {

    private User user;

    public String  login(){  //用户登录的方法
        System.out.println("进入了  login");
        if (hasErrors()){
            return  INPUT;
        }
        return   SUCCESS;
    }

    /**
     * 重写父类的验证方法  全局验证

    public  void  validate(){
        System.out.println("进入了  validate");
        if (StringUtils.isBlank(user.getName())){
            addFieldError("user.name","用户名不能为空");
        }
        if (StringUtils.isBlank(user.getPassword())){
            addFieldError("user.password","密码不能为空");
        }
    }*/

    /**
     * 验证指定的方法
     * 验证方法名的规范是 validate+方法首字母大写

    public  void  validateLogin(){
        System.out.println("进入了  validateLogin ");
        if (StringUtils.isBlank(user.getName())){
            addFieldError("user.name","用户名不能为空");
        }
        if (StringUtils.isBlank(user.getPassword())){
            addFieldError("user.password","密码不能为空");
        }
    }*/



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
