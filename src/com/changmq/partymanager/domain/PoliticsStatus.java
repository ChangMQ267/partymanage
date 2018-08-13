package com.changmq.partymanager.domain;

public class PoliticsStatus {
    private Integer psId;

    private String psName;

    private String psText;

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName == null ? null : psName.trim();
    }

    public String getPsText() {
        return psText;
    }

    public void setPsText(String psText) {
        this.psText = psText == null ? null : psText.trim();
    }
}