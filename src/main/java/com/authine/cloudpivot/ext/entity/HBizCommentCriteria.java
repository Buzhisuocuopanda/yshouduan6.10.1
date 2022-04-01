package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HBizCommentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HBizCommentCriteria() {
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

        public Criteria andActiontypeIsNull() {
            addCriterion("actionType is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNotNull() {
            addCriterion("actionType is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeEqualTo(String value) {
            addCriterion("actionType =", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotEqualTo(String value) {
            addCriterion("actionType <>", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThan(String value) {
            addCriterion("actionType >", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("actionType >=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThan(String value) {
            addCriterion("actionType <", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThanOrEqualTo(String value) {
            addCriterion("actionType <=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLike(String value) {
            addCriterion("actionType like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotLike(String value) {
            addCriterion("actionType not like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeIn(List<String> values) {
            addCriterion("actionType in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotIn(List<String> values) {
            addCriterion("actionType not in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeBetween(String value1, String value2) {
            addCriterion("actionType between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotBetween(String value1, String value2) {
            addCriterion("actionType not between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActivitycodeIsNull() {
            addCriterion("activityCode is null");
            return (Criteria) this;
        }

        public Criteria andActivitycodeIsNotNull() {
            addCriterion("activityCode is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycodeEqualTo(String value) {
            addCriterion("activityCode =", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeNotEqualTo(String value) {
            addCriterion("activityCode <>", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeGreaterThan(String value) {
            addCriterion("activityCode >", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("activityCode >=", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeLessThan(String value) {
            addCriterion("activityCode <", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeLessThanOrEqualTo(String value) {
            addCriterion("activityCode <=", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeLike(String value) {
            addCriterion("activityCode like", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeNotLike(String value) {
            addCriterion("activityCode not like", value, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeIn(List<String> values) {
            addCriterion("activityCode in", values, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeNotIn(List<String> values) {
            addCriterion("activityCode not in", values, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeBetween(String value1, String value2) {
            addCriterion("activityCode between", value1, value2, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitycodeNotBetween(String value1, String value2) {
            addCriterion("activityCode not between", value1, value2, "activitycode");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNull() {
            addCriterion("activityName is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("activityName is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("activityName =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("activityName <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("activityName >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("activityName >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("activityName <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("activityName <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("activityName like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("activityName not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("activityName in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("activityName not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("activityName between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("activityName not between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andBizobjectidIsNull() {
            addCriterion("bizObjectId is null");
            return (Criteria) this;
        }

        public Criteria andBizobjectidIsNotNull() {
            addCriterion("bizObjectId is not null");
            return (Criteria) this;
        }

        public Criteria andBizobjectidEqualTo(String value) {
            addCriterion("bizObjectId =", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidNotEqualTo(String value) {
            addCriterion("bizObjectId <>", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidGreaterThan(String value) {
            addCriterion("bizObjectId >", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidGreaterThanOrEqualTo(String value) {
            addCriterion("bizObjectId >=", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidLessThan(String value) {
            addCriterion("bizObjectId <", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidLessThanOrEqualTo(String value) {
            addCriterion("bizObjectId <=", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidLike(String value) {
            addCriterion("bizObjectId like", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidNotLike(String value) {
            addCriterion("bizObjectId not like", value, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidIn(List<String> values) {
            addCriterion("bizObjectId in", values, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidNotIn(List<String> values) {
            addCriterion("bizObjectId not in", values, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidBetween(String value1, String value2) {
            addCriterion("bizObjectId between", value1, value2, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizobjectidNotBetween(String value1, String value2) {
            addCriterion("bizObjectId not between", value1, value2, "bizobjectid");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeIsNull() {
            addCriterion("bizPropertyCode is null");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeIsNotNull() {
            addCriterion("bizPropertyCode is not null");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeEqualTo(String value) {
            addCriterion("bizPropertyCode =", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeNotEqualTo(String value) {
            addCriterion("bizPropertyCode <>", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeGreaterThan(String value) {
            addCriterion("bizPropertyCode >", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeGreaterThanOrEqualTo(String value) {
            addCriterion("bizPropertyCode >=", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeLessThan(String value) {
            addCriterion("bizPropertyCode <", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeLessThanOrEqualTo(String value) {
            addCriterion("bizPropertyCode <=", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeLike(String value) {
            addCriterion("bizPropertyCode like", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeNotLike(String value) {
            addCriterion("bizPropertyCode not like", value, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeIn(List<String> values) {
            addCriterion("bizPropertyCode in", values, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeNotIn(List<String> values) {
            addCriterion("bizPropertyCode not in", values, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeBetween(String value1, String value2) {
            addCriterion("bizPropertyCode between", value1, value2, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andBizpropertycodeNotBetween(String value1, String value2) {
            addCriterion("bizPropertyCode not between", value1, value2, "bizpropertycode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andRelusersIsNull() {
            addCriterion("relUsers is null");
            return (Criteria) this;
        }

        public Criteria andRelusersIsNotNull() {
            addCriterion("relUsers is not null");
            return (Criteria) this;
        }

        public Criteria andRelusersEqualTo(String value) {
            addCriterion("relUsers =", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersNotEqualTo(String value) {
            addCriterion("relUsers <>", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersGreaterThan(String value) {
            addCriterion("relUsers >", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersGreaterThanOrEqualTo(String value) {
            addCriterion("relUsers >=", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersLessThan(String value) {
            addCriterion("relUsers <", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersLessThanOrEqualTo(String value) {
            addCriterion("relUsers <=", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersLike(String value) {
            addCriterion("relUsers like", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersNotLike(String value) {
            addCriterion("relUsers not like", value, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersIn(List<String> values) {
            addCriterion("relUsers in", values, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersNotIn(List<String> values) {
            addCriterion("relUsers not in", values, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersBetween(String value1, String value2) {
            addCriterion("relUsers between", value1, value2, "relusers");
            return (Criteria) this;
        }

        public Criteria andRelusersNotBetween(String value1, String value2) {
            addCriterion("relUsers not between", value1, value2, "relusers");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andSchemacodeIsNull() {
            addCriterion("schemaCode is null");
            return (Criteria) this;
        }

        public Criteria andSchemacodeIsNotNull() {
            addCriterion("schemaCode is not null");
            return (Criteria) this;
        }

        public Criteria andSchemacodeEqualTo(String value) {
            addCriterion("schemaCode =", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeNotEqualTo(String value) {
            addCriterion("schemaCode <>", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeGreaterThan(String value) {
            addCriterion("schemaCode >", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeGreaterThanOrEqualTo(String value) {
            addCriterion("schemaCode >=", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeLessThan(String value) {
            addCriterion("schemaCode <", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeLessThanOrEqualTo(String value) {
            addCriterion("schemaCode <=", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeLike(String value) {
            addCriterion("schemaCode like", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeNotLike(String value) {
            addCriterion("schemaCode not like", value, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeIn(List<String> values) {
            addCriterion("schemaCode in", values, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeNotIn(List<String> values) {
            addCriterion("schemaCode not in", values, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeBetween(String value1, String value2) {
            addCriterion("schemaCode between", value1, value2, "schemacode");
            return (Criteria) this;
        }

        public Criteria andSchemacodeNotBetween(String value1, String value2) {
            addCriterion("schemaCode not between", value1, value2, "schemacode");
            return (Criteria) this;
        }

        public Criteria andWorkitemidIsNull() {
            addCriterion("workItemId is null");
            return (Criteria) this;
        }

        public Criteria andWorkitemidIsNotNull() {
            addCriterion("workItemId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkitemidEqualTo(String value) {
            addCriterion("workItemId =", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidNotEqualTo(String value) {
            addCriterion("workItemId <>", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidGreaterThan(String value) {
            addCriterion("workItemId >", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidGreaterThanOrEqualTo(String value) {
            addCriterion("workItemId >=", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidLessThan(String value) {
            addCriterion("workItemId <", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidLessThanOrEqualTo(String value) {
            addCriterion("workItemId <=", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidLike(String value) {
            addCriterion("workItemId like", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidNotLike(String value) {
            addCriterion("workItemId not like", value, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidIn(List<String> values) {
            addCriterion("workItemId in", values, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidNotIn(List<String> values) {
            addCriterion("workItemId not in", values, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidBetween(String value1, String value2) {
            addCriterion("workItemId between", value1, value2, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkitemidNotBetween(String value1, String value2) {
            addCriterion("workItemId not between", value1, value2, "workitemid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidIsNull() {
            addCriterion("workflowInstanceId is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidIsNotNull() {
            addCriterion("workflowInstanceId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidEqualTo(String value) {
            addCriterion("workflowInstanceId =", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidNotEqualTo(String value) {
            addCriterion("workflowInstanceId <>", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidGreaterThan(String value) {
            addCriterion("workflowInstanceId >", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("workflowInstanceId >=", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidLessThan(String value) {
            addCriterion("workflowInstanceId <", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidLessThanOrEqualTo(String value) {
            addCriterion("workflowInstanceId <=", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidLike(String value) {
            addCriterion("workflowInstanceId like", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidNotLike(String value) {
            addCriterion("workflowInstanceId not like", value, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidIn(List<String> values) {
            addCriterion("workflowInstanceId in", values, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidNotIn(List<String> values) {
            addCriterion("workflowInstanceId not in", values, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidBetween(String value1, String value2) {
            addCriterion("workflowInstanceId between", value1, value2, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowinstanceidNotBetween(String value1, String value2) {
            addCriterion("workflowInstanceId not between", value1, value2, "workflowinstanceid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidIsNull() {
            addCriterion("workflowTokenId is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidIsNotNull() {
            addCriterion("workflowTokenId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidEqualTo(String value) {
            addCriterion("workflowTokenId =", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidNotEqualTo(String value) {
            addCriterion("workflowTokenId <>", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidGreaterThan(String value) {
            addCriterion("workflowTokenId >", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidGreaterThanOrEqualTo(String value) {
            addCriterion("workflowTokenId >=", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidLessThan(String value) {
            addCriterion("workflowTokenId <", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidLessThanOrEqualTo(String value) {
            addCriterion("workflowTokenId <=", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidLike(String value) {
            addCriterion("workflowTokenId like", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidNotLike(String value) {
            addCriterion("workflowTokenId not like", value, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidIn(List<String> values) {
            addCriterion("workflowTokenId in", values, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidNotIn(List<String> values) {
            addCriterion("workflowTokenId not in", values, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidBetween(String value1, String value2) {
            addCriterion("workflowTokenId between", value1, value2, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andWorkflowtokenidNotBetween(String value1, String value2) {
            addCriterion("workflowTokenId not between", value1, value2, "workflowtokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidIsNull() {
            addCriterion("tokenId is null");
            return (Criteria) this;
        }

        public Criteria andTokenidIsNotNull() {
            addCriterion("tokenId is not null");
            return (Criteria) this;
        }

        public Criteria andTokenidEqualTo(Integer value) {
            addCriterion("tokenId =", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotEqualTo(Integer value) {
            addCriterion("tokenId <>", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidGreaterThan(Integer value) {
            addCriterion("tokenId >", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tokenId >=", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidLessThan(Integer value) {
            addCriterion("tokenId <", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidLessThanOrEqualTo(Integer value) {
            addCriterion("tokenId <=", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidIn(List<Integer> values) {
            addCriterion("tokenId in", values, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotIn(List<Integer> values) {
            addCriterion("tokenId not in", values, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidBetween(Integer value1, Integer value2) {
            addCriterion("tokenId between", value1, value2, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotBetween(Integer value1, Integer value2) {
            addCriterion("tokenId not between", value1, value2, "tokenid");
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