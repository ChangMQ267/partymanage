package com.changmq.partymanager.domain;

import java.util.Date;

public class Student {
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

    private Integer classId;

    private String sNo;

    private Integer sAge;

    private Date sBirthday;

    private String sBirthPlace;

    private String sNativePlace;

    private String sAddress;

    private Date sCylcDate;

    private String sEducation;

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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo == null ? null : sNo.trim();
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public String getsBirthPlace() {
        return sBirthPlace;
    }

    public void setsBirthPlace(String sBirthPlace) {
        this.sBirthPlace = sBirthPlace == null ? null : sBirthPlace.trim();
    }

    public String getsNativePlace() {
        return sNativePlace;
    }

    public void setsNativePlace(String sNativePlace) {
        this.sNativePlace = sNativePlace == null ? null : sNativePlace.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public Date getsCylcDate() {
        return sCylcDate;
    }

    public void setsCylcDate(Date sCylcDate) {
        this.sCylcDate = sCylcDate;
    }

    public String getsEducation() {
        return sEducation;
    }

    public void setsEducation(String sEducation) {
        this.sEducation = sEducation == null ? null : sEducation.trim();
    }
}