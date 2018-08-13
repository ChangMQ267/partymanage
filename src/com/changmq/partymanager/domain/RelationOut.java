package com.changmq.partymanager.domain;

import java.util.Date;

public class RelationOut {
    private Integer rOutId;

    private Integer pmId;

    private Date rOutDuesEnd;

    private Date outflowDate;

    public Integer getrOutId() {
        return rOutId;
    }

    public void setrOutId(Integer rOutId) {
        this.rOutId = rOutId;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Date getrOutDuesEnd() {
        return rOutDuesEnd;
    }

    public void setrOutDuesEnd(Date rOutDuesEnd) {
        this.rOutDuesEnd = rOutDuesEnd;
    }

    public Date getOutflowDate() {
        return outflowDate;
    }

    public void setOutflowDate(Date outflowDate) {
        this.outflowDate = outflowDate;
    }
}