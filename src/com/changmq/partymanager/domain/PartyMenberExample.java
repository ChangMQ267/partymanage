package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PartyMenberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyMenberExample() {
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

        public Criteria andPmIdIsNull() {
            addCriterion("pm_id is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("pm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Integer value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Integer value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Integer value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_id >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Integer value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Integer value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Integer> values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Integer> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Integer value1, Integer value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andROutIdIsNull() {
            addCriterion("r_out_id is null");
            return (Criteria) this;
        }

        public Criteria andROutIdIsNotNull() {
            addCriterion("r_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andROutIdEqualTo(Integer value) {
            addCriterion("r_out_id =", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdNotEqualTo(Integer value) {
            addCriterion("r_out_id <>", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdGreaterThan(Integer value) {
            addCriterion("r_out_id >", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_out_id >=", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdLessThan(Integer value) {
            addCriterion("r_out_id <", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_out_id <=", value, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdIn(List<Integer> values) {
            addCriterion("r_out_id in", values, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdNotIn(List<Integer> values) {
            addCriterion("r_out_id not in", values, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdBetween(Integer value1, Integer value2) {
            addCriterion("r_out_id between", value1, value2, "rOutId");
            return (Criteria) this;
        }

        public Criteria andROutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_out_id not between", value1, value2, "rOutId");
            return (Criteria) this;
        }

        public Criteria andWyabNoIsNull() {
            addCriterion("wyab_no is null");
            return (Criteria) this;
        }

        public Criteria andWyabNoIsNotNull() {
            addCriterion("wyab_no is not null");
            return (Criteria) this;
        }

        public Criteria andWyabNoEqualTo(String value) {
            addCriterion("wyab_no =", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoNotEqualTo(String value) {
            addCriterion("wyab_no <>", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoGreaterThan(String value) {
            addCriterion("wyab_no >", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoGreaterThanOrEqualTo(String value) {
            addCriterion("wyab_no >=", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoLessThan(String value) {
            addCriterion("wyab_no <", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoLessThanOrEqualTo(String value) {
            addCriterion("wyab_no <=", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoLike(String value) {
            addCriterion("wyab_no like", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoNotLike(String value) {
            addCriterion("wyab_no not like", value, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoIn(List<String> values) {
            addCriterion("wyab_no in", values, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoNotIn(List<String> values) {
            addCriterion("wyab_no not in", values, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoBetween(String value1, String value2) {
            addCriterion("wyab_no between", value1, value2, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andWyabNoNotBetween(String value1, String value2) {
            addCriterion("wyab_no not between", value1, value2, "wyabNo");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNull() {
            addCriterion("join_date is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNotNull() {
            addCriterion("join_date is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateEqualTo(Date value) {
            addCriterionForJDBCDate("join_date =", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("join_date <>", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThan(Date value) {
            addCriterionForJDBCDate("join_date >", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("join_date >=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThan(Date value) {
            addCriterionForJDBCDate("join_date <", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("join_date <=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIn(List<Date> values) {
            addCriterionForJDBCDate("join_date in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("join_date not in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("join_date between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("join_date not between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateIsNull() {
            addCriterion("jhcu_date is null");
            return (Criteria) this;
        }

        public Criteria andJhcuDateIsNotNull() {
            addCriterion("jhcu_date is not null");
            return (Criteria) this;
        }

        public Criteria andJhcuDateEqualTo(Date value) {
            addCriterionForJDBCDate("jhcu_date =", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jhcu_date <>", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateGreaterThan(Date value) {
            addCriterionForJDBCDate("jhcu_date >", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jhcu_date >=", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateLessThan(Date value) {
            addCriterionForJDBCDate("jhcu_date <", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jhcu_date <=", value, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateIn(List<Date> values) {
            addCriterionForJDBCDate("jhcu_date in", values, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jhcu_date not in", values, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jhcu_date between", value1, value2, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andJhcuDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jhcu_date not between", value1, value2, "jhcuDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateIsNull() {
            addCriterion("formal_date is null");
            return (Criteria) this;
        }

        public Criteria andFormalDateIsNotNull() {
            addCriterion("formal_date is not null");
            return (Criteria) this;
        }

        public Criteria andFormalDateEqualTo(Date value) {
            addCriterionForJDBCDate("formal_date =", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("formal_date <>", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("formal_date >", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("formal_date >=", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateLessThan(Date value) {
            addCriterionForJDBCDate("formal_date <", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("formal_date <=", value, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateIn(List<Date> values) {
            addCriterionForJDBCDate("formal_date in", values, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("formal_date not in", values, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("formal_date between", value1, value2, "formalDate");
            return (Criteria) this;
        }

        public Criteria andFormalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("formal_date not between", value1, value2, "formalDate");
            return (Criteria) this;
        }

        public Criteria andPartyStandingIsNull() {
            addCriterion("party_standing is null");
            return (Criteria) this;
        }

        public Criteria andPartyStandingIsNotNull() {
            addCriterion("party_standing is not null");
            return (Criteria) this;
        }

        public Criteria andPartyStandingEqualTo(Integer value) {
            addCriterion("party_standing =", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingNotEqualTo(Integer value) {
            addCriterion("party_standing <>", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingGreaterThan(Integer value) {
            addCriterion("party_standing >", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_standing >=", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingLessThan(Integer value) {
            addCriterion("party_standing <", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingLessThanOrEqualTo(Integer value) {
            addCriterion("party_standing <=", value, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingIn(List<Integer> values) {
            addCriterion("party_standing in", values, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingNotIn(List<Integer> values) {
            addCriterion("party_standing not in", values, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingBetween(Integer value1, Integer value2) {
            addCriterion("party_standing between", value1, value2, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPartyStandingNotBetween(Integer value1, Integer value2) {
            addCriterion("party_standing not between", value1, value2, "partyStanding");
            return (Criteria) this;
        }

        public Criteria andPmStateIsNull() {
            addCriterion("pm_state is null");
            return (Criteria) this;
        }

        public Criteria andPmStateIsNotNull() {
            addCriterion("pm_state is not null");
            return (Criteria) this;
        }

        public Criteria andPmStateEqualTo(String value) {
            addCriterion("pm_state =", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateNotEqualTo(String value) {
            addCriterion("pm_state <>", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateGreaterThan(String value) {
            addCriterion("pm_state >", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateGreaterThanOrEqualTo(String value) {
            addCriterion("pm_state >=", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateLessThan(String value) {
            addCriterion("pm_state <", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateLessThanOrEqualTo(String value) {
            addCriterion("pm_state <=", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateLike(String value) {
            addCriterion("pm_state like", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateNotLike(String value) {
            addCriterion("pm_state not like", value, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateIn(List<String> values) {
            addCriterion("pm_state in", values, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateNotIn(List<String> values) {
            addCriterion("pm_state not in", values, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateBetween(String value1, String value2) {
            addCriterion("pm_state between", value1, value2, "pmState");
            return (Criteria) this;
        }

        public Criteria andPmStateNotBetween(String value1, String value2) {
            addCriterion("pm_state not between", value1, value2, "pmState");
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