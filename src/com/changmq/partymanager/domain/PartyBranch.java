package com.changmq.partymanager.domain;

public class PartyBranch {
    private Integer pbId;

    private String pbName;

    private String gpbName;

    private Integer allNum;

    private Integer activistNum;

    private Integer deveNum;

    private Integer probNum;

    private Integer partyNum;

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public String getPbName() {
        return pbName;
    }

    public void setPbName(String pbName) {
        this.pbName = pbName == null ? null : pbName.trim();
    }

    public String getGpbName() {
        return gpbName;
    }

    public void setGpbName(String gpbName) {
        this.gpbName = gpbName == null ? null : gpbName.trim();
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getActivistNum() {
        return activistNum;
    }

    public void setActivistNum(Integer activistNum) {
        this.activistNum = activistNum;
    }

    public Integer getDeveNum() {
        return deveNum;
    }

    public void setDeveNum(Integer deveNum) {
        this.deveNum = deveNum;
    }

    public Integer getProbNum() {
        return probNum;
    }

    public void setProbNum(Integer probNum) {
        this.probNum = probNum;
    }

    public Integer getPartyNum() {
        return partyNum;
    }

    public void setPartyNum(Integer partyNum) {
        this.partyNum = partyNum;
    }
}