package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwMeetingCycleRuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwMeetingCycleRuleCriteria() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andSequeceNoIsNull() {
            addCriterion("sequece_no is null");
            return (Criteria) this;
        }

        public Criteria andSequeceNoIsNotNull() {
            addCriterion("sequece_no is not null");
            return (Criteria) this;
        }

        public Criteria andSequeceNoEqualTo(String value) {
            addCriterion("sequece_no =", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoNotEqualTo(String value) {
            addCriterion("sequece_no <>", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoGreaterThan(String value) {
            addCriterion("sequece_no >", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoGreaterThanOrEqualTo(String value) {
            addCriterion("sequece_no >=", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoLessThan(String value) {
            addCriterion("sequece_no <", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoLessThanOrEqualTo(String value) {
            addCriterion("sequece_no <=", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoLike(String value) {
            addCriterion("sequece_no like", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoNotLike(String value) {
            addCriterion("sequece_no not like", value, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoIn(List<String> values) {
            addCriterion("sequece_no in", values, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoNotIn(List<String> values) {
            addCriterion("sequece_no not in", values, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoBetween(String value1, String value2) {
            addCriterion("sequece_no between", value1, value2, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andSequeceNoNotBetween(String value1, String value2) {
            addCriterion("sequece_no not between", value1, value2, "sequeceNo");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Byte value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Byte value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Byte value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Byte value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Byte value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Byte> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Byte> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Byte value1, Byte value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Byte value1, Byte value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNull() {
            addCriterion("meeting_date is null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNotNull() {
            addCriterion("meeting_date is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateEqualTo(Byte value) {
            addCriterion("meeting_date =", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotEqualTo(Byte value) {
            addCriterion("meeting_date <>", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThan(Byte value) {
            addCriterion("meeting_date >", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThanOrEqualTo(Byte value) {
            addCriterion("meeting_date >=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThan(Byte value) {
            addCriterion("meeting_date <", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThanOrEqualTo(Byte value) {
            addCriterion("meeting_date <=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIn(List<Byte> values) {
            addCriterion("meeting_date in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotIn(List<Byte> values) {
            addCriterion("meeting_date not in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateBetween(Byte value1, Byte value2) {
            addCriterion("meeting_date between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotBetween(Byte value1, Byte value2) {
            addCriterion("meeting_date not between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateIsNull() {
            addCriterion("cycle_start_date is null");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateIsNotNull() {
            addCriterion("cycle_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateEqualTo(Date value) {
            addCriterion("cycle_start_date =", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateNotEqualTo(Date value) {
            addCriterion("cycle_start_date <>", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateGreaterThan(Date value) {
            addCriterion("cycle_start_date >", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cycle_start_date >=", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateLessThan(Date value) {
            addCriterion("cycle_start_date <", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateLessThanOrEqualTo(Date value) {
            addCriterion("cycle_start_date <=", value, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateIn(List<Date> values) {
            addCriterion("cycle_start_date in", values, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateNotIn(List<Date> values) {
            addCriterion("cycle_start_date not in", values, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateBetween(Date value1, Date value2) {
            addCriterion("cycle_start_date between", value1, value2, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartDateNotBetween(Date value1, Date value2) {
            addCriterion("cycle_start_date not between", value1, value2, "cycleStartDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIsNull() {
            addCriterion("cycle_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIsNotNull() {
            addCriterion("cycle_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateEqualTo(Date value) {
            addCriterion("cycle_end_date =", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotEqualTo(Date value) {
            addCriterion("cycle_end_date <>", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateGreaterThan(Date value) {
            addCriterion("cycle_end_date >", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cycle_end_date >=", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateLessThan(Date value) {
            addCriterion("cycle_end_date <", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateLessThanOrEqualTo(Date value) {
            addCriterion("cycle_end_date <=", value, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateIn(List<Date> values) {
            addCriterion("cycle_end_date in", values, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotIn(List<Date> values) {
            addCriterion("cycle_end_date not in", values, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateBetween(Date value1, Date value2) {
            addCriterion("cycle_end_date between", value1, value2, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleEndDateNotBetween(Date value1, Date value2) {
            addCriterion("cycle_end_date not between", value1, value2, "cycleEndDate");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeIsNull() {
            addCriterion("cycle_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeIsNotNull() {
            addCriterion("cycle_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeEqualTo(String value) {
            addCriterion("cycle_start_time =", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeNotEqualTo(String value) {
            addCriterion("cycle_start_time <>", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeGreaterThan(String value) {
            addCriterion("cycle_start_time >", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_start_time >=", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeLessThan(String value) {
            addCriterion("cycle_start_time <", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeLessThanOrEqualTo(String value) {
            addCriterion("cycle_start_time <=", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeLike(String value) {
            addCriterion("cycle_start_time like", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeNotLike(String value) {
            addCriterion("cycle_start_time not like", value, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeIn(List<String> values) {
            addCriterion("cycle_start_time in", values, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeNotIn(List<String> values) {
            addCriterion("cycle_start_time not in", values, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeBetween(String value1, String value2) {
            addCriterion("cycle_start_time between", value1, value2, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleStartTimeNotBetween(String value1, String value2) {
            addCriterion("cycle_start_time not between", value1, value2, "cycleStartTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeIsNull() {
            addCriterion("cycle_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeIsNotNull() {
            addCriterion("cycle_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeEqualTo(String value) {
            addCriterion("cycle_end_time =", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeNotEqualTo(String value) {
            addCriterion("cycle_end_time <>", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeGreaterThan(String value) {
            addCriterion("cycle_end_time >", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_end_time >=", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeLessThan(String value) {
            addCriterion("cycle_end_time <", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeLessThanOrEqualTo(String value) {
            addCriterion("cycle_end_time <=", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeLike(String value) {
            addCriterion("cycle_end_time like", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeNotLike(String value) {
            addCriterion("cycle_end_time not like", value, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeIn(List<String> values) {
            addCriterion("cycle_end_time in", values, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeNotIn(List<String> values) {
            addCriterion("cycle_end_time not in", values, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeBetween(String value1, String value2) {
            addCriterion("cycle_end_time between", value1, value2, "cycleEndTime");
            return (Criteria) this;
        }

        public Criteria andCycleEndTimeNotBetween(String value1, String value2) {
            addCriterion("cycle_end_time not between", value1, value2, "cycleEndTime");
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