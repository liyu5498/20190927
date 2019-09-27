package com.lanxin.bean;

/**
 * Created by liyu on 2019/9/26.
 */
public class Roles_Permissions {

    private Integer pid;
    private String role_name;//角色
    private String permission;//权限


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
