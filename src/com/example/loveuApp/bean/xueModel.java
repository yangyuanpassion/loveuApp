package com.example.loveuApp.bean;

/**
 * Created by dy on 2016/7/26.
 */
public class xueModel {


    private Integer XueId;
    private Integer UserId;
    private String XueInformation;
    private Integer GetUser;
    private String XueTime;
    private Integer State;
    private String XueArea;
    private String msg;
    private String UserPhoto;
    private String NickName;
    private Integer state;
    private int UserSex;
    private int num;

    public void setstate(Integer state){
        this.state = state;
    }
    public Integer getstate(){
        return state;
    }
    public String getUserPhoto() {
        return UserPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        UserPhoto = userPhoto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getUserSex() {
        return UserSex;
    }

    public void setUserSex(int userSex) {
        UserSex = userSex;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public xueModel(){

    }

    public xueModel(Integer getUser, String msg, Integer state, Integer userId, String xueArea, Integer xueId, String xueInformation, String xueTime) {
        GetUser = getUser;
        this.msg = msg;
        State = state;
        UserId = userId;
        XueArea = xueArea;
        XueId = xueId;
        XueInformation = xueInformation;
        XueTime = xueTime;
    }

    public Integer getGetUser() {
        return GetUser;
    }

    public void setGetUser(Integer getUser) {
        GetUser = getUser;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getXueArea() {
        return XueArea;
    }

    public void setXueArea(String xueArea) {
        XueArea = xueArea;
    }

    public Integer getXueId() {
        return XueId;
    }

    public void setXueId(Integer xueId) {
        XueId = xueId;
    }

    public String getXueInformation() {
        return XueInformation;
    }

    public void setXueInformation(String xueInformation) {
        XueInformation = xueInformation;
    }

    public String getXueTime() {
        return XueTime;
    }

    public void setXueTime(String xueTime) {
        XueTime = xueTime;
    }
}
