package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private int id;
    private String phonenum;
    private String username;
    private String password;
    private String salt;
    private String dharmaname;
    private String province;
    private String city;
    private String sex;
    private String sign;
    private String headpic;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getDharmaname() {
        return dharmaname;
    }

    public void setDharmaname(String dharmaname) {
        this.dharmaname = dharmaname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
        super();
    }

    public User(int id, String phonenum, String username, String password, String salt, String dharmaname, String province, String city, String sex, String sign, String headpic, String status, Date date) {
        this.id = id;
        this.phonenum = phonenum;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.dharmaname = dharmaname;
        this.province = province;
        this.city = city;
        this.sex = sex;
        this.sign = sign;
        this.headpic = headpic;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phonenum='" + phonenum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", dharmaname='" + dharmaname + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", sex='" + sex + '\'' +
                ", sign='" + sign + '\'' +
                ", headpic='" + headpic + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
