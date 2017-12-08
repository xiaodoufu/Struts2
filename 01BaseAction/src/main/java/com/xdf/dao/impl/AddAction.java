package com.xdf.dao.impl;

import com.xdf.dao.Action;

public class AddAction implements Action {


    public String execute() {
        System.out.println("进入了  AddAction ");
        return "success";
    }
}
