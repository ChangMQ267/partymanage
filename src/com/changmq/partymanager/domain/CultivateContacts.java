package com.changmq.partymanager.domain;

import java.util.Date;
/**
 * 
 * @ClassName CultivateContacts
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class CultivateContacts {
    private Integer ccId;

    private Integer paId;

    private Integer userId;

    private Date startDate;

    private Date endDate;

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}