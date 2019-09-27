package com.lanxin.service;

import com.lanxin.bean.User_Roles;
import com.lanxin.bean.Users;
import com.lanxin.dao.UsersDao;
import com.lanxin.error.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by liyu on 2019/9/26.
 */

@Service
public class UserServiceClass implements ImUserService{


    @Autowired
    private UsersDao usersDao;


    @Override/*通过用户名查询密码*/
    public MyResult UsernameSelectPass(String username) {

        Users users=usersDao.getPassWordByUsername(username);

        return MyResult.ok(users);
    }

    @Override/*通过用户名查询角色*/
    public MyResult UsernameSelectRole(String username) {

        List<User_Roles> user_rolesList=usersDao.getRolesByUsernae(username);

        return MyResult.ok(user_rolesList);
    }

    @Override/*通过用户名查询权限*/
    public MyResult UsernameSelectPermission(String username) {

        List<User_Roles> user_rolesList=usersDao.getPermissionByUsername(username);

        return MyResult.ok(user_rolesList);
    }
}
