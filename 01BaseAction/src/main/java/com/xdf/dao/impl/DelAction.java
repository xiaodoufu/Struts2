package com.xdf.dao.impl;

import com.xdf.dao.Action;

public class DelAction implements Action {


    public String execute() {
        System.out.println("进入了  DelAction ");
        return "success";
    }
}
