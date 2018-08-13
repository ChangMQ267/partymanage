package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.List;

public class PartyPostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyPostsExample() {
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

        public Criteria andPpIdIsNull() {
            addCriterion("pp_id is null");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNotNull() {
            addCriterion("pp_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpIdEqualTo(Integer value) {
            addCriterion("pp_id =", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotEqualTo(Integer value) {
            addCriterion("pp_id <>", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThan(Integer value) {
            addCriterion("pp_id >", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_id >=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThan(Integer value) {
            addCriterion("pp_id <", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_id <=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdIn(List<Integer> values) {
            addCriterion("pp_id in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotIn(List<Integer> values) {
            addCriterion("pp_id not in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_id between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_id not between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpNameIsNull() {
            addCriterion("pp_name is null");
            return (Criteria) this;
        }

        public Criteria andPpNameIsNotNull() {
            addCriterion("pp_name is not null");
            return (Criteria) this;
        }

        public Criteria andPpNameEqualTo(String value) {
            addCriterion("pp_name =", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotEqualTo(String value) {
            addCriterion("pp_name <>", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameGreaterThan(String value) {
            addCriterion("pp_name >", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameGreaterThanOrEqualTo(String value) {
            addCriterion("pp_name >=", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLessThan(String value) {
            addCriterion("pp_name <", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLessThanOrEqualTo(String value) {
            addCriterion("pp_name <=", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLike(String value) {
            addCriterion("pp_name like", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotLike(String value) {
            addCriterion("pp_name not like", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameIn(List<String> values) {
            addCriterion("pp_name in", values, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotIn(List<String> values) {
            addCriterion("pp_name not in", values, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameBetween(String value1, String value2) {
            addCriterion("pp_name between", value1, value2, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotBetween(String value1, String value2) {
            addCriterion("pp_name not between", value1, value2, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpTextIsNull() {
            addCriterion("pp_text is null");
            return (Criteria) this;
        }

        public Criteria andPpTextIsNotNull() {
            addCriterion("pp_text is not null");
            return (Criteria) this;
        }

        public Criteria andPpTextEqualTo(String value) {
            addCriterion("pp_text =", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextNotEqualTo(String value) {
            addCriterion("pp_text <>", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextGreaterThan(String value) {
            addCriterion("pp_text >", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextGreaterThanOrEqualTo(String value) {
            addCriterion("pp_text >=", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextLessThan(String value) {
            addCriterion("pp_text <", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextLessThanOrEqualTo(String value) {
            addCriterion("pp_text <=", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextLike(String value) {
            addCriterion("pp_text like", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextNotLike(String value) {
            addCriterion("pp_text not like", value, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextIn(List<String> values) {
            addCriterion("pp_text in", values, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextNotIn(List<String> values) {
            addCriterion("pp_text not in", values, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextBetween(String value1, String value2) {
            addCriterion("pp_text between", value1, value2, "ppText");
            return (Criteria) this;
        }

        public Criteria andPpTextNotBetween(String value1, String value2) {
            addCriterion("pp_text not between", value1, value2, "ppText");
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