package com.lanxin.error;

/**
 * Created by liyu on 2019/9/26.
 */
public class MyResult {

    private Integer number;//错误码
    private String  errorname;//错误信息
    private Object  result;//返回类型


    //成功无返的时候
    public static MyResult ok(){
        MyResult myResult = new MyResult();
        myResult.setNumber(200);//对的
        myResult.setErrorname("操作成功");
        return myResult;
    }
    //成功有返的时候
    public static MyResult ok(Object obj){
        MyResult myResult = new MyResult();
        myResult.setNumber(200);//对的
        myResult.setErrorname("操作成功");
        myResult.setResult(obj);
        return myResult;
    }
    //失败的时候
    public static MyResult no(){
        MyResult myResult = new MyResult();
        myResult.setNumber(500);//错的
        myResult.setErrorname("操作失败");
        return myResult;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getErrorname() {
        return errorname;
    }

    public void setErrorname(String errorname) {
        this.errorname = errorname;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
