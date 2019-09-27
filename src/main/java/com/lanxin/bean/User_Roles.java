package com.lanxin.bean;

/**
 * Created by liyu on 2019/9/26.
 */
public class User_Roles {

    private Integer rid;
    private String username;//姓名
    private String role_name;//角色

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
