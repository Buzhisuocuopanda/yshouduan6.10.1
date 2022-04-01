package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizWorkflowInstanceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizWorkflowInstanceCriteria() {
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

        public Criteria andInstancenameIsNull() {
            addCriterion("instanceName is null");
            return (Criteria) this;
        }

        public Criteria andInstancenameIsNotNull() {
            addCriterion("instanceName is not null");
            return (Criteria) this;
        }

        public Criteria andInstancenameEqualTo(String value) {
            addCriterion("instanceName =", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameNotEqualTo(String value) {
            addCriterion("instanceName <>", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameGreaterThan(String value) {
            addCriterion("instanceName >", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameGreaterThanOrEqualTo(String value) {
            addCriterion("instanceName >=", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameLessThan(String value) {
            addCriterion("instanceName <", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameLessThanOrEqualTo(String value) {
            addCriterion("instanceName <=", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameLike(String value) {
            addCriterion("instanceName like", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameNotLike(String value) {
            addCriterion("instanceName not like", value, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameIn(List<String> values) {
            addCriterion("instanceName in", values, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameNotIn(List<String> values) {
            addCriterion("instanceName not in", values, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameBetween(String value1, String value2) {
            addCriterion("instanceName between", value1, value2, "instancename");
            return (Criteria) this;
        }

        public Criteria andInstancenameNotBetween(String value1, String value2) {
            addCriterion("instanceName not between", value1, value2, "instancename");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeIsNull() {
            addCriterion("workflowCode is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeIsNotNull() {
            addCriterion("workflowCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeEqualTo(String value) {
            addCriterion("workflowCode =", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeNotEqualTo(String value) {
            addCriterion("workflowCode <>", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeGreaterThan(String value) {
            addCriterion("workflowCode >", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeGreaterThanOrEqualTo(String value) {
            addCriterion("workflowCode >=", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeLessThan(String value) {
            addCriterion("workflowCode <", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeLessThanOrEqualTo(String value) {
            addCriterion("workflowCode <=", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeLike(String value) {
            addCriterion("workflowCode like", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeNotLike(String value) {
            addCriterion("workflowCode not like", value, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeIn(List<String> values) {
            addCriterion("workflowCode in", values, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeNotIn(List<String> values) {
            addCriterion("workflowCode not in", values, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeBetween(String value1, String value2) {
            addCriterion("workflowCode between", value1, value2, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowcodeNotBetween(String value1, String value2) {
            addCriterion("workflowCode not between", value1, value2, "workflowcode");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionIsNull() {
            addCriterion("workflowVersion is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionIsNotNull() {
            addCriterion("workflowVersion is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionEqualTo(Integer value) {
            addCriterion("workflowVersion =", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionNotEqualTo(Integer value) {
            addCriterion("workflowVersion <>", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionGreaterThan(Integer value) {
            addCriterion("workflowVersion >", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("workflowVersion >=", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionLessThan(Integer value) {
            addCriterion("workflowVersion <", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionLessThanOrEqualTo(Integer value) {
            addCriterion("workflowVersion <=", value, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionIn(List<Integer> values) {
            addCriterion("workflowVersion in", values, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionNotIn(List<Integer> values) {
            addCriterion("workflowVersion not in", values, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionBetween(Integer value1, Integer value2) {
            addCriterion("workflowVersion between", value1, value2, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andWorkflowversionNotBetween(Integer value1, Integer value2) {
            addCriterion("workflowVersion not between", value1, value2, "workflowversion");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNull() {
            addCriterion("originator is null");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNotNull() {
            addCriterion("originator is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatorEqualTo(String value) {
            addCriterion("originator =", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotEqualTo(String value) {
            addCriterion("originator <>", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThan(String value) {
            addCriterion("originator >", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThanOrEqualTo(String value) {
            addCriterion("originator >=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThan(String value) {
            addCriterion("originator <", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThanOrEqualTo(String value) {
            addCriterion("originator <=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLike(String value) {
            addCriterion("originator like", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotLike(String value) {
            addCriterion("originator not like", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorIn(List<String> values) {
            addCriterion("originator in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotIn(List<String> values) {
            addCriterion("originator not in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorBetween(String value1, String value2) {
            addCriterion("originator between", value1, value2, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotBetween(String value1, String value2) {
            addCriterion("originator not between", value1, value2, "originator");
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

        public Criteria andParticipantIsNull() {
            addCriterion("participant is null");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNotNull() {
            addCriterion("participant is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantEqualTo(String value) {
            addCriterion("participant =", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotEqualTo(String value) {
            addCriterion("participant <>", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThan(String value) {
            addCriterion("participant >", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThanOrEqualTo(String value) {
            addCriterion("participant >=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThan(String value) {
            addCriterion("participant <", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThanOrEqualTo(String value) {
            addCriterion("participant <=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLike(String value) {
            addCriterion("participant like", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotLike(String value) {
            addCriterion("participant not like", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantIn(List<String> values) {
            addCriterion("participant in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotIn(List<String> values) {
            addCriterion("participant not in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantBetween(String value1, String value2) {
            addCriterion("participant between", value1, value2, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotBetween(String value1, String value2) {
            addCriterion("participant not between", value1, value2, "participant");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNull() {
            addCriterion("usedTime is null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNotNull() {
            addCriterion("usedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeEqualTo(Long value) {
            addCriterion("usedTime =", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotEqualTo(Long value) {
            addCriterion("usedTime <>", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThan(Long value) {
            addCriterion("usedTime >", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("usedTime >=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThan(Long value) {
            addCriterion("usedTime <", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThanOrEqualTo(Long value) {
            addCriterion("usedTime <=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIn(List<Long> values) {
            addCriterion("usedTime in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotIn(List<Long> values) {
            addCriterion("usedTime not in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeBetween(Long value1, Long value2) {
            addCriterion("usedTime between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotBetween(Long value1, Long value2) {
            addCriterion("usedTime not between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andWaittimeIsNull() {
            addCriterion("waitTime is null");
            return (Criteria) this;
        }

        public Criteria andWaittimeIsNotNull() {
            addCriterion("waitTime is not null");
            return (Criteria) this;
        }

        public Criteria andWaittimeEqualTo(Long value) {
            addCriterion("waitTime =", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeNotEqualTo(Long value) {
            addCriterion("waitTime <>", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeGreaterThan(Long value) {
            addCriterion("waitTime >", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeGreaterThanOrEqualTo(Long value) {
            addCriterion("waitTime >=", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeLessThan(Long value) {
            addCriterion("waitTime <", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeLessThanOrEqualTo(Long value) {
            addCriterion("waitTime <=", value, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeIn(List<Long> values) {
            addCriterion("waitTime in", values, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeNotIn(List<Long> values) {
            addCriterion("waitTime not in", values, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeBetween(Long value1, Long value2) {
            addCriterion("waitTime between", value1, value2, "waittime");
            return (Criteria) this;
        }

        public Criteria andWaittimeNotBetween(Long value1, Long value2) {
            addCriterion("waitTime not between", value1, value2, "waittime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameIsNull() {
            addCriterion("originatorName is null");
            return (Criteria) this;
        }

        public Criteria andOriginatornameIsNotNull() {
            addCriterion("originatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatornameEqualTo(String value) {
            addCriterion("originatorName =", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameNotEqualTo(String value) {
            addCriterion("originatorName <>", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameGreaterThan(String value) {
            addCriterion("originatorName >", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameGreaterThanOrEqualTo(String value) {
            addCriterion("originatorName >=", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameLessThan(String value) {
            addCriterion("originatorName <", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameLessThanOrEqualTo(String value) {
            addCriterion("originatorName <=", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameLike(String value) {
            addCriterion("originatorName like", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameNotLike(String value) {
            addCriterion("originatorName not like", value, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameIn(List<String> values) {
            addCriterion("originatorName in", values, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameNotIn(List<String> values) {
            addCriterion("originatorName not in", values, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameBetween(String value1, String value2) {
            addCriterion("originatorName between", value1, value2, "originatorname");
            return (Criteria) this;
        }

        public Criteria andOriginatornameNotBetween(String value1, String value2) {
            addCriterion("originatorName not between", value1, value2, "originatorname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andStatevalueIsNull() {
            addCriterion("stateValue is null");
            return (Criteria) this;
        }

        public Criteria andStatevalueIsNotNull() {
            addCriterion("stateValue is not null");
            return (Criteria) this;
        }

        public Criteria andStatevalueEqualTo(Integer value) {
            addCriterion("stateValue =", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueNotEqualTo(Integer value) {
            addCriterion("stateValue <>", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueGreaterThan(Integer value) {
            addCriterion("stateValue >", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateValue >=", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueLessThan(Integer value) {
            addCriterion("stateValue <", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueLessThanOrEqualTo(Integer value) {
            addCriterion("stateValue <=", value, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueIn(List<Integer> values) {
            addCriterion("stateValue in", values, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueNotIn(List<Integer> values) {
            addCriterion("stateValue not in", values, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueBetween(Integer value1, Integer value2) {
            addCriterion("stateValue between", value1, value2, "statevalue");
            return (Criteria) this;
        }

        public Criteria andStatevalueNotBetween(Integer value1, Integer value2) {
            addCriterion("stateValue not between", value1, value2, "statevalue");
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

        public Criteria andAppcodeIsNull() {
            addCriterion("appCode is null");
            return (Criteria) this;
        }

        public Criteria andAppcodeIsNotNull() {
            addCriterion("appCode is not null");
            return (Criteria) this;
        }

        public Criteria andAppcodeEqualTo(String value) {
            addCriterion("appCode =", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotEqualTo(String value) {
            addCriterion("appCode <>", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThan(String value) {
            addCriterion("appCode >", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThanOrEqualTo(String value) {
            addCriterion("appCode >=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThan(String value) {
            addCriterion("appCode <", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThanOrEqualTo(String value) {
            addCriterion("appCode <=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLike(String value) {
            addCriterion("appCode like", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotLike(String value) {
            addCriterion("appCode not like", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeIn(List<String> values) {
            addCriterion("appCode in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotIn(List<String> values) {
            addCriterion("appCode not in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeBetween(String value1, String value2) {
            addCriterion("appCode between", value1, value2, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotBetween(String value1, String value2) {
            addCriterion("appCode not between", value1, value2, "appcode");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidIsNull() {
            addCriterion("sheetBizObjectId is null");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidIsNotNull() {
            addCriterion("sheetBizObjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidEqualTo(String value) {
            addCriterion("sheetBizObjectId =", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidNotEqualTo(String value) {
            addCriterion("sheetBizObjectId <>", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidGreaterThan(String value) {
            addCriterion("sheetBizObjectId >", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidGreaterThanOrEqualTo(String value) {
            addCriterion("sheetBizObjectId >=", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidLessThan(String value) {
            addCriterion("sheetBizObjectId <", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidLessThanOrEqualTo(String value) {
            addCriterion("sheetBizObjectId <=", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidLike(String value) {
            addCriterion("sheetBizObjectId like", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidNotLike(String value) {
            addCriterion("sheetBizObjectId not like", value, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidIn(List<String> values) {
            addCriterion("sheetBizObjectId in", values, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidNotIn(List<String> values) {
            addCriterion("sheetBizObjectId not in", values, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidBetween(String value1, String value2) {
            addCriterion("sheetBizObjectId between", value1, value2, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetbizobjectidNotBetween(String value1, String value2) {
            addCriterion("sheetBizObjectId not between", value1, value2, "sheetbizobjectid");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeIsNull() {
            addCriterion("sheetSchemaCode is null");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeIsNotNull() {
            addCriterion("sheetSchemaCode is not null");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeEqualTo(String value) {
            addCriterion("sheetSchemaCode =", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeNotEqualTo(String value) {
            addCriterion("sheetSchemaCode <>", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeGreaterThan(String value) {
            addCriterion("sheetSchemaCode >", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeGreaterThanOrEqualTo(String value) {
            addCriterion("sheetSchemaCode >=", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeLessThan(String value) {
            addCriterion("sheetSchemaCode <", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeLessThanOrEqualTo(String value) {
            addCriterion("sheetSchemaCode <=", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeLike(String value) {
            addCriterion("sheetSchemaCode like", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeNotLike(String value) {
            addCriterion("sheetSchemaCode not like", value, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeIn(List<String> values) {
            addCriterion("sheetSchemaCode in", values, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeNotIn(List<String> values) {
            addCriterion("sheetSchemaCode not in", values, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeBetween(String value1, String value2) {
            addCriterion("sheetSchemaCode between", value1, value2, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSheetschemacodeNotBetween(String value1, String value2) {
            addCriterion("sheetSchemaCode not between", value1, value2, "sheetschemacode");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNull() {
            addCriterion("sequenceNo is null");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNotNull() {
            addCriterion("sequenceNo is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenoEqualTo(String value) {
            addCriterion("sequenceNo =", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotEqualTo(String value) {
            addCriterion("sequenceNo <>", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThan(String value) {
            addCriterion("sequenceNo >", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("sequenceNo >=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThan(String value) {
            addCriterion("sequenceNo <", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThanOrEqualTo(String value) {
            addCriterion("sequenceNo <=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLike(String value) {
            addCriterion("sequenceNo like", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotLike(String value) {
            addCriterion("sequenceNo not like", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoIn(List<String> values) {
            addCriterion("sequenceNo in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotIn(List<String> values) {
            addCriterion("sequenceNo not in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoBetween(String value1, String value2) {
            addCriterion("sequenceNo between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotBetween(String value1, String value2) {
            addCriterion("sequenceNo not between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andTrusteeIsNull() {
            addCriterion("trustee is null");
            return (Criteria) this;
        }

        public Criteria andTrusteeIsNotNull() {
            addCriterion("trustee is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteeEqualTo(String value) {
            addCriterion("trustee =", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotEqualTo(String value) {
            addCriterion("trustee <>", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeGreaterThan(String value) {
            addCriterion("trustee >", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeGreaterThanOrEqualTo(String value) {
            addCriterion("trustee >=", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLessThan(String value) {
            addCriterion("trustee <", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLessThanOrEqualTo(String value) {
            addCriterion("trustee <=", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeLike(String value) {
            addCriterion("trustee like", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotLike(String value) {
            addCriterion("trustee not like", value, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeIn(List<String> values) {
            addCriterion("trustee in", values, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotIn(List<String> values) {
            addCriterion("trustee not in", values, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeBetween(String value1, String value2) {
            addCriterion("trustee between", value1, value2, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteeNotBetween(String value1, String value2) {
            addCriterion("trustee not between", value1, value2, "trustee");
            return (Criteria) this;
        }

        public Criteria andTrusteenameIsNull() {
            addCriterion("trusteeName is null");
            return (Criteria) this;
        }

        public Criteria andTrusteenameIsNotNull() {
            addCriterion("trusteeName is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteenameEqualTo(String value) {
            addCriterion("trusteeName =", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameNotEqualTo(String value) {
            addCriterion("trusteeName <>", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameGreaterThan(String value) {
            addCriterion("trusteeName >", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameGreaterThanOrEqualTo(String value) {
            addCriterion("trusteeName >=", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameLessThan(String value) {
            addCriterion("trusteeName <", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameLessThanOrEqualTo(String value) {
            addCriterion("trusteeName <=", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameLike(String value) {
            addCriterion("trusteeName like", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameNotLike(String value) {
            addCriterion("trusteeName not like", value, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameIn(List<String> values) {
            addCriterion("trusteeName in", values, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameNotIn(List<String> values) {
            addCriterion("trusteeName not in", values, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameBetween(String value1, String value2) {
            addCriterion("trusteeName between", value1, value2, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusteenameNotBetween(String value1, String value2) {
            addCriterion("trusteeName not between", value1, value2, "trusteename");
            return (Criteria) this;
        }

        public Criteria andTrusttypeIsNull() {
            addCriterion("trustType is null");
            return (Criteria) this;
        }

        public Criteria andTrusttypeIsNotNull() {
            addCriterion("trustType is not null");
            return (Criteria) this;
        }

        public Criteria andTrusttypeEqualTo(String value) {
            addCriterion("trustType =", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeNotEqualTo(String value) {
            addCriterion("trustType <>", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeGreaterThan(String value) {
            addCriterion("trustType >", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("trustType >=", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeLessThan(String value) {
            addCriterion("trustType <", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeLessThanOrEqualTo(String value) {
            addCriterion("trustType <=", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeLike(String value) {
            addCriterion("trustType like", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeNotLike(String value) {
            addCriterion("trustType not like", value, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeIn(List<String> values) {
            addCriterion("trustType in", values, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeNotIn(List<String> values) {
            addCriterion("trustType not in", values, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeBetween(String value1, String value2) {
            addCriterion("trustType between", value1, value2, "trusttype");
            return (Criteria) this;
        }

        public Criteria andTrusttypeNotBetween(String value1, String value2) {
            addCriterion("trustType not between", value1, value2, "trusttype");
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

        public Criteria andDatatypeIsNull() {
            addCriterion("dataType is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("dataType is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("dataType =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("dataType <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("dataType >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("dataType >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("dataType <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("dataType <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("dataType like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("dataType not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("dataType in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("dataType not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("dataType between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("dataType not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andRunmodeIsNull() {
            addCriterion("runMode is null");
            return (Criteria) this;
        }

        public Criteria andRunmodeIsNotNull() {
            addCriterion("runMode is not null");
            return (Criteria) this;
        }

        public Criteria andRunmodeEqualTo(String value) {
            addCriterion("runMode =", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeNotEqualTo(String value) {
            addCriterion("runMode <>", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeGreaterThan(String value) {
            addCriterion("runMode >", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeGreaterThanOrEqualTo(String value) {
            addCriterion("runMode >=", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeLessThan(String value) {
            addCriterion("runMode <", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeLessThanOrEqualTo(String value) {
            addCriterion("runMode <=", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeLike(String value) {
            addCriterion("runMode like", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeNotLike(String value) {
            addCriterion("runMode not like", value, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeIn(List<String> values) {
            addCriterion("runMode in", values, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeNotIn(List<String> values) {
            addCriterion("runMode not in", values, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeBetween(String value1, String value2) {
            addCriterion("runMode between", value1, value2, "runmode");
            return (Criteria) this;
        }

        public Criteria andRunmodeNotBetween(String value1, String value2) {
            addCriterion("runMode not between", value1, value2, "runmode");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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