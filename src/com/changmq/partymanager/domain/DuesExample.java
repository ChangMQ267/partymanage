package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @ClassName DuesExample
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class DuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DuesExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
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

        public Criteria andDYearIsNull() {
            addCriterion("d_year is null");
            return (Criteria) this;
        }

        public Criteria andDYearIsNotNull() {
            addCriterion("d_year is not null");
            return (Criteria) this;
        }

        public Criteria andDYearEqualTo(String value) {
            addCriterion("d_year =", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearNotEqualTo(String value) {
            addCriterion("d_year <>", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearGreaterThan(String value) {
            addCriterion("d_year >", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearGreaterThanOrEqualTo(String value) {
            addCriterion("d_year >=", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearLessThan(String value) {
            addCriterion("d_year <", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearLessThanOrEqualTo(String value) {
            addCriterion("d_year <=", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearLike(String value) {
            addCriterion("d_year like", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearNotLike(String value) {
            addCriterion("d_year not like", value, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearIn(List<String> values) {
            addCriterion("d_year in", values, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearNotIn(List<String> values) {
            addCriterion("d_year not in", values, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearBetween(String value1, String value2) {
            addCriterion("d_year between", value1, value2, "dYear");
            return (Criteria) this;
        }

        public Criteria andDYearNotBetween(String value1, String value2) {
            addCriterion("d_year not between", value1, value2, "dYear");
            return (Criteria) this;
        }

        public Criteria andDJanIsNull() {
            addCriterion("d_jan is null");
            return (Criteria) this;
        }

        public Criteria andDJanIsNotNull() {
            addCriterion("d_jan is not null");
            return (Criteria) this;
        }

        public Criteria andDJanEqualTo(Float value) {
            addCriterion("d_jan =", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanNotEqualTo(Float value) {
            addCriterion("d_jan <>", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanGreaterThan(Float value) {
            addCriterion("d_jan >", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanGreaterThanOrEqualTo(Float value) {
            addCriterion("d_jan >=", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanLessThan(Float value) {
            addCriterion("d_jan <", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanLessThanOrEqualTo(Float value) {
            addCriterion("d_jan <=", value, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanIn(List<Float> values) {
            addCriterion("d_jan in", values, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanNotIn(List<Float> values) {
            addCriterion("d_jan not in", values, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanBetween(Float value1, Float value2) {
            addCriterion("d_jan between", value1, value2, "dJan");
            return (Criteria) this;
        }

        public Criteria andDJanNotBetween(Float value1, Float value2) {
            addCriterion("d_jan not between", value1, value2, "dJan");
            return (Criteria) this;
        }

        public Criteria andDFebIsNull() {
            addCriterion("d_feb is null");
            return (Criteria) this;
        }

        public Criteria andDFebIsNotNull() {
            addCriterion("d_feb is not null");
            return (Criteria) this;
        }

        public Criteria andDFebEqualTo(Float value) {
            addCriterion("d_feb =", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebNotEqualTo(Float value) {
            addCriterion("d_feb <>", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebGreaterThan(Float value) {
            addCriterion("d_feb >", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebGreaterThanOrEqualTo(Float value) {
            addCriterion("d_feb >=", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebLessThan(Float value) {
            addCriterion("d_feb <", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebLessThanOrEqualTo(Float value) {
            addCriterion("d_feb <=", value, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebIn(List<Float> values) {
            addCriterion("d_feb in", values, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebNotIn(List<Float> values) {
            addCriterion("d_feb not in", values, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebBetween(Float value1, Float value2) {
            addCriterion("d_feb between", value1, value2, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDFebNotBetween(Float value1, Float value2) {
            addCriterion("d_feb not between", value1, value2, "dFeb");
            return (Criteria) this;
        }

        public Criteria andDMarIsNull() {
            addCriterion("d_mar is null");
            return (Criteria) this;
        }

        public Criteria andDMarIsNotNull() {
            addCriterion("d_mar is not null");
            return (Criteria) this;
        }

        public Criteria andDMarEqualTo(Float value) {
            addCriterion("d_mar =", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarNotEqualTo(Float value) {
            addCriterion("d_mar <>", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarGreaterThan(Float value) {
            addCriterion("d_mar >", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarGreaterThanOrEqualTo(Float value) {
            addCriterion("d_mar >=", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarLessThan(Float value) {
            addCriterion("d_mar <", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarLessThanOrEqualTo(Float value) {
            addCriterion("d_mar <=", value, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarIn(List<Float> values) {
            addCriterion("d_mar in", values, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarNotIn(List<Float> values) {
            addCriterion("d_mar not in", values, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarBetween(Float value1, Float value2) {
            addCriterion("d_mar between", value1, value2, "dMar");
            return (Criteria) this;
        }

        public Criteria andDMarNotBetween(Float value1, Float value2) {
            addCriterion("d_mar not between", value1, value2, "dMar");
            return (Criteria) this;
        }

        public Criteria andDAprIsNull() {
            addCriterion("d_apr is null");
            return (Criteria) this;
        }

        public Criteria andDAprIsNotNull() {
            addCriterion("d_apr is not null");
            return (Criteria) this;
        }

        public Criteria andDAprEqualTo(Float value) {
            addCriterion("d_apr =", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprNotEqualTo(Float value) {
            addCriterion("d_apr <>", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprGreaterThan(Float value) {
            addCriterion("d_apr >", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprGreaterThanOrEqualTo(Float value) {
            addCriterion("d_apr >=", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprLessThan(Float value) {
            addCriterion("d_apr <", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprLessThanOrEqualTo(Float value) {
            addCriterion("d_apr <=", value, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprIn(List<Float> values) {
            addCriterion("d_apr in", values, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprNotIn(List<Float> values) {
            addCriterion("d_apr not in", values, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprBetween(Float value1, Float value2) {
            addCriterion("d_apr between", value1, value2, "dApr");
            return (Criteria) this;
        }

        public Criteria andDAprNotBetween(Float value1, Float value2) {
            addCriterion("d_apr not between", value1, value2, "dApr");
            return (Criteria) this;
        }

        public Criteria andDMayIsNull() {
            addCriterion("d_may is null");
            return (Criteria) this;
        }

        public Criteria andDMayIsNotNull() {
            addCriterion("d_may is not null");
            return (Criteria) this;
        }

        public Criteria andDMayEqualTo(Float value) {
            addCriterion("d_may =", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayNotEqualTo(Float value) {
            addCriterion("d_may <>", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayGreaterThan(Float value) {
            addCriterion("d_may >", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayGreaterThanOrEqualTo(Float value) {
            addCriterion("d_may >=", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayLessThan(Float value) {
            addCriterion("d_may <", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayLessThanOrEqualTo(Float value) {
            addCriterion("d_may <=", value, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayIn(List<Float> values) {
            addCriterion("d_may in", values, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayNotIn(List<Float> values) {
            addCriterion("d_may not in", values, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayBetween(Float value1, Float value2) {
            addCriterion("d_may between", value1, value2, "dMay");
            return (Criteria) this;
        }

        public Criteria andDMayNotBetween(Float value1, Float value2) {
            addCriterion("d_may not between", value1, value2, "dMay");
            return (Criteria) this;
        }

        public Criteria andDJunIsNull() {
            addCriterion("d_jun is null");
            return (Criteria) this;
        }

        public Criteria andDJunIsNotNull() {
            addCriterion("d_jun is not null");
            return (Criteria) this;
        }

        public Criteria andDJunEqualTo(Float value) {
            addCriterion("d_jun =", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunNotEqualTo(Float value) {
            addCriterion("d_jun <>", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunGreaterThan(Float value) {
            addCriterion("d_jun >", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunGreaterThanOrEqualTo(Float value) {
            addCriterion("d_jun >=", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunLessThan(Float value) {
            addCriterion("d_jun <", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunLessThanOrEqualTo(Float value) {
            addCriterion("d_jun <=", value, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunIn(List<Float> values) {
            addCriterion("d_jun in", values, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunNotIn(List<Float> values) {
            addCriterion("d_jun not in", values, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunBetween(Float value1, Float value2) {
            addCriterion("d_jun between", value1, value2, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJunNotBetween(Float value1, Float value2) {
            addCriterion("d_jun not between", value1, value2, "dJun");
            return (Criteria) this;
        }

        public Criteria andDJulIsNull() {
            addCriterion("d_jul is null");
            return (Criteria) this;
        }

        public Criteria andDJulIsNotNull() {
            addCriterion("d_jul is not null");
            return (Criteria) this;
        }

        public Criteria andDJulEqualTo(Float value) {
            addCriterion("d_jul =", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulNotEqualTo(Float value) {
            addCriterion("d_jul <>", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulGreaterThan(Float value) {
            addCriterion("d_jul >", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulGreaterThanOrEqualTo(Float value) {
            addCriterion("d_jul >=", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulLessThan(Float value) {
            addCriterion("d_jul <", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulLessThanOrEqualTo(Float value) {
            addCriterion("d_jul <=", value, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulIn(List<Float> values) {
            addCriterion("d_jul in", values, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulNotIn(List<Float> values) {
            addCriterion("d_jul not in", values, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulBetween(Float value1, Float value2) {
            addCriterion("d_jul between", value1, value2, "dJul");
            return (Criteria) this;
        }

        public Criteria andDJulNotBetween(Float value1, Float value2) {
            addCriterion("d_jul not between", value1, value2, "dJul");
            return (Criteria) this;
        }

        public Criteria andDAugIsNull() {
            addCriterion("d_aug is null");
            return (Criteria) this;
        }

        public Criteria andDAugIsNotNull() {
            addCriterion("d_aug is not null");
            return (Criteria) this;
        }

        public Criteria andDAugEqualTo(Float value) {
            addCriterion("d_aug =", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugNotEqualTo(Float value) {
            addCriterion("d_aug <>", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugGreaterThan(Float value) {
            addCriterion("d_aug >", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugGreaterThanOrEqualTo(Float value) {
            addCriterion("d_aug >=", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugLessThan(Float value) {
            addCriterion("d_aug <", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugLessThanOrEqualTo(Float value) {
            addCriterion("d_aug <=", value, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugIn(List<Float> values) {
            addCriterion("d_aug in", values, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugNotIn(List<Float> values) {
            addCriterion("d_aug not in", values, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugBetween(Float value1, Float value2) {
            addCriterion("d_aug between", value1, value2, "dAug");
            return (Criteria) this;
        }

        public Criteria andDAugNotBetween(Float value1, Float value2) {
            addCriterion("d_aug not between", value1, value2, "dAug");
            return (Criteria) this;
        }

        public Criteria andDSeptIsNull() {
            addCriterion("d_sept is null");
            return (Criteria) this;
        }

        public Criteria andDSeptIsNotNull() {
            addCriterion("d_sept is not null");
            return (Criteria) this;
        }

        public Criteria andDSeptEqualTo(Float value) {
            addCriterion("d_sept =", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptNotEqualTo(Float value) {
            addCriterion("d_sept <>", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptGreaterThan(Float value) {
            addCriterion("d_sept >", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptGreaterThanOrEqualTo(Float value) {
            addCriterion("d_sept >=", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptLessThan(Float value) {
            addCriterion("d_sept <", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptLessThanOrEqualTo(Float value) {
            addCriterion("d_sept <=", value, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptIn(List<Float> values) {
            addCriterion("d_sept in", values, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptNotIn(List<Float> values) {
            addCriterion("d_sept not in", values, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptBetween(Float value1, Float value2) {
            addCriterion("d_sept between", value1, value2, "dSept");
            return (Criteria) this;
        }

        public Criteria andDSeptNotBetween(Float value1, Float value2) {
            addCriterion("d_sept not between", value1, value2, "dSept");
            return (Criteria) this;
        }

        public Criteria andDOctIsNull() {
            addCriterion("d_oct is null");
            return (Criteria) this;
        }

        public Criteria andDOctIsNotNull() {
            addCriterion("d_oct is not null");
            return (Criteria) this;
        }

        public Criteria andDOctEqualTo(Float value) {
            addCriterion("d_oct =", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctNotEqualTo(Float value) {
            addCriterion("d_oct <>", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctGreaterThan(Float value) {
            addCriterion("d_oct >", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctGreaterThanOrEqualTo(Float value) {
            addCriterion("d_oct >=", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctLessThan(Float value) {
            addCriterion("d_oct <", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctLessThanOrEqualTo(Float value) {
            addCriterion("d_oct <=", value, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctIn(List<Float> values) {
            addCriterion("d_oct in", values, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctNotIn(List<Float> values) {
            addCriterion("d_oct not in", values, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctBetween(Float value1, Float value2) {
            addCriterion("d_oct between", value1, value2, "dOct");
            return (Criteria) this;
        }

        public Criteria andDOctNotBetween(Float value1, Float value2) {
            addCriterion("d_oct not between", value1, value2, "dOct");
            return (Criteria) this;
        }

        public Criteria andDNovIsNull() {
            addCriterion("d_nov is null");
            return (Criteria) this;
        }

        public Criteria andDNovIsNotNull() {
            addCriterion("d_nov is not null");
            return (Criteria) this;
        }

        public Criteria andDNovEqualTo(Float value) {
            addCriterion("d_nov =", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovNotEqualTo(Float value) {
            addCriterion("d_nov <>", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovGreaterThan(Float value) {
            addCriterion("d_nov >", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovGreaterThanOrEqualTo(Float value) {
            addCriterion("d_nov >=", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovLessThan(Float value) {
            addCriterion("d_nov <", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovLessThanOrEqualTo(Float value) {
            addCriterion("d_nov <=", value, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovIn(List<Float> values) {
            addCriterion("d_nov in", values, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovNotIn(List<Float> values) {
            addCriterion("d_nov not in", values, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovBetween(Float value1, Float value2) {
            addCriterion("d_nov between", value1, value2, "dNov");
            return (Criteria) this;
        }

        public Criteria andDNovNotBetween(Float value1, Float value2) {
            addCriterion("d_nov not between", value1, value2, "dNov");
            return (Criteria) this;
        }

        public Criteria andDDecIsNull() {
            addCriterion("d_dec is null");
            return (Criteria) this;
        }

        public Criteria andDDecIsNotNull() {
            addCriterion("d_dec is not null");
            return (Criteria) this;
        }

        public Criteria andDDecEqualTo(Float value) {
            addCriterion("d_dec =", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecNotEqualTo(Float value) {
            addCriterion("d_dec <>", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecGreaterThan(Float value) {
            addCriterion("d_dec >", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecGreaterThanOrEqualTo(Float value) {
            addCriterion("d_dec >=", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecLessThan(Float value) {
            addCriterion("d_dec <", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecLessThanOrEqualTo(Float value) {
            addCriterion("d_dec <=", value, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecIn(List<Float> values) {
            addCriterion("d_dec in", values, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecNotIn(List<Float> values) {
            addCriterion("d_dec not in", values, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecBetween(Float value1, Float value2) {
            addCriterion("d_dec between", value1, value2, "dDec");
            return (Criteria) this;
        }

        public Criteria andDDecNotBetween(Float value1, Float value2) {
            addCriterion("d_dec not between", value1, value2, "dDec");
            return (Criteria) this;
        }

        public Criteria andDTotalIsNull() {
            addCriterion("d_total is null");
            return (Criteria) this;
        }

        public Criteria andDTotalIsNotNull() {
            addCriterion("d_total is not null");
            return (Criteria) this;
        }

        public Criteria andDTotalEqualTo(Float value) {
            addCriterion("d_total =", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalNotEqualTo(Float value) {
            addCriterion("d_total <>", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalGreaterThan(Float value) {
            addCriterion("d_total >", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("d_total >=", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalLessThan(Float value) {
            addCriterion("d_total <", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalLessThanOrEqualTo(Float value) {
            addCriterion("d_total <=", value, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalIn(List<Float> values) {
            addCriterion("d_total in", values, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalNotIn(List<Float> values) {
            addCriterion("d_total not in", values, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalBetween(Float value1, Float value2) {
            addCriterion("d_total between", value1, value2, "dTotal");
            return (Criteria) this;
        }

        public Criteria andDTotalNotBetween(Float value1, Float value2) {
            addCriterion("d_total not between", value1, value2, "dTotal");
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