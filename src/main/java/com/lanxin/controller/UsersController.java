package com.lanxin.controller;

import com.lanxin.error.MyResult;
import com.lanxin.service.ImUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyu on 2019/9/26.
 */

@RestController
@RequestMapping(value = "/users")
public class UsersController {


    @Autowired
    private ImUserService imUserService;


    /*通过用户名查询密码*/
    @RequestMapping(value = "/usernameselectpass")
    public MyResult usernameselectpass(String username){

        return imUserService.UsernameSelectPass(username);
    }

    /*通过用户名查询角色*/
    @RequestMapping(value = "/usernameselectrole")
    public MyResult usernameselectrole(String username){

        return imUserService.UsernameSelectRole(username);
    }

    /*通过用户名查询权限*/
    @RequestMapping(value = "/usernameselectpermission")
    public MyResult usernameselectpermission(String username){

        return imUserService.UsernameSelectPermission(username);
    }
}
