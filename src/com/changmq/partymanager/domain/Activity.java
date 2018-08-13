package com.changmq.partymanager.domain;

import java.util.Date;
/**
 * 
 * @ClassName Activity
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class Activity {
	/**
	 * 
	 */
    private Integer aId;

    private Integer userId;

    private Integer pbId;

    private String aName;

    private Date aDate;

    private Integer aPersonNum;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

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

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public Integer getaPersonNum() {
        return aPersonNum;
    }

    public void setaPersonNum(Integer aPersonNum) {
        this.aPersonNum = aPersonNum;
    }

	@Override
	public String toString() {
		return "Activity [aId=" + aId + ", userId=" + userId + ", pbId=" + pbId + ", aName=" + aName + ", aDate="
				+ aDate + ", aPersonNum=" + aPersonNum + ", getaId()=" + getaId() + ", getUserId()=" + getUserId()
				+ ", getPbId()=" + getPbId() + ", getaName()=" + getaName() + ", getaDate()=" + getaDate()
				+ ", getaPersonNum()=" + getaPersonNum() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}