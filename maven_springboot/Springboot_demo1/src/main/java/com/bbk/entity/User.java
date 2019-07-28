package com.bbk.entity;

public class User {
    /**
     * 用户id
     */
    private Integer uId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户年龄
     */
    private Integer userAge;
    /**
     * 城市
     */
    private String city;
    /**
     * 爱好
     */
    private  String hobby;

    /**
     * 状态
     */
    private Integer status;

    public User() {
    }

    public User(Integer uId, String userName, String userPassword, Integer userAge, String city, String hobby, Integer status) {
        this.uId = uId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAge = userAge;
        this.city = city;
        this.hobby = hobby;
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                ", city='" + city + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
