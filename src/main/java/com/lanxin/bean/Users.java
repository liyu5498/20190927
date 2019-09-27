package com.lanxin.bean;

/**
 * Created by liyu on 2019/9/26.
 */
public class Users {

    private Integer uid;
    private String username;//姓名
    private String pass;//密码
    private String pass_mw;//密令


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass_mw() {
        return pass_mw;
    }

    public void setPass_mw(String pass_mw) {
        this.pass_mw = pass_mw;
    }
}
