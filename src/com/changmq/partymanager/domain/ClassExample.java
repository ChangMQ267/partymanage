package com.changmq.partymanager.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName ClassExample
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andCFacultyIsNull() {
            addCriterion("c_faculty is null");
            return (Criteria) this;
        }

        public Criteria andCFacultyIsNotNull() {
            addCriterion("c_faculty is not null");
            return (Criteria) this;
        }

        public Criteria andCFacultyEqualTo(String value) {
            addCriterion("c_faculty =", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyNotEqualTo(String value) {
            addCriterion("c_faculty <>", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyGreaterThan(String value) {
            addCriterion("c_faculty >", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyGreaterThanOrEqualTo(String value) {
            addCriterion("c_faculty >=", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyLessThan(String value) {
            addCriterion("c_faculty <", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyLessThanOrEqualTo(String value) {
            addCriterion("c_faculty <=", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyLike(String value) {
            addCriterion("c_faculty like", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyNotLike(String value) {
            addCriterion("c_faculty not like", value, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyIn(List<String> values) {
            addCriterion("c_faculty in", values, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyNotIn(List<String> values) {
            addCriterion("c_faculty not in", values, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyBetween(String value1, String value2) {
            addCriterion("c_faculty between", value1, value2, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCFacultyNotBetween(String value1, String value2) {
            addCriterion("c_faculty not between", value1, value2, "cFaculty");
            return (Criteria) this;
        }

        public Criteria andCGradeIsNull() {
            addCriterion("c_grade is null");
            return (Criteria) this;
        }

        public Criteria andCGradeIsNotNull() {
            addCriterion("c_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCGradeEqualTo(String value) {
            addCriterion("c_grade =", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeNotEqualTo(String value) {
            addCriterion("c_grade <>", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeGreaterThan(String value) {
            addCriterion("c_grade >", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeGreaterThanOrEqualTo(String value) {
            addCriterion("c_grade >=", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeLessThan(String value) {
            addCriterion("c_grade <", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeLessThanOrEqualTo(String value) {
            addCriterion("c_grade <=", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeLike(String value) {
            addCriterion("c_grade like", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeNotLike(String value) {
            addCriterion("c_grade not like", value, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeIn(List<String> values) {
            addCriterion("c_grade in", values, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeNotIn(List<String> values) {
            addCriterion("c_grade not in", values, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeBetween(String value1, String value2) {
            addCriterion("c_grade between", value1, value2, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCGradeNotBetween(String value1, String value2) {
            addCriterion("c_grade not between", value1, value2, "cGrade");
            return (Criteria) this;
        }

        public Criteria andCNoIsNull() {
            addCriterion("c_no is null");
            return (Criteria) this;
        }

        public Criteria andCNoIsNotNull() {
            addCriterion("c_no is not null");
            return (Criteria) this;
        }

        public Criteria andCNoEqualTo(Integer value) {
            addCriterion("c_no =", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotEqualTo(Integer value) {
            addCriterion("c_no <>", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThan(Integer value) {
            addCriterion("c_no >", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_no >=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThan(Integer value) {
            addCriterion("c_no <", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThanOrEqualTo(Integer value) {
            addCriterion("c_no <=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoIn(List<Integer> values) {
            addCriterion("c_no in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotIn(List<Integer> values) {
            addCriterion("c_no not in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoBetween(Integer value1, Integer value2) {
            addCriterion("c_no between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotBetween(Integer value1, Integer value2) {
            addCriterion("c_no not between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCProfessionIsNull() {
            addCriterion("c_profession is null");
            return (Criteria) this;
        }

        public Criteria andCProfessionIsNotNull() {
            addCriterion("c_profession is not null");
            return (Criteria) this;
        }

        public Criteria andCProfessionEqualTo(String value) {
            addCriterion("c_profession =", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionNotEqualTo(String value) {
            addCriterion("c_profession <>", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionGreaterThan(String value) {
            addCriterion("c_profession >", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("c_profession >=", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionLessThan(String value) {
            addCriterion("c_profession <", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionLessThanOrEqualTo(String value) {
            addCriterion("c_profession <=", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionLike(String value) {
            addCriterion("c_profession like", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionNotLike(String value) {
            addCriterion("c_profession not like", value, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionIn(List<String> values) {
            addCriterion("c_profession in", values, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionNotIn(List<String> values) {
            addCriterion("c_profession not in", values, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionBetween(String value1, String value2) {
            addCriterion("c_profession between", value1, value2, "cProfession");
            return (Criteria) this;
        }

        public Criteria andCProfessionNotBetween(String value1, String value2) {
            addCriterion("c_profession not between", value1, value2, "cProfession");
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