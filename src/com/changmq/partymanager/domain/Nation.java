package com.changmq.partymanager.domain;
/**
 * 
 * @ClassName Nation
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class Nation {
    private Integer nationId;

    private String nationName;

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }
}