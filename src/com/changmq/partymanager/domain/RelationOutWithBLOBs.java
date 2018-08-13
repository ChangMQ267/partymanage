package com.changmq.partymanager.domain;

public class RelationOutWithBLOBs extends RelationOut {
    private String workName;

    private String rOutPmReceive;

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public String getrOutPmReceive() {
        return rOutPmReceive;
    }

    public void setrOutPmReceive(String rOutPmReceive) {
        this.rOutPmReceive = rOutPmReceive == null ? null : rOutPmReceive.trim();
    }
}