package com.changmq.partymanager.domain;

import java.util.Date;

public class PartyActivist {
    private Integer paId;

    private Date paApplyDate;

    private Date paAgreeDate;

    private Integer paReportNum;

    private Date paTrainingDate;

    private String paTy;

    private Date paTyDate;

    private Date talkDate;

    private Date prDate;

    private Date inspectDate;

    private Date preTrialDate;

    private Date pubStartDate;

    private Date pubEndDate;

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public Date getPaApplyDate() {
        return paApplyDate;
    }

    public void setPaApplyDate(Date paApplyDate) {
        this.paApplyDate = paApplyDate;
    }

    public Date getPaAgreeDate() {
        return paAgreeDate;
    }

    public void setPaAgreeDate(Date paAgreeDate) {
        this.paAgreeDate = paAgreeDate;
    }

    public Integer getPaReportNum() {
        return paReportNum;
    }

    public void setPaReportNum(Integer paReportNum) {
        this.paReportNum = paReportNum;
    }

    public Date getPaTrainingDate() {
        return paTrainingDate;
    }

    public void setPaTrainingDate(Date paTrainingDate) {
        this.paTrainingDate = paTrainingDate;
    }

    public String getPaTy() {
        return paTy;
    }

    public void setPaTy(String paTy) {
        this.paTy = paTy == null ? null : paTy.trim();
    }

    public Date getPaTyDate() {
        return paTyDate;
    }

    public void setPaTyDate(Date paTyDate) {
        this.paTyDate = paTyDate;
    }

    public Date getTalkDate() {
        return talkDate;
    }

    public void setTalkDate(Date talkDate) {
        this.talkDate = talkDate;
    }

    public Date getPrDate() {
        return prDate;
    }

    public void setPrDate(Date prDate) {
        this.prDate = prDate;
    }

    public Date getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(Date inspectDate) {
        this.inspectDate = inspectDate;
    }

    public Date getPreTrialDate() {
        return preTrialDate;
    }

    public void setPreTrialDate(Date preTrialDate) {
        this.preTrialDate = preTrialDate;
    }

    public Date getPubStartDate() {
        return pubStartDate;
    }

    public void setPubStartDate(Date pubStartDate) {
        this.pubStartDate = pubStartDate;
    }

    public Date getPubEndDate() {
        return pubEndDate;
    }

    public void setPubEndDate(Date pubEndDate) {
        this.pubEndDate = pubEndDate;
    }
}