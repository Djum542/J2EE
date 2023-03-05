package com.gdu.k14pm01.bean;

public class Users {
    private int user_id;
    private String user_mail;
    private String User_pass;
    public Users(int user_id, String user_mail, String user_pass) {
        this.user_id = user_id;
        this.user_mail = user_mail;
        User_pass = user_pass;
    }
    public Users() {
    }
    public int getUser_id() {
        return user_id;
    }
    public String getUser_mail() {
        return user_mail;
    }
    public String getUser_pass() {
        return User_pass;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }
    public void setUser_pass(String user_pass) {
        User_pass = user_pass;
    }
    
    
}
