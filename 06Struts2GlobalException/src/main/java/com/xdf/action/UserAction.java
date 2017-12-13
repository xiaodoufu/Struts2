package com.xdf.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;

public class UserAction extends ActionSupport {

    public   String add() throws NullPointerException {
        System.out.println("进入了add");
        if (true){
                throw  new NullPointerException();
        }
        return  SUCCESS;

    }

    public   String del() throws SQLException {
        System.out.println("进入了del");
        if (true){
                throw  new SQLException();
        }
        return  SUCCESS;
    }

}
