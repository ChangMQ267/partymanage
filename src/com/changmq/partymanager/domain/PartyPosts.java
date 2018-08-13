package com.changmq.partymanager.domain;

public class PartyPosts {
    private Integer ppId;

    private String ppName;

    private String ppText;

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName == null ? null : ppName.trim();
    }

    public String getPpText() {
        return ppText;
    }

    public void setPpText(String ppText) {
        this.ppText = ppText == null ? null : ppText.trim();
    }
}