package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.List;

public class ParentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParentExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPMobileIsNull() {
            addCriterion("p_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPMobileIsNotNull() {
            addCriterion("p_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPMobileEqualTo(String value) {
            addCriterion("p_mobile =", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileNotEqualTo(String value) {
            addCriterion("p_mobile <>", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileGreaterThan(String value) {
            addCriterion("p_mobile >", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileGreaterThanOrEqualTo(String value) {
            addCriterion("p_mobile >=", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileLessThan(String value) {
            addCriterion("p_mobile <", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileLessThanOrEqualTo(String value) {
            addCriterion("p_mobile <=", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileLike(String value) {
            addCriterion("p_mobile like", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileNotLike(String value) {
            addCriterion("p_mobile not like", value, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileIn(List<String> values) {
            addCriterion("p_mobile in", values, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileNotIn(List<String> values) {
            addCriterion("p_mobile not in", values, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileBetween(String value1, String value2) {
            addCriterion("p_mobile between", value1, value2, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPMobileNotBetween(String value1, String value2) {
            addCriterion("p_mobile not between", value1, value2, "pMobile");
            return (Criteria) this;
        }

        public Criteria andPQqIsNull() {
            addCriterion("p_qq is null");
            return (Criteria) this;
        }

        public Criteria andPQqIsNotNull() {
            addCriterion("p_qq is not null");
            return (Criteria) this;
        }

        public Criteria andPQqEqualTo(String value) {
            addCriterion("p_qq =", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotEqualTo(String value) {
            addCriterion("p_qq <>", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqGreaterThan(String value) {
            addCriterion("p_qq >", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqGreaterThanOrEqualTo(String value) {
            addCriterion("p_qq >=", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLessThan(String value) {
            addCriterion("p_qq <", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLessThanOrEqualTo(String value) {
            addCriterion("p_qq <=", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLike(String value) {
            addCriterion("p_qq like", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotLike(String value) {
            addCriterion("p_qq not like", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqIn(List<String> values) {
            addCriterion("p_qq in", values, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotIn(List<String> values) {
            addCriterion("p_qq not in", values, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqBetween(String value1, String value2) {
            addCriterion("p_qq between", value1, value2, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotBetween(String value1, String value2) {
            addCriterion("p_qq not between", value1, value2, "pQq");
            return (Criteria) this;
        }

        public Criteria andPGenderIsNull() {
            addCriterion("p_gender is null");
            return (Criteria) this;
        }

        public Criteria andPGenderIsNotNull() {
            addCriterion("p_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPGenderEqualTo(Integer value) {
            addCriterion("p_gender =", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderNotEqualTo(Integer value) {
            addCriterion("p_gender <>", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderGreaterThan(Integer value) {
            addCriterion("p_gender >", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_gender >=", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderLessThan(Integer value) {
            addCriterion("p_gender <", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderLessThanOrEqualTo(Integer value) {
            addCriterion("p_gender <=", value, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderIn(List<Integer> values) {
            addCriterion("p_gender in", values, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderNotIn(List<Integer> values) {
            addCriterion("p_gender not in", values, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderBetween(Integer value1, Integer value2) {
            addCriterion("p_gender between", value1, value2, "pGender");
            return (Criteria) this;
        }

        public Criteria andPGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("p_gender not between", value1, value2, "pGender");
            return (Criteria) this;
        }

        public Criteria andPRelationIsNull() {
            addCriterion("p_relation is null");
            return (Criteria) this;
        }

        public Criteria andPRelationIsNotNull() {
            addCriterion("p_relation is not null");
            return (Criteria) this;
        }

        public Criteria andPRelationEqualTo(String value) {
            addCriterion("p_relation =", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationNotEqualTo(String value) {
            addCriterion("p_relation <>", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationGreaterThan(String value) {
            addCriterion("p_relation >", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationGreaterThanOrEqualTo(String value) {
            addCriterion("p_relation >=", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationLessThan(String value) {
            addCriterion("p_relation <", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationLessThanOrEqualTo(String value) {
            addCriterion("p_relation <=", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationLike(String value) {
            addCriterion("p_relation like", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationNotLike(String value) {
            addCriterion("p_relation not like", value, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationIn(List<String> values) {
            addCriterion("p_relation in", values, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationNotIn(List<String> values) {
            addCriterion("p_relation not in", values, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationBetween(String value1, String value2) {
            addCriterion("p_relation between", value1, value2, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPRelationNotBetween(String value1, String value2) {
            addCriterion("p_relation not between", value1, value2, "pRelation");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameIsNull() {
            addCriterion("p_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameIsNotNull() {
            addCriterion("p_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameEqualTo(String value) {
            addCriterion("p_company_name =", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameNotEqualTo(String value) {
            addCriterion("p_company_name <>", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameGreaterThan(String value) {
            addCriterion("p_company_name >", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_company_name >=", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameLessThan(String value) {
            addCriterion("p_company_name <", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("p_company_name <=", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameLike(String value) {
            addCriterion("p_company_name like", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameNotLike(String value) {
            addCriterion("p_company_name not like", value, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameIn(List<String> values) {
            addCriterion("p_company_name in", values, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameNotIn(List<String> values) {
            addCriterion("p_company_name not in", values, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameBetween(String value1, String value2) {
            addCriterion("p_company_name between", value1, value2, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPCompanyNameNotBetween(String value1, String value2) {
            addCriterion("p_company_name not between", value1, value2, "pCompanyName");
            return (Criteria) this;
        }

        public Criteria andPPbNameIsNull() {
            addCriterion("p_pb_name is null");
            return (Criteria) this;
        }

        public Criteria andPPbNameIsNotNull() {
            addCriterion("p_pb_name is not null");
            return (Criteria) this;
        }

        public Criteria andPPbNameEqualTo(String value) {
            addCriterion("p_pb_name =", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameNotEqualTo(String value) {
            addCriterion("p_pb_name <>", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameGreaterThan(String value) {
            addCriterion("p_pb_name >", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_pb_name >=", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameLessThan(String value) {
            addCriterion("p_pb_name <", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameLessThanOrEqualTo(String value) {
            addCriterion("p_pb_name <=", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameLike(String value) {
            addCriterion("p_pb_name like", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameNotLike(String value) {
            addCriterion("p_pb_name not like", value, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameIn(List<String> values) {
            addCriterion("p_pb_name in", values, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameNotIn(List<String> values) {
            addCriterion("p_pb_name not in", values, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameBetween(String value1, String value2) {
            addCriterion("p_pb_name between", value1, value2, "pPbName");
            return (Criteria) this;
        }

        public Criteria andPPbNameNotBetween(String value1, String value2) {
            addCriterion("p_pb_name not between", value1, value2, "pPbName");
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