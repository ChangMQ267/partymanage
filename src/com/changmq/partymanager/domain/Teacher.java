package com.changmq.partymanager.domain;

import java.util.Date;

public class Teacher {
    private Integer userId;

    private Integer pbId;

    private Integer psId;

    private Integer paId;

    private Integer pmId;

    private Integer nationId;

    private String userName;

    private String password;

    private String email;

    private String moblie;

    private String qq;

    private Boolean userState;

    private Integer userType;

    private Integer gender;

    private Integer ppId;

    private String tNo;

    private Boolean tAdmin;

    private Integer tAge;

    private Date tBirthday;

    private Date tWorkStartTime;

    private String tEducation;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie == null ? null : moblie.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Boolean getUserState() {
        return userState;
    }

    public void setUserState(Boolean userState) {
        this.userState = userState;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo == null ? null : tNo.trim();
    }

    public Boolean gettAdmin() {
        return tAdmin;
    }

    public void settAdmin(Boolean tAdmin) {
        this.tAdmin = tAdmin;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public Date gettBirthday() {
        return tBirthday;
    }

    public void settBirthday(Date tBirthday) {
        this.tBirthday = tBirthday;
    }

    public Date gettWorkStartTime() {
        return tWorkStartTime;
    }

    public void settWorkStartTime(Date tWorkStartTime) {
        this.tWorkStartTime = tWorkStartTime;
    }

    public String gettEducation() {
        return tEducation;
    }

    public void settEducation(String tEducation) {
        this.tEducation = tEducation == null ? null : tEducation.trim();
    }
}