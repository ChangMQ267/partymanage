package com.changmq.partymanager.domain;

public class Parent {
    private Integer pId;

    private Integer psId;

    private Integer nationId;

    private Integer userId;

    private String pName;

    private String pMobile;

    private String pQq;

    private Integer pGender;

    private String pRelation;

    private String pAddress;

    private String pCompanyName;

    private String pPbName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpMobile() {
        return pMobile;
    }

    public void setpMobile(String pMobile) {
        this.pMobile = pMobile == null ? null : pMobile.trim();
    }

    public String getpQq() {
        return pQq;
    }

    public void setpQq(String pQq) {
        this.pQq = pQq == null ? null : pQq.trim();
    }

    public Integer getpGender() {
        return pGender;
    }

    public void setpGender(Integer pGender) {
        this.pGender = pGender;
    }

    public String getpRelation() {
        return pRelation;
    }

    public void setpRelation(String pRelation) {
        this.pRelation = pRelation == null ? null : pRelation.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public String getpCompanyName() {
        return pCompanyName;
    }

    public void setpCompanyName(String pCompanyName) {
        this.pCompanyName = pCompanyName == null ? null : pCompanyName.trim();
    }

    public String getpPbName() {
        return pPbName;
    }

    public void setpPbName(String pPbName) {
        this.pPbName = pPbName == null ? null : pPbName.trim();
    }
}