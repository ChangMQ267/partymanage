package com.changmq.partymanager.domain;

import java.util.Date;

public class PartyMenber {
    private Integer pmId;

    private Integer rOutId;

    private String wyabNo;

    private Date joinDate;

    private Date jhcuDate;

    private Date formalDate;

    private Integer partyStanding;

    private String pmState;

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Integer getrOutId() {
        return rOutId;
    }

    public void setrOutId(Integer rOutId) {
        this.rOutId = rOutId;
    }

    public String getWyabNo() {
        return wyabNo;
    }

    public void setWyabNo(String wyabNo) {
        this.wyabNo = wyabNo == null ? null : wyabNo.trim();
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getJhcuDate() {
        return jhcuDate;
    }

    public void setJhcuDate(Date jhcuDate) {
        this.jhcuDate = jhcuDate;
    }

    public Date getFormalDate() {
        return formalDate;
    }

    public void setFormalDate(Date formalDate) {
        this.formalDate = formalDate;
    }

    public Integer getPartyStanding() {
        return partyStanding;
    }

    public void setPartyStanding(Integer partyStanding) {
        this.partyStanding = partyStanding;
    }

    public String getPmState() {
        return pmState;
    }

    public void setPmState(String pmState) {
        this.pmState = pmState == null ? null : pmState.trim();
    }
}