package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Integer value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Integer value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Integer value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Integer value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Integer> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Integer> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
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

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(Integer value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Integer value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Integer value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Integer value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Integer> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Integer> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Integer value1, Integer value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMoblieIsNull() {
            addCriterion("moblie is null");
            return (Criteria) this;
        }

        public Criteria andMoblieIsNotNull() {
            addCriterion("moblie is not null");
            return (Criteria) this;
        }

        public Criteria andMoblieEqualTo(String value) {
            addCriterion("moblie =", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieNotEqualTo(String value) {
            addCriterion("moblie <>", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieGreaterThan(String value) {
            addCriterion("moblie >", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieGreaterThanOrEqualTo(String value) {
            addCriterion("moblie >=", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieLessThan(String value) {
            addCriterion("moblie <", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieLessThanOrEqualTo(String value) {
            addCriterion("moblie <=", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieLike(String value) {
            addCriterion("moblie like", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieNotLike(String value) {
            addCriterion("moblie not like", value, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieIn(List<String> values) {
            addCriterion("moblie in", values, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieNotIn(List<String> values) {
            addCriterion("moblie not in", values, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieBetween(String value1, String value2) {
            addCriterion("moblie between", value1, value2, "moblie");
            return (Criteria) this;
        }

        public Criteria andMoblieNotBetween(String value1, String value2) {
            addCriterion("moblie not between", value1, value2, "moblie");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Boolean value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Boolean value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Boolean value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Boolean value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Boolean value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Boolean> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Boolean> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Boolean value1, Boolean value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
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

        public Criteria andTNoIsNull() {
            addCriterion("t_no is null");
            return (Criteria) this;
        }

        public Criteria andTNoIsNotNull() {
            addCriterion("t_no is not null");
            return (Criteria) this;
        }

        public Criteria andTNoEqualTo(String value) {
            addCriterion("t_no =", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotEqualTo(String value) {
            addCriterion("t_no <>", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThan(String value) {
            addCriterion("t_no >", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThanOrEqualTo(String value) {
            addCriterion("t_no >=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThan(String value) {
            addCriterion("t_no <", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThanOrEqualTo(String value) {
            addCriterion("t_no <=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLike(String value) {
            addCriterion("t_no like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotLike(String value) {
            addCriterion("t_no not like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoIn(List<String> values) {
            addCriterion("t_no in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotIn(List<String> values) {
            addCriterion("t_no not in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoBetween(String value1, String value2) {
            addCriterion("t_no between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotBetween(String value1, String value2) {
            addCriterion("t_no not between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTAdminIsNull() {
            addCriterion("t_admin is null");
            return (Criteria) this;
        }

        public Criteria andTAdminIsNotNull() {
            addCriterion("t_admin is not null");
            return (Criteria) this;
        }

        public Criteria andTAdminEqualTo(Boolean value) {
            addCriterion("t_admin =", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminNotEqualTo(Boolean value) {
            addCriterion("t_admin <>", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminGreaterThan(Boolean value) {
            addCriterion("t_admin >", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_admin >=", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminLessThan(Boolean value) {
            addCriterion("t_admin <", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("t_admin <=", value, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminIn(List<Boolean> values) {
            addCriterion("t_admin in", values, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminNotIn(List<Boolean> values) {
            addCriterion("t_admin not in", values, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("t_admin between", value1, value2, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_admin not between", value1, value2, "tAdmin");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Integer value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Integer value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Integer value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Integer value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Integer value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Integer> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Integer> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Integer value1, Integer value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIsNull() {
            addCriterion("t_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIsNotNull() {
            addCriterion("t_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday =", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday <>", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("t_birthday >", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday >=", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("t_birthday <", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday <=", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("t_birthday in", values, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_birthday not in", values, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birthday between", value1, value2, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birthday not between", value1, value2, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeIsNull() {
            addCriterion("t_work_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeIsNotNull() {
            addCriterion("t_work_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("t_work_start_time =", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_work_start_time <>", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("t_work_start_time >", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_work_start_time >=", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("t_work_start_time <", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_work_start_time <=", value, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("t_work_start_time in", values, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_work_start_time not in", values, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_work_start_time between", value1, value2, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTWorkStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_work_start_time not between", value1, value2, "tWorkStartTime");
            return (Criteria) this;
        }

        public Criteria andTEducationIsNull() {
            addCriterion("t_education is null");
            return (Criteria) this;
        }

        public Criteria andTEducationIsNotNull() {
            addCriterion("t_education is not null");
            return (Criteria) this;
        }

        public Criteria andTEducationEqualTo(String value) {
            addCriterion("t_education =", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotEqualTo(String value) {
            addCriterion("t_education <>", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationGreaterThan(String value) {
            addCriterion("t_education >", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationGreaterThanOrEqualTo(String value) {
            addCriterion("t_education >=", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationLessThan(String value) {
            addCriterion("t_education <", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationLessThanOrEqualTo(String value) {
            addCriterion("t_education <=", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationLike(String value) {
            addCriterion("t_education like", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotLike(String value) {
            addCriterion("t_education not like", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationIn(List<String> values) {
            addCriterion("t_education in", values, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotIn(List<String> values) {
            addCriterion("t_education not in", values, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationBetween(String value1, String value2) {
            addCriterion("t_education between", value1, value2, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotBetween(String value1, String value2) {
            addCriterion("t_education not between", value1, value2, "tEducation");
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