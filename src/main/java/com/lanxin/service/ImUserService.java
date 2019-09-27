package com.lanxin.service;


import com.lanxin.error.MyResult;



/**
 * Created by liyu on 2019/9/26.
 */
public interface ImUserService {

    /*根据用户名查询密码*/
    public MyResult UsernameSelectPass(String username);

    /*根据用户名查询所属角色*/
    public MyResult UsernameSelectRole(String username);

    /*根据用户名查询所属权限*/
    public MyResult UsernameSelectPermission(String username);
}
