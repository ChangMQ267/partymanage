package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.List;

public class PartyBranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyBranchExample() {
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

        public Criteria andPbIdIsNull() {
            addCriterion("pb_id is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("pb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(Integer value) {
            addCriterion("pb_id =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(Integer value) {
            addCriterion("pb_id <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(Integer value) {
            addCriterion("pb_id >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pb_id >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(Integer value) {
            addCriterion("pb_id <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(Integer value) {
            addCriterion("pb_id <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<Integer> values) {
            addCriterion("pb_id in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<Integer> values) {
            addCriterion("pb_id not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(Integer value1, Integer value2) {
            addCriterion("pb_id between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pb_id not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbNameIsNull() {
            addCriterion("pb_name is null");
            return (Criteria) this;
        }

        public Criteria andPbNameIsNotNull() {
            addCriterion("pb_name is not null");
            return (Criteria) this;
        }

        public Criteria andPbNameEqualTo(String value) {
            addCriterion("pb_name =", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotEqualTo(String value) {
            addCriterion("pb_name <>", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameGreaterThan(String value) {
            addCriterion("pb_name >", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameGreaterThanOrEqualTo(String value) {
            addCriterion("pb_name >=", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLessThan(String value) {
            addCriterion("pb_name <", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLessThanOrEqualTo(String value) {
            addCriterion("pb_name <=", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLike(String value) {
            addCriterion("pb_name like", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotLike(String value) {
            addCriterion("pb_name not like", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameIn(List<String> values) {
            addCriterion("pb_name in", values, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotIn(List<String> values) {
            addCriterion("pb_name not in", values, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameBetween(String value1, String value2) {
            addCriterion("pb_name between", value1, value2, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotBetween(String value1, String value2) {
            addCriterion("pb_name not between", value1, value2, "pbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameIsNull() {
            addCriterion("gpb_name is null");
            return (Criteria) this;
        }

        public Criteria andGpbNameIsNotNull() {
            addCriterion("gpb_name is not null");
            return (Criteria) this;
        }

        public Criteria andGpbNameEqualTo(String value) {
            addCriterion("gpb_name =", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameNotEqualTo(String value) {
            addCriterion("gpb_name <>", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameGreaterThan(String value) {
            addCriterion("gpb_name >", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameGreaterThanOrEqualTo(String value) {
            addCriterion("gpb_name >=", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameLessThan(String value) {
            addCriterion("gpb_name <", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameLessThanOrEqualTo(String value) {
            addCriterion("gpb_name <=", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameLike(String value) {
            addCriterion("gpb_name like", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameNotLike(String value) {
            addCriterion("gpb_name not like", value, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameIn(List<String> values) {
            addCriterion("gpb_name in", values, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameNotIn(List<String> values) {
            addCriterion("gpb_name not in", values, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameBetween(String value1, String value2) {
            addCriterion("gpb_name between", value1, value2, "gpbName");
            return (Criteria) this;
        }

        public Criteria andGpbNameNotBetween(String value1, String value2) {
            addCriterion("gpb_name not between", value1, value2, "gpbName");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNull() {
            addCriterion("all_num is null");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNotNull() {
            addCriterion("all_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumEqualTo(Integer value) {
            addCriterion("all_num =", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotEqualTo(Integer value) {
            addCriterion("all_num <>", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThan(Integer value) {
            addCriterion("all_num >", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_num >=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThan(Integer value) {
            addCriterion("all_num <", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_num <=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumIn(List<Integer> values) {
            addCriterion("all_num in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotIn(List<Integer> values) {
            addCriterion("all_num not in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumBetween(Integer value1, Integer value2) {
            addCriterion("all_num between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_num not between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumIsNull() {
            addCriterion("activist_num is null");
            return (Criteria) this;
        }

        public Criteria andActivistNumIsNotNull() {
            addCriterion("activist_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivistNumEqualTo(Integer value) {
            addCriterion("activist_num =", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumNotEqualTo(Integer value) {
            addCriterion("activist_num <>", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumGreaterThan(Integer value) {
            addCriterion("activist_num >", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("activist_num >=", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumLessThan(Integer value) {
            addCriterion("activist_num <", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumLessThanOrEqualTo(Integer value) {
            addCriterion("activist_num <=", value, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumIn(List<Integer> values) {
            addCriterion("activist_num in", values, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumNotIn(List<Integer> values) {
            addCriterion("activist_num not in", values, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumBetween(Integer value1, Integer value2) {
            addCriterion("activist_num between", value1, value2, "activistNum");
            return (Criteria) this;
        }

        public Criteria andActivistNumNotBetween(Integer value1, Integer value2) {
            addCriterion("activist_num not between", value1, value2, "activistNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumIsNull() {
            addCriterion("deve_num is null");
            return (Criteria) this;
        }

        public Criteria andDeveNumIsNotNull() {
            addCriterion("deve_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeveNumEqualTo(Integer value) {
            addCriterion("deve_num =", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumNotEqualTo(Integer value) {
            addCriterion("deve_num <>", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumGreaterThan(Integer value) {
            addCriterion("deve_num >", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("deve_num >=", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumLessThan(Integer value) {
            addCriterion("deve_num <", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumLessThanOrEqualTo(Integer value) {
            addCriterion("deve_num <=", value, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumIn(List<Integer> values) {
            addCriterion("deve_num in", values, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumNotIn(List<Integer> values) {
            addCriterion("deve_num not in", values, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumBetween(Integer value1, Integer value2) {
            addCriterion("deve_num between", value1, value2, "deveNum");
            return (Criteria) this;
        }

        public Criteria andDeveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("deve_num not between", value1, value2, "deveNum");
            return (Criteria) this;
        }

        public Criteria andProbNumIsNull() {
            addCriterion("prob_num is null");
            return (Criteria) this;
        }

        public Criteria andProbNumIsNotNull() {
            addCriterion("prob_num is not null");
            return (Criteria) this;
        }

        public Criteria andProbNumEqualTo(Integer value) {
            addCriterion("prob_num =", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumNotEqualTo(Integer value) {
            addCriterion("prob_num <>", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumGreaterThan(Integer value) {
            addCriterion("prob_num >", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prob_num >=", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumLessThan(Integer value) {
            addCriterion("prob_num <", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumLessThanOrEqualTo(Integer value) {
            addCriterion("prob_num <=", value, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumIn(List<Integer> values) {
            addCriterion("prob_num in", values, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumNotIn(List<Integer> values) {
            addCriterion("prob_num not in", values, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumBetween(Integer value1, Integer value2) {
            addCriterion("prob_num between", value1, value2, "probNum");
            return (Criteria) this;
        }

        public Criteria andProbNumNotBetween(Integer value1, Integer value2) {
            addCriterion("prob_num not between", value1, value2, "probNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumIsNull() {
            addCriterion("party_num is null");
            return (Criteria) this;
        }

        public Criteria andPartyNumIsNotNull() {
            addCriterion("party_num is not null");
            return (Criteria) this;
        }

        public Criteria andPartyNumEqualTo(Integer value) {
            addCriterion("party_num =", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumNotEqualTo(Integer value) {
            addCriterion("party_num <>", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumGreaterThan(Integer value) {
            addCriterion("party_num >", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_num >=", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumLessThan(Integer value) {
            addCriterion("party_num <", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumLessThanOrEqualTo(Integer value) {
            addCriterion("party_num <=", value, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumIn(List<Integer> values) {
            addCriterion("party_num in", values, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumNotIn(List<Integer> values) {
            addCriterion("party_num not in", values, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumBetween(Integer value1, Integer value2) {
            addCriterion("party_num between", value1, value2, "partyNum");
            return (Criteria) this;
        }

        public Criteria andPartyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("party_num not between", value1, value2, "partyNum");
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