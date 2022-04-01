package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HOrgUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HOrgUserCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNull() {
            addCriterion("extend1 is null");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNotNull() {
            addCriterion("extend1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend1EqualTo(String value) {
            addCriterion("extend1 =", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotEqualTo(String value) {
            addCriterion("extend1 <>", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThan(String value) {
            addCriterion("extend1 >", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThanOrEqualTo(String value) {
            addCriterion("extend1 >=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThan(String value) {
            addCriterion("extend1 <", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThanOrEqualTo(String value) {
            addCriterion("extend1 <=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Like(String value) {
            addCriterion("extend1 like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotLike(String value) {
            addCriterion("extend1 not like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1In(List<String> values) {
            addCriterion("extend1 in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotIn(List<String> values) {
            addCriterion("extend1 not in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Between(String value1, String value2) {
            addCriterion("extend1 between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotBetween(String value1, String value2) {
            addCriterion("extend1 not between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNull() {
            addCriterion("extend2 is null");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNotNull() {
            addCriterion("extend2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend2EqualTo(String value) {
            addCriterion("extend2 =", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotEqualTo(String value) {
            addCriterion("extend2 <>", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThan(String value) {
            addCriterion("extend2 >", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThanOrEqualTo(String value) {
            addCriterion("extend2 >=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThan(String value) {
            addCriterion("extend2 <", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThanOrEqualTo(String value) {
            addCriterion("extend2 <=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Like(String value) {
            addCriterion("extend2 like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotLike(String value) {
            addCriterion("extend2 not like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2In(List<String> values) {
            addCriterion("extend2 in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotIn(List<String> values) {
            addCriterion("extend2 not in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Between(String value1, String value2) {
            addCriterion("extend2 between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotBetween(String value1, String value2) {
            addCriterion("extend2 not between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNull() {
            addCriterion("extend3 is null");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNotNull() {
            addCriterion("extend3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend3EqualTo(String value) {
            addCriterion("extend3 =", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotEqualTo(String value) {
            addCriterion("extend3 <>", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThan(String value) {
            addCriterion("extend3 >", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThanOrEqualTo(String value) {
            addCriterion("extend3 >=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThan(String value) {
            addCriterion("extend3 <", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThanOrEqualTo(String value) {
            addCriterion("extend3 <=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Like(String value) {
            addCriterion("extend3 like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotLike(String value) {
            addCriterion("extend3 not like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3In(List<String> values) {
            addCriterion("extend3 in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotIn(List<String> values) {
            addCriterion("extend3 not in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Between(String value1, String value2) {
            addCriterion("extend3 between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotBetween(String value1, String value2) {
            addCriterion("extend3 not between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNull() {
            addCriterion("extend4 is null");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNotNull() {
            addCriterion("extend4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend4EqualTo(Integer value) {
            addCriterion("extend4 =", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotEqualTo(Integer value) {
            addCriterion("extend4 <>", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThan(Integer value) {
            addCriterion("extend4 >", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThanOrEqualTo(Integer value) {
            addCriterion("extend4 >=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThan(Integer value) {
            addCriterion("extend4 <", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThanOrEqualTo(Integer value) {
            addCriterion("extend4 <=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4In(List<Integer> values) {
            addCriterion("extend4 in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotIn(List<Integer> values) {
            addCriterion("extend4 not in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4Between(Integer value1, Integer value2) {
            addCriterion("extend4 between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotBetween(Integer value1, Integer value2) {
            addCriterion("extend4 not between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNull() {
            addCriterion("extend5 is null");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNotNull() {
            addCriterion("extend5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend5EqualTo(Integer value) {
            addCriterion("extend5 =", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotEqualTo(Integer value) {
            addCriterion("extend5 <>", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThan(Integer value) {
            addCriterion("extend5 >", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThanOrEqualTo(Integer value) {
            addCriterion("extend5 >=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThan(Integer value) {
            addCriterion("extend5 <", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThanOrEqualTo(Integer value) {
            addCriterion("extend5 <=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5In(List<Integer> values) {
            addCriterion("extend5 in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotIn(List<Integer> values) {
            addCriterion("extend5 not in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5Between(Integer value1, Integer value2) {
            addCriterion("extend5 between", value1, value2, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotBetween(Integer value1, Integer value2) {
            addCriterion("extend5 not between", value1, value2, "extend5");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedTime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(Date value) {
            addCriterion("modifiedTime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(Date value) {
            addCriterion("modifiedTime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(Date value) {
            addCriterion("modifiedTime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedTime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(Date value) {
            addCriterion("modifiedTime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("modifiedTime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<Date> values) {
            addCriterion("modifiedTime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<Date> values) {
            addCriterion("modifiedTime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("modifiedTime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("modifiedTime not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Boolean value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Boolean value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Boolean value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Boolean value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Boolean> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Boolean> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAppellationIsNull() {
            addCriterion("appellation is null");
            return (Criteria) this;
        }

        public Criteria andAppellationIsNotNull() {
            addCriterion("appellation is not null");
            return (Criteria) this;
        }

        public Criteria andAppellationEqualTo(String value) {
            addCriterion("appellation =", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotEqualTo(String value) {
            addCriterion("appellation <>", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThan(String value) {
            addCriterion("appellation >", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("appellation >=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThan(String value) {
            addCriterion("appellation <", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThanOrEqualTo(String value) {
            addCriterion("appellation <=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLike(String value) {
            addCriterion("appellation like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotLike(String value) {
            addCriterion("appellation not like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationIn(List<String> values) {
            addCriterion("appellation in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotIn(List<String> values) {
            addCriterion("appellation not in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationBetween(String value1, String value2) {
            addCriterion("appellation between", value1, value2, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotBetween(String value1, String value2) {
            addCriterion("appellation not between", value1, value2, "appellation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBossIsNull() {
            addCriterion("boss is null");
            return (Criteria) this;
        }

        public Criteria andBossIsNotNull() {
            addCriterion("boss is not null");
            return (Criteria) this;
        }

        public Criteria andBossEqualTo(Boolean value) {
            addCriterion("boss =", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossNotEqualTo(Boolean value) {
            addCriterion("boss <>", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossGreaterThan(Boolean value) {
            addCriterion("boss >", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossGreaterThanOrEqualTo(Boolean value) {
            addCriterion("boss >=", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossLessThan(Boolean value) {
            addCriterion("boss <", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossLessThanOrEqualTo(Boolean value) {
            addCriterion("boss <=", value, "boss");
            return (Criteria) this;
        }

        public Criteria andBossIn(List<Boolean> values) {
            addCriterion("boss in", values, "boss");
            return (Criteria) this;
        }

        public Criteria andBossNotIn(List<Boolean> values) {
            addCriterion("boss not in", values, "boss");
            return (Criteria) this;
        }

        public Criteria andBossBetween(Boolean value1, Boolean value2) {
            addCriterion("boss between", value1, value2, "boss");
            return (Criteria) this;
        }

        public Criteria andBossNotBetween(Boolean value1, Boolean value2) {
            addCriterion("boss not between", value1, value2, "boss");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("departmentId like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("departmentId not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNull() {
            addCriterion("departureDate is null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNotNull() {
            addCriterion("departureDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateEqualTo(Date value) {
            addCriterion("departureDate =", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotEqualTo(Date value) {
            addCriterion("departureDate <>", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThan(Date value) {
            addCriterion("departureDate >", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterion("departureDate >=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThan(Date value) {
            addCriterion("departureDate <", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThanOrEqualTo(Date value) {
            addCriterion("departureDate <=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIn(List<Date> values) {
            addCriterion("departureDate in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotIn(List<Date> values) {
            addCriterion("departureDate not in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateBetween(Date value1, Date value2) {
            addCriterion("departureDate between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotBetween(Date value1, Date value2) {
            addCriterion("departureDate not between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDingtalkidIsNull() {
            addCriterion("dingtalkId is null");
            return (Criteria) this;
        }

        public Criteria andDingtalkidIsNotNull() {
            addCriterion("dingtalkId is not null");
            return (Criteria) this;
        }

        public Criteria andDingtalkidEqualTo(String value) {
            addCriterion("dingtalkId =", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidNotEqualTo(String value) {
            addCriterion("dingtalkId <>", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidGreaterThan(String value) {
            addCriterion("dingtalkId >", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidGreaterThanOrEqualTo(String value) {
            addCriterion("dingtalkId >=", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidLessThan(String value) {
            addCriterion("dingtalkId <", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidLessThanOrEqualTo(String value) {
            addCriterion("dingtalkId <=", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidLike(String value) {
            addCriterion("dingtalkId like", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidNotLike(String value) {
            addCriterion("dingtalkId not like", value, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidIn(List<String> values) {
            addCriterion("dingtalkId in", values, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidNotIn(List<String> values) {
            addCriterion("dingtalkId not in", values, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidBetween(String value1, String value2) {
            addCriterion("dingtalkId between", value1, value2, "dingtalkid");
            return (Criteria) this;
        }

        public Criteria andDingtalkidNotBetween(String value1, String value2) {
            addCriterion("dingtalkId not between", value1, value2, "dingtalkid");
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

        public Criteria andEmployeenoIsNull() {
            addCriterion("employeeNo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenoIsNotNull() {
            addCriterion("employeeNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenoEqualTo(String value) {
            addCriterion("employeeNo =", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoNotEqualTo(String value) {
            addCriterion("employeeNo <>", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoGreaterThan(String value) {
            addCriterion("employeeNo >", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoGreaterThanOrEqualTo(String value) {
            addCriterion("employeeNo >=", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoLessThan(String value) {
            addCriterion("employeeNo <", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoLessThanOrEqualTo(String value) {
            addCriterion("employeeNo <=", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoLike(String value) {
            addCriterion("employeeNo like", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoNotLike(String value) {
            addCriterion("employeeNo not like", value, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoIn(List<String> values) {
            addCriterion("employeeNo in", values, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoNotIn(List<String> values) {
            addCriterion("employeeNo not in", values, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoBetween(String value1, String value2) {
            addCriterion("employeeNo between", value1, value2, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeenoNotBetween(String value1, String value2) {
            addCriterion("employeeNo not between", value1, value2, "employeeno");
            return (Criteria) this;
        }

        public Criteria andEmployeerankIsNull() {
            addCriterion("employeeRank is null");
            return (Criteria) this;
        }

        public Criteria andEmployeerankIsNotNull() {
            addCriterion("employeeRank is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeerankEqualTo(Integer value) {
            addCriterion("employeeRank =", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankNotEqualTo(Integer value) {
            addCriterion("employeeRank <>", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankGreaterThan(Integer value) {
            addCriterion("employeeRank >", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeRank >=", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankLessThan(Integer value) {
            addCriterion("employeeRank <", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankLessThanOrEqualTo(Integer value) {
            addCriterion("employeeRank <=", value, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankIn(List<Integer> values) {
            addCriterion("employeeRank in", values, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankNotIn(List<Integer> values) {
            addCriterion("employeeRank not in", values, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankBetween(Integer value1, Integer value2) {
            addCriterion("employeeRank between", value1, value2, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEmployeerankNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeRank not between", value1, value2, "employeerank");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNull() {
            addCriterion("entryDate is null");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNotNull() {
            addCriterion("entryDate is not null");
            return (Criteria) this;
        }

        public Criteria andEntrydateEqualTo(Date value) {
            addCriterion("entryDate =", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotEqualTo(Date value) {
            addCriterion("entryDate <>", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThan(Date value) {
            addCriterion("entryDate >", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThanOrEqualTo(Date value) {
            addCriterion("entryDate >=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThan(Date value) {
            addCriterion("entryDate <", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThanOrEqualTo(Date value) {
            addCriterion("entryDate <=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateIn(List<Date> values) {
            addCriterion("entryDate in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotIn(List<Date> values) {
            addCriterion("entryDate not in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateBetween(Date value1, Date value2) {
            addCriterion("entryDate between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotBetween(Date value1, Date value2) {
            addCriterion("entryDate not between", value1, value2, "entrydate");
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

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIsNull() {
            addCriterion("identityNo is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIsNotNull() {
            addCriterion("identityNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynoEqualTo(String value) {
            addCriterion("identityNo =", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotEqualTo(String value) {
            addCriterion("identityNo <>", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoGreaterThan(String value) {
            addCriterion("identityNo >", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoGreaterThanOrEqualTo(String value) {
            addCriterion("identityNo >=", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLessThan(String value) {
            addCriterion("identityNo <", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLessThanOrEqualTo(String value) {
            addCriterion("identityNo <=", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoLike(String value) {
            addCriterion("identityNo like", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotLike(String value) {
            addCriterion("identityNo not like", value, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoIn(List<String> values) {
            addCriterion("identityNo in", values, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotIn(List<String> values) {
            addCriterion("identityNo not in", values, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoBetween(String value1, String value2) {
            addCriterion("identityNo between", value1, value2, "identityno");
            return (Criteria) this;
        }

        public Criteria andIdentitynoNotBetween(String value1, String value2) {
            addCriterion("identityNo not between", value1, value2, "identityno");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(Boolean value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(Boolean value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(Boolean value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(Boolean value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(Boolean value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<Boolean> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<Boolean> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(Boolean value1, Boolean value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(String value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(String value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(String value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(String value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(String value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(String value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLike(String value) {
            addCriterion("managerId like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotLike(String value) {
            addCriterion("managerId not like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<String> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<String> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(String value1, String value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(String value1, String value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNull() {
            addCriterion("officePhone is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNotNull() {
            addCriterion("officePhone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneEqualTo(String value) {
            addCriterion("officePhone =", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotEqualTo(String value) {
            addCriterion("officePhone <>", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThan(String value) {
            addCriterion("officePhone >", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("officePhone >=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThan(String value) {
            addCriterion("officePhone <", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThanOrEqualTo(String value) {
            addCriterion("officePhone <=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLike(String value) {
            addCriterion("officePhone like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotLike(String value) {
            addCriterion("officePhone not like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIn(List<String> values) {
            addCriterion("officePhone in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotIn(List<String> values) {
            addCriterion("officePhone not in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneBetween(String value1, String value2) {
            addCriterion("officePhone between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotBetween(String value1, String value2) {
            addCriterion("officePhone not between", value1, value2, "officephone");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelIsNull() {
            addCriterion("privacyLevel is null");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelIsNotNull() {
            addCriterion("privacyLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelEqualTo(String value) {
            addCriterion("privacyLevel =", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelNotEqualTo(String value) {
            addCriterion("privacyLevel <>", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelGreaterThan(String value) {
            addCriterion("privacyLevel >", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelGreaterThanOrEqualTo(String value) {
            addCriterion("privacyLevel >=", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelLessThan(String value) {
            addCriterion("privacyLevel <", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelLessThanOrEqualTo(String value) {
            addCriterion("privacyLevel <=", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelLike(String value) {
            addCriterion("privacyLevel like", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelNotLike(String value) {
            addCriterion("privacyLevel not like", value, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelIn(List<String> values) {
            addCriterion("privacyLevel in", values, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelNotIn(List<String> values) {
            addCriterion("privacyLevel not in", values, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelBetween(String value1, String value2) {
            addCriterion("privacyLevel between", value1, value2, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andPrivacylevelNotBetween(String value1, String value2) {
            addCriterion("privacyLevel not between", value1, value2, "privacylevel");
            return (Criteria) this;
        }

        public Criteria andSecretaryidIsNull() {
            addCriterion("secretaryId is null");
            return (Criteria) this;
        }

        public Criteria andSecretaryidIsNotNull() {
            addCriterion("secretaryId is not null");
            return (Criteria) this;
        }

        public Criteria andSecretaryidEqualTo(String value) {
            addCriterion("secretaryId =", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidNotEqualTo(String value) {
            addCriterion("secretaryId <>", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidGreaterThan(String value) {
            addCriterion("secretaryId >", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidGreaterThanOrEqualTo(String value) {
            addCriterion("secretaryId >=", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidLessThan(String value) {
            addCriterion("secretaryId <", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidLessThanOrEqualTo(String value) {
            addCriterion("secretaryId <=", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidLike(String value) {
            addCriterion("secretaryId like", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidNotLike(String value) {
            addCriterion("secretaryId not like", value, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidIn(List<String> values) {
            addCriterion("secretaryId in", values, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidNotIn(List<String> values) {
            addCriterion("secretaryId not in", values, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidBetween(String value1, String value2) {
            addCriterion("secretaryId between", value1, value2, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSecretaryidNotBetween(String value1, String value2) {
            addCriterion("secretaryId not between", value1, value2, "secretaryid");
            return (Criteria) this;
        }

        public Criteria andSortkeyIsNull() {
            addCriterion("sortKey is null");
            return (Criteria) this;
        }

        public Criteria andSortkeyIsNotNull() {
            addCriterion("sortKey is not null");
            return (Criteria) this;
        }

        public Criteria andSortkeyEqualTo(Long value) {
            addCriterion("sortKey =", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyNotEqualTo(Long value) {
            addCriterion("sortKey <>", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyGreaterThan(Long value) {
            addCriterion("sortKey >", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyGreaterThanOrEqualTo(Long value) {
            addCriterion("sortKey >=", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyLessThan(Long value) {
            addCriterion("sortKey <", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyLessThanOrEqualTo(Long value) {
            addCriterion("sortKey <=", value, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyIn(List<Long> values) {
            addCriterion("sortKey in", values, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyNotIn(List<Long> values) {
            addCriterion("sortKey not in", values, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyBetween(Long value1, Long value2) {
            addCriterion("sortKey between", value1, value2, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSortkeyNotBetween(Long value1, Long value2) {
            addCriterion("sortKey not between", value1, value2, "sortkey");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNull() {
            addCriterion("sourceId is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("sourceId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(String value) {
            addCriterion("sourceId =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(String value) {
            addCriterion("sourceId <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(String value) {
            addCriterion("sourceId >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(String value) {
            addCriterion("sourceId >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(String value) {
            addCriterion("sourceId <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(String value) {
            addCriterion("sourceId <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLike(String value) {
            addCriterion("sourceId like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotLike(String value) {
            addCriterion("sourceId not like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<String> values) {
            addCriterion("sourceId in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<String> values) {
            addCriterion("sourceId not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(String value1, String value2) {
            addCriterion("sourceId between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(String value1, String value2) {
            addCriterion("sourceId not between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinYin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinYin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinYin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinYin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinYin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinYin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinYin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinYin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinYin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinYin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinYin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinYin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinYin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinYin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinIsNull() {
            addCriterion("shortPinYin is null");
            return (Criteria) this;
        }

        public Criteria andShortpinyinIsNotNull() {
            addCriterion("shortPinYin is not null");
            return (Criteria) this;
        }

        public Criteria andShortpinyinEqualTo(String value) {
            addCriterion("shortPinYin =", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinNotEqualTo(String value) {
            addCriterion("shortPinYin <>", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinGreaterThan(String value) {
            addCriterion("shortPinYin >", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinGreaterThanOrEqualTo(String value) {
            addCriterion("shortPinYin >=", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinLessThan(String value) {
            addCriterion("shortPinYin <", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinLessThanOrEqualTo(String value) {
            addCriterion("shortPinYin <=", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinLike(String value) {
            addCriterion("shortPinYin like", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinNotLike(String value) {
            addCriterion("shortPinYin not like", value, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinIn(List<String> values) {
            addCriterion("shortPinYin in", values, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinNotIn(List<String> values) {
            addCriterion("shortPinYin not in", values, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinBetween(String value1, String value2) {
            addCriterion("shortPinYin between", value1, value2, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andShortpinyinNotBetween(String value1, String value2) {
            addCriterion("shortPinYin not between", value1, value2, "shortpinyin");
            return (Criteria) this;
        }

        public Criteria andImgurlidIsNull() {
            addCriterion("imgUrlId is null");
            return (Criteria) this;
        }

        public Criteria andImgurlidIsNotNull() {
            addCriterion("imgUrlId is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlidEqualTo(String value) {
            addCriterion("imgUrlId =", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidNotEqualTo(String value) {
            addCriterion("imgUrlId <>", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidGreaterThan(String value) {
            addCriterion("imgUrlId >", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrlId >=", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidLessThan(String value) {
            addCriterion("imgUrlId <", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidLessThanOrEqualTo(String value) {
            addCriterion("imgUrlId <=", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidLike(String value) {
            addCriterion("imgUrlId like", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidNotLike(String value) {
            addCriterion("imgUrlId not like", value, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidIn(List<String> values) {
            addCriterion("imgUrlId in", values, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidNotIn(List<String> values) {
            addCriterion("imgUrlId not in", values, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidBetween(String value1, String value2) {
            addCriterion("imgUrlId between", value1, value2, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andImgurlidNotBetween(String value1, String value2) {
            addCriterion("imgUrlId not between", value1, value2, "imgurlid");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNull() {
            addCriterion("corpId is null");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNotNull() {
            addCriterion("corpId is not null");
            return (Criteria) this;
        }

        public Criteria andCorpidEqualTo(String value) {
            addCriterion("corpId =", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotEqualTo(String value) {
            addCriterion("corpId <>", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThan(String value) {
            addCriterion("corpId >", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThanOrEqualTo(String value) {
            addCriterion("corpId >=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThan(String value) {
            addCriterion("corpId <", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThanOrEqualTo(String value) {
            addCriterion("corpId <=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLike(String value) {
            addCriterion("corpId like", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotLike(String value) {
            addCriterion("corpId not like", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidIn(List<String> values) {
            addCriterion("corpId in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotIn(List<String> values) {
            addCriterion("corpId not in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidBetween(String value1, String value2) {
            addCriterion("corpId between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotBetween(String value1, String value2) {
            addCriterion("corpId not between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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