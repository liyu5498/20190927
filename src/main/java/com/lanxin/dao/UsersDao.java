package com.lanxin.dao;

import com.lanxin.bean.User_Roles;
import com.lanxin.bean.Users;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;


/**
 * Created by liyu on 2019/9/26.
 */
@Mapper
public interface UsersDao {

    /*根据用户名查询密码*/
     Users getPassWordByUsername(String username);

    /*根据用户名查询所属角色*/
    List<User_Roles> getRolesByUsernae(String username);

    /*根据用户名查询所属权限*/
     List<User_Roles> getPermissionByUsername(String username);
}
