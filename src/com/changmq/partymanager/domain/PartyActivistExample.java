package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PartyActivistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyActivistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPaIdIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaIdEqualTo(Integer value) {
            addCriterion("pa_id =", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotEqualTo(Integer value) {
            addCriterion("pa_id <>", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThan(Integer value) {
            addCriterion("pa_id >", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_id >=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThan(Integer value) {
            addCriterion("pa_id <", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThanOrEqualTo(Integer value) {
            addCriterion("pa_id <=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdIn(List<Integer> values) {
            addCriterion("pa_id in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotIn(List<Integer> values) {
            addCriterion("pa_id not in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdBetween(Integer value1, Integer value2) {
            addCriterion("pa_id between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_id not between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateIsNull() {
            addCriterion("pa_apply_date is null");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateIsNotNull() {
            addCriterion("pa_apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateEqualTo(Date value) {
            addCriterionForJDBCDate("pa_apply_date =", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pa_apply_date <>", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pa_apply_date >", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_apply_date >=", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateLessThan(Date value) {
            addCriterionForJDBCDate("pa_apply_date <", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_apply_date <=", value, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateIn(List<Date> values) {
            addCriterionForJDBCDate("pa_apply_date in", values, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pa_apply_date not in", values, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_apply_date between", value1, value2, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaApplyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_apply_date not between", value1, value2, "paApplyDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateIsNull() {
            addCriterion("pa_agree_date is null");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateIsNotNull() {
            addCriterion("pa_agree_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateEqualTo(Date value) {
            addCriterionForJDBCDate("pa_agree_date =", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pa_agree_date <>", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pa_agree_date >", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_agree_date >=", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateLessThan(Date value) {
            addCriterionForJDBCDate("pa_agree_date <", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_agree_date <=", value, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateIn(List<Date> values) {
            addCriterionForJDBCDate("pa_agree_date in", values, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pa_agree_date not in", values, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_agree_date between", value1, value2, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaAgreeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_agree_date not between", value1, value2, "paAgreeDate");
            return (Criteria) this;
        }

        public Criteria andPaReportNumIsNull() {
            addCriterion("pa_report_num is null");
            return (Criteria) this;
        }

        public Criteria andPaReportNumIsNotNull() {
            addCriterion("pa_report_num is not null");
            return (Criteria) this;
        }

        public Criteria andPaReportNumEqualTo(Integer value) {
            addCriterion("pa_report_num =", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumNotEqualTo(Integer value) {
            addCriterion("pa_report_num <>", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumGreaterThan(Integer value) {
            addCriterion("pa_report_num >", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_report_num >=", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumLessThan(Integer value) {
            addCriterion("pa_report_num <", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumLessThanOrEqualTo(Integer value) {
            addCriterion("pa_report_num <=", value, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumIn(List<Integer> values) {
            addCriterion("pa_report_num in", values, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumNotIn(List<Integer> values) {
            addCriterion("pa_report_num not in", values, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumBetween(Integer value1, Integer value2) {
            addCriterion("pa_report_num between", value1, value2, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaReportNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_report_num not between", value1, value2, "paReportNum");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateIsNull() {
            addCriterion("pa_training_date is null");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateIsNotNull() {
            addCriterion("pa_training_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateEqualTo(Date value) {
            addCriterionForJDBCDate("pa_training_date =", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pa_training_date <>", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pa_training_date >", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_training_date >=", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateLessThan(Date value) {
            addCriterionForJDBCDate("pa_training_date <", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_training_date <=", value, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateIn(List<Date> values) {
            addCriterionForJDBCDate("pa_training_date in", values, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pa_training_date not in", values, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_training_date between", value1, value2, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTrainingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_training_date not between", value1, value2, "paTrainingDate");
            return (Criteria) this;
        }

        public Criteria andPaTyIsNull() {
            addCriterion("pa_ty is null");
            return (Criteria) this;
        }

        public Criteria andPaTyIsNotNull() {
            addCriterion("pa_ty is not null");
            return (Criteria) this;
        }

        public Criteria andPaTyEqualTo(String value) {
            addCriterion("pa_ty =", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyNotEqualTo(String value) {
            addCriterion("pa_ty <>", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyGreaterThan(String value) {
            addCriterion("pa_ty >", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyGreaterThanOrEqualTo(String value) {
            addCriterion("pa_ty >=", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyLessThan(String value) {
            addCriterion("pa_ty <", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyLessThanOrEqualTo(String value) {
            addCriterion("pa_ty <=", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyLike(String value) {
            addCriterion("pa_ty like", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyNotLike(String value) {
            addCriterion("pa_ty not like", value, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyIn(List<String> values) {
            addCriterion("pa_ty in", values, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyNotIn(List<String> values) {
            addCriterion("pa_ty not in", values, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyBetween(String value1, String value2) {
            addCriterion("pa_ty between", value1, value2, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyNotBetween(String value1, String value2) {
            addCriterion("pa_ty not between", value1, value2, "paTy");
            return (Criteria) this;
        }

        public Criteria andPaTyDateIsNull() {
            addCriterion("pa_ty_date is null");
            return (Criteria) this;
        }

        public Criteria andPaTyDateIsNotNull() {
            addCriterion("pa_ty_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaTyDateEqualTo(Date value) {
            addCriterionForJDBCDate("pa_ty_date =", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pa_ty_date <>", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pa_ty_date >", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_ty_date >=", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateLessThan(Date value) {
            addCriterionForJDBCDate("pa_ty_date <", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pa_ty_date <=", value, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateIn(List<Date> values) {
            addCriterionForJDBCDate("pa_ty_date in", values, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pa_ty_date not in", values, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_ty_date between", value1, value2, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andPaTyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pa_ty_date not between", value1, value2, "paTyDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateIsNull() {
            addCriterion("talk_date is null");
            return (Criteria) this;
        }

        public Criteria andTalkDateIsNotNull() {
            addCriterion("talk_date is not null");
            return (Criteria) this;
        }

        public Criteria andTalkDateEqualTo(Date value) {
            addCriterionForJDBCDate("talk_date =", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("talk_date <>", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("talk_date >", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("talk_date >=", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateLessThan(Date value) {
            addCriterionForJDBCDate("talk_date <", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("talk_date <=", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateIn(List<Date> values) {
            addCriterionForJDBCDate("talk_date in", values, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("talk_date not in", values, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("talk_date between", value1, value2, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("talk_date not between", value1, value2, "talkDate");
            return (Criteria) this;
        }

        public Criteria andPrDateIsNull() {
            addCriterion("pr_date is null");
            return (Criteria) this;
        }

        public Criteria andPrDateIsNotNull() {
            addCriterion("pr_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrDateEqualTo(Date value) {
            addCriterionForJDBCDate("pr_date =", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pr_date <>", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pr_date >", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_date >=", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateLessThan(Date value) {
            addCriterionForJDBCDate("pr_date <", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_date <=", value, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateIn(List<Date> values) {
            addCriterionForJDBCDate("pr_date in", values, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pr_date not in", values, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_date between", value1, value2, "prDate");
            return (Criteria) this;
        }

        public Criteria andPrDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_date not between", value1, value2, "prDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateIsNull() {
            addCriterion("inspect_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectDateIsNotNull() {
            addCriterion("inspect_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectDateEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date =", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date <>", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inspect_date >", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date >=", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateLessThan(Date value) {
            addCriterionForJDBCDate("inspect_date <", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date <=", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateIn(List<Date> values) {
            addCriterionForJDBCDate("inspect_date in", values, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inspect_date not in", values, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspect_date between", value1, value2, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspect_date not between", value1, value2, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateIsNull() {
            addCriterion("pre_trial_date is null");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateIsNotNull() {
            addCriterion("pre_trial_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateEqualTo(Date value) {
            addCriterionForJDBCDate("pre_trial_date =", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pre_trial_date <>", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pre_trial_date >", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pre_trial_date >=", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateLessThan(Date value) {
            addCriterionForJDBCDate("pre_trial_date <", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pre_trial_date <=", value, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateIn(List<Date> values) {
            addCriterionForJDBCDate("pre_trial_date in", values, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pre_trial_date not in", values, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pre_trial_date between", value1, value2, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPreTrialDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pre_trial_date not between", value1, value2, "preTrialDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateIsNull() {
            addCriterion("pub_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPubStartDateIsNotNull() {
            addCriterion("pub_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("pub_start_date =", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pub_start_date <>", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pub_start_date >", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_start_date >=", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateLessThan(Date value) {
            addCriterionForJDBCDate("pub_start_date <", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_start_date <=", value, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("pub_start_date in", values, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pub_start_date not in", values, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_start_date between", value1, value2, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_start_date not between", value1, value2, "pubStartDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateIsNull() {
            addCriterion("pub_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPubEndDateIsNotNull() {
            addCriterion("pub_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("pub_end_date =", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pub_end_date <>", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pub_end_date >", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_end_date >=", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateLessThan(Date value) {
            addCriterionForJDBCDate("pub_end_date <", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_end_date <=", value, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("pub_end_date in", values, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pub_end_date not in", values, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_end_date between", value1, value2, "pubEndDate");
            return (Criteria) this;
        }

        public Criteria andPubEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_end_date not between", value1, value2, "pubEndDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}