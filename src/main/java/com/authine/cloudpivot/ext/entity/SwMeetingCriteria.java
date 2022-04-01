package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwMeetingCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwMeetingCriteria() {
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

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
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

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIsNull() {
            addCriterion("meeting_status is null");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIsNotNull() {
            addCriterion("meeting_status is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusEqualTo(Byte value) {
            addCriterion("meeting_status =", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotEqualTo(Byte value) {
            addCriterion("meeting_status <>", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusGreaterThan(Byte value) {
            addCriterion("meeting_status >", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("meeting_status >=", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusLessThan(Byte value) {
            addCriterion("meeting_status <", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("meeting_status <=", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIn(List<Byte> values) {
            addCriterion("meeting_status in", values, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotIn(List<Byte> values) {
            addCriterion("meeting_status not in", values, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusBetween(Byte value1, Byte value2) {
            addCriterion("meeting_status between", value1, value2, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("meeting_status not between", value1, value2, "meetingStatus");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("meeting_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("meeting_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("meeting_name =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("meeting_name <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("meeting_name >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_name >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("meeting_name <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_name <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("meeting_name like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("meeting_name not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("meeting_name in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("meeting_name not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("meeting_name between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("meeting_name not between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNull() {
            addCriterion("meeting_type is null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNotNull() {
            addCriterion("meeting_type is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeEqualTo(String value) {
            addCriterion("meeting_type =", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotEqualTo(String value) {
            addCriterion("meeting_type <>", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThan(String value) {
            addCriterion("meeting_type >", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_type >=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThan(String value) {
            addCriterion("meeting_type <", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThanOrEqualTo(String value) {
            addCriterion("meeting_type <=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLike(String value) {
            addCriterion("meeting_type like", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotLike(String value) {
            addCriterion("meeting_type not like", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIn(List<String> values) {
            addCriterion("meeting_type in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotIn(List<String> values) {
            addCriterion("meeting_type not in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeBetween(String value1, String value2) {
            addCriterion("meeting_type between", value1, value2, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotBetween(String value1, String value2) {
            addCriterion("meeting_type not between", value1, value2, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIsNull() {
            addCriterion("meeting_host is null");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIsNotNull() {
            addCriterion("meeting_host is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingHostEqualTo(String value) {
            addCriterion("meeting_host =", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotEqualTo(String value) {
            addCriterion("meeting_host <>", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostGreaterThan(String value) {
            addCriterion("meeting_host >", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_host >=", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLessThan(String value) {
            addCriterion("meeting_host <", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLessThanOrEqualTo(String value) {
            addCriterion("meeting_host <=", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLike(String value) {
            addCriterion("meeting_host like", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotLike(String value) {
            addCriterion("meeting_host not like", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIn(List<String> values) {
            addCriterion("meeting_host in", values, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotIn(List<String> values) {
            addCriterion("meeting_host not in", values, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostBetween(String value1, String value2) {
            addCriterion("meeting_host between", value1, value2, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotBetween(String value1, String value2) {
            addCriterion("meeting_host not between", value1, value2, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdIsNull() {
            addCriterion("sw_meeting_zoom_id is null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdIsNotNull() {
            addCriterion("sw_meeting_zoom_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdEqualTo(String value) {
            addCriterion("sw_meeting_zoom_id =", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdNotEqualTo(String value) {
            addCriterion("sw_meeting_zoom_id <>", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdGreaterThan(String value) {
            addCriterion("sw_meeting_zoom_id >", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("sw_meeting_zoom_id >=", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdLessThan(String value) {
            addCriterion("sw_meeting_zoom_id <", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdLessThanOrEqualTo(String value) {
            addCriterion("sw_meeting_zoom_id <=", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdLike(String value) {
            addCriterion("sw_meeting_zoom_id like", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdNotLike(String value) {
            addCriterion("sw_meeting_zoom_id not like", value, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdIn(List<String> values) {
            addCriterion("sw_meeting_zoom_id in", values, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdNotIn(List<String> values) {
            addCriterion("sw_meeting_zoom_id not in", values, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdBetween(String value1, String value2) {
            addCriterion("sw_meeting_zoom_id between", value1, value2, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingZoomIdNotBetween(String value1, String value2) {
            addCriterion("sw_meeting_zoom_id not between", value1, value2, "swMeetingZoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomIsNull() {
            addCriterion("meeting_zoom is null");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomIsNotNull() {
            addCriterion("meeting_zoom is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomEqualTo(String value) {
            addCriterion("meeting_zoom =", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomNotEqualTo(String value) {
            addCriterion("meeting_zoom <>", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomGreaterThan(String value) {
            addCriterion("meeting_zoom >", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_zoom >=", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomLessThan(String value) {
            addCriterion("meeting_zoom <", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomLessThanOrEqualTo(String value) {
            addCriterion("meeting_zoom <=", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomLike(String value) {
            addCriterion("meeting_zoom like", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomNotLike(String value) {
            addCriterion("meeting_zoom not like", value, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomIn(List<String> values) {
            addCriterion("meeting_zoom in", values, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomNotIn(List<String> values) {
            addCriterion("meeting_zoom not in", values, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomBetween(String value1, String value2) {
            addCriterion("meeting_zoom between", value1, value2, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingZoomNotBetween(String value1, String value2) {
            addCriterion("meeting_zoom not between", value1, value2, "meetingZoom");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressIsNull() {
            addCriterion("meeting_address is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressIsNotNull() {
            addCriterion("meeting_address is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressEqualTo(String value) {
            addCriterion("meeting_address =", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressNotEqualTo(String value) {
            addCriterion("meeting_address <>", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressGreaterThan(String value) {
            addCriterion("meeting_address >", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_address >=", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressLessThan(String value) {
            addCriterion("meeting_address <", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressLessThanOrEqualTo(String value) {
            addCriterion("meeting_address <=", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressLike(String value) {
            addCriterion("meeting_address like", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressNotLike(String value) {
            addCriterion("meeting_address not like", value, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressIn(List<String> values) {
            addCriterion("meeting_address in", values, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressNotIn(List<String> values) {
            addCriterion("meeting_address not in", values, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressBetween(String value1, String value2) {
            addCriterion("meeting_address between", value1, value2, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingAddressNotBetween(String value1, String value2) {
            addCriterion("meeting_address not between", value1, value2, "meetingAddress");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalIsNull() {
            addCriterion("meeting_goal is null");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalIsNotNull() {
            addCriterion("meeting_goal is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalEqualTo(String value) {
            addCriterion("meeting_goal =", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalNotEqualTo(String value) {
            addCriterion("meeting_goal <>", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalGreaterThan(String value) {
            addCriterion("meeting_goal >", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_goal >=", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalLessThan(String value) {
            addCriterion("meeting_goal <", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalLessThanOrEqualTo(String value) {
            addCriterion("meeting_goal <=", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalLike(String value) {
            addCriterion("meeting_goal like", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalNotLike(String value) {
            addCriterion("meeting_goal not like", value, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalIn(List<String> values) {
            addCriterion("meeting_goal in", values, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalNotIn(List<String> values) {
            addCriterion("meeting_goal not in", values, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalBetween(String value1, String value2) {
            addCriterion("meeting_goal between", value1, value2, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andMeetingGoalNotBetween(String value1, String value2) {
            addCriterion("meeting_goal not between", value1, value2, "meetingGoal");
            return (Criteria) this;
        }

        public Criteria andDataUriIsNull() {
            addCriterion("data_uri is null");
            return (Criteria) this;
        }

        public Criteria andDataUriIsNotNull() {
            addCriterion("data_uri is not null");
            return (Criteria) this;
        }

        public Criteria andDataUriEqualTo(String value) {
            addCriterion("data_uri =", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriNotEqualTo(String value) {
            addCriterion("data_uri <>", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriGreaterThan(String value) {
            addCriterion("data_uri >", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriGreaterThanOrEqualTo(String value) {
            addCriterion("data_uri >=", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriLessThan(String value) {
            addCriterion("data_uri <", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriLessThanOrEqualTo(String value) {
            addCriterion("data_uri <=", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriLike(String value) {
            addCriterion("data_uri like", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriNotLike(String value) {
            addCriterion("data_uri not like", value, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriIn(List<String> values) {
            addCriterion("data_uri in", values, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriNotIn(List<String> values) {
            addCriterion("data_uri not in", values, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriBetween(String value1, String value2) {
            addCriterion("data_uri between", value1, value2, "dataUri");
            return (Criteria) this;
        }

        public Criteria andDataUriNotBetween(String value1, String value2) {
            addCriterion("data_uri not between", value1, value2, "dataUri");
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

        public Criteria andOrganPeopleIsNull() {
            addCriterion("organ_people is null");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleIsNotNull() {
            addCriterion("organ_people is not null");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleEqualTo(String value) {
            addCriterion("organ_people =", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleNotEqualTo(String value) {
            addCriterion("organ_people <>", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleGreaterThan(String value) {
            addCriterion("organ_people >", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("organ_people >=", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleLessThan(String value) {
            addCriterion("organ_people <", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleLessThanOrEqualTo(String value) {
            addCriterion("organ_people <=", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleLike(String value) {
            addCriterion("organ_people like", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleNotLike(String value) {
            addCriterion("organ_people not like", value, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleIn(List<String> values) {
            addCriterion("organ_people in", values, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleNotIn(List<String> values) {
            addCriterion("organ_people not in", values, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleBetween(String value1, String value2) {
            addCriterion("organ_people between", value1, value2, "organPeople");
            return (Criteria) this;
        }

        public Criteria andOrganPeopleNotBetween(String value1, String value2) {
            addCriterion("organ_people not between", value1, value2, "organPeople");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationIsNull() {
            addCriterion("meeting_organization is null");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationIsNotNull() {
            addCriterion("meeting_organization is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationEqualTo(String value) {
            addCriterion("meeting_organization =", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationNotEqualTo(String value) {
            addCriterion("meeting_organization <>", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationGreaterThan(String value) {
            addCriterion("meeting_organization >", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_organization >=", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationLessThan(String value) {
            addCriterion("meeting_organization <", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationLessThanOrEqualTo(String value) {
            addCriterion("meeting_organization <=", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationLike(String value) {
            addCriterion("meeting_organization like", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationNotLike(String value) {
            addCriterion("meeting_organization not like", value, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationIn(List<String> values) {
            addCriterion("meeting_organization in", values, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationNotIn(List<String> values) {
            addCriterion("meeting_organization not in", values, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationBetween(String value1, String value2) {
            addCriterion("meeting_organization between", value1, value2, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andMeetingOrganizationNotBetween(String value1, String value2) {
            addCriterion("meeting_organization not between", value1, value2, "meetingOrganization");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleIsNull() {
            addCriterion("summary_people is null");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleIsNotNull() {
            addCriterion("summary_people is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleEqualTo(String value) {
            addCriterion("summary_people =", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleNotEqualTo(String value) {
            addCriterion("summary_people <>", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleGreaterThan(String value) {
            addCriterion("summary_people >", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("summary_people >=", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleLessThan(String value) {
            addCriterion("summary_people <", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleLessThanOrEqualTo(String value) {
            addCriterion("summary_people <=", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleLike(String value) {
            addCriterion("summary_people like", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleNotLike(String value) {
            addCriterion("summary_people not like", value, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleIn(List<String> values) {
            addCriterion("summary_people in", values, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleNotIn(List<String> values) {
            addCriterion("summary_people not in", values, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleBetween(String value1, String value2) {
            addCriterion("summary_people between", value1, value2, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryPeopleNotBetween(String value1, String value2) {
            addCriterion("summary_people not between", value1, value2, "summaryPeople");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeIsNull() {
            addCriterion("summary_time is null");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeIsNotNull() {
            addCriterion("summary_time is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeEqualTo(Date value) {
            addCriterion("summary_time =", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeNotEqualTo(Date value) {
            addCriterion("summary_time <>", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeGreaterThan(Date value) {
            addCriterion("summary_time >", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("summary_time >=", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeLessThan(Date value) {
            addCriterion("summary_time <", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeLessThanOrEqualTo(Date value) {
            addCriterion("summary_time <=", value, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeIn(List<Date> values) {
            addCriterion("summary_time in", values, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeNotIn(List<Date> values) {
            addCriterion("summary_time not in", values, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeBetween(Date value1, Date value2) {
            addCriterion("summary_time between", value1, value2, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andSummaryTimeNotBetween(Date value1, Date value2) {
            addCriterion("summary_time not between", value1, value2, "summaryTime");
            return (Criteria) this;
        }

        public Criteria andScheduleResultIsNull() {
            addCriterion("schedule_result is null");
            return (Criteria) this;
        }

        public Criteria andScheduleResultIsNotNull() {
            addCriterion("schedule_result is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleResultEqualTo(String value) {
            addCriterion("schedule_result =", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultNotEqualTo(String value) {
            addCriterion("schedule_result <>", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultGreaterThan(String value) {
            addCriterion("schedule_result >", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_result >=", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultLessThan(String value) {
            addCriterion("schedule_result <", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultLessThanOrEqualTo(String value) {
            addCriterion("schedule_result <=", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultLike(String value) {
            addCriterion("schedule_result like", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultNotLike(String value) {
            addCriterion("schedule_result not like", value, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultIn(List<String> values) {
            addCriterion("schedule_result in", values, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultNotIn(List<String> values) {
            addCriterion("schedule_result not in", values, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultBetween(String value1, String value2) {
            addCriterion("schedule_result between", value1, value2, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andScheduleResultNotBetween(String value1, String value2) {
            addCriterion("schedule_result not between", value1, value2, "scheduleResult");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceIsNull() {
            addCriterion("meeting_device is null");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceIsNotNull() {
            addCriterion("meeting_device is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceEqualTo(String value) {
            addCriterion("meeting_device =", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceNotEqualTo(String value) {
            addCriterion("meeting_device <>", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceGreaterThan(String value) {
            addCriterion("meeting_device >", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_device >=", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceLessThan(String value) {
            addCriterion("meeting_device <", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceLessThanOrEqualTo(String value) {
            addCriterion("meeting_device <=", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceLike(String value) {
            addCriterion("meeting_device like", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceNotLike(String value) {
            addCriterion("meeting_device not like", value, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceIn(List<String> values) {
            addCriterion("meeting_device in", values, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceNotIn(List<String> values) {
            addCriterion("meeting_device not in", values, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceBetween(String value1, String value2) {
            addCriterion("meeting_device between", value1, value2, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingDeviceNotBetween(String value1, String value2) {
            addCriterion("meeting_device not between", value1, value2, "meetingDevice");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceIsNull() {
            addCriterion("meeting_service is null");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceIsNotNull() {
            addCriterion("meeting_service is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceEqualTo(String value) {
            addCriterion("meeting_service =", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceNotEqualTo(String value) {
            addCriterion("meeting_service <>", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceGreaterThan(String value) {
            addCriterion("meeting_service >", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_service >=", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceLessThan(String value) {
            addCriterion("meeting_service <", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceLessThanOrEqualTo(String value) {
            addCriterion("meeting_service <=", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceLike(String value) {
            addCriterion("meeting_service like", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceNotLike(String value) {
            addCriterion("meeting_service not like", value, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceIn(List<String> values) {
            addCriterion("meeting_service in", values, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceNotIn(List<String> values) {
            addCriterion("meeting_service not in", values, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceBetween(String value1, String value2) {
            addCriterion("meeting_service between", value1, value2, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingServiceNotBetween(String value1, String value2) {
            addCriterion("meeting_service not between", value1, value2, "meetingService");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutIsNull() {
            addCriterion("meeting_layout is null");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutIsNotNull() {
            addCriterion("meeting_layout is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutEqualTo(String value) {
            addCriterion("meeting_layout =", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutNotEqualTo(String value) {
            addCriterion("meeting_layout <>", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutGreaterThan(String value) {
            addCriterion("meeting_layout >", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_layout >=", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutLessThan(String value) {
            addCriterion("meeting_layout <", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutLessThanOrEqualTo(String value) {
            addCriterion("meeting_layout <=", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutLike(String value) {
            addCriterion("meeting_layout like", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutNotLike(String value) {
            addCriterion("meeting_layout not like", value, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutIn(List<String> values) {
            addCriterion("meeting_layout in", values, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutNotIn(List<String> values) {
            addCriterion("meeting_layout not in", values, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutBetween(String value1, String value2) {
            addCriterion("meeting_layout between", value1, value2, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andMeetingLayoutNotBetween(String value1, String value2) {
            addCriterion("meeting_layout not between", value1, value2, "meetingLayout");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgIsNull() {
            addCriterion("auidt_msg is null");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgIsNotNull() {
            addCriterion("auidt_msg is not null");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgEqualTo(String value) {
            addCriterion("auidt_msg =", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgNotEqualTo(String value) {
            addCriterion("auidt_msg <>", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgGreaterThan(String value) {
            addCriterion("auidt_msg >", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgGreaterThanOrEqualTo(String value) {
            addCriterion("auidt_msg >=", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgLessThan(String value) {
            addCriterion("auidt_msg <", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgLessThanOrEqualTo(String value) {
            addCriterion("auidt_msg <=", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgLike(String value) {
            addCriterion("auidt_msg like", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgNotLike(String value) {
            addCriterion("auidt_msg not like", value, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgIn(List<String> values) {
            addCriterion("auidt_msg in", values, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgNotIn(List<String> values) {
            addCriterion("auidt_msg not in", values, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgBetween(String value1, String value2) {
            addCriterion("auidt_msg between", value1, value2, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andAuidtMsgNotBetween(String value1, String value2) {
            addCriterion("auidt_msg not between", value1, value2, "auidtMsg");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeIsNull() {
            addCriterion("meeting_startTime is null");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeIsNotNull() {
            addCriterion("meeting_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeEqualTo(Date value) {
            addCriterion("meeting_startTime =", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeNotEqualTo(Date value) {
            addCriterion("meeting_startTime <>", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeGreaterThan(Date value) {
            addCriterion("meeting_startTime >", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_startTime >=", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeLessThan(Date value) {
            addCriterion("meeting_startTime <", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("meeting_startTime <=", value, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeIn(List<Date> values) {
            addCriterion("meeting_startTime in", values, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeNotIn(List<Date> values) {
            addCriterion("meeting_startTime not in", values, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeBetween(Date value1, Date value2) {
            addCriterion("meeting_startTime between", value1, value2, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("meeting_startTime not between", value1, value2, "meetingStarttime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeIsNull() {
            addCriterion("meeting_endTime is null");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeIsNotNull() {
            addCriterion("meeting_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeEqualTo(Date value) {
            addCriterion("meeting_endTime =", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeNotEqualTo(Date value) {
            addCriterion("meeting_endTime <>", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeGreaterThan(Date value) {
            addCriterion("meeting_endTime >", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_endTime >=", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeLessThan(Date value) {
            addCriterion("meeting_endTime <", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("meeting_endTime <=", value, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeIn(List<Date> values) {
            addCriterion("meeting_endTime in", values, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeNotIn(List<Date> values) {
            addCriterion("meeting_endTime not in", values, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeBetween(Date value1, Date value2) {
            addCriterion("meeting_endTime between", value1, value2, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andMeetingEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("meeting_endTime not between", value1, value2, "meetingEndtime");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdIsNull() {
            addCriterion("sw_meeting_cycle_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdIsNotNull() {
            addCriterion("sw_meeting_cycle_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdEqualTo(String value) {
            addCriterion("sw_meeting_cycle_rule_id =", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdNotEqualTo(String value) {
            addCriterion("sw_meeting_cycle_rule_id <>", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdGreaterThan(String value) {
            addCriterion("sw_meeting_cycle_rule_id >", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("sw_meeting_cycle_rule_id >=", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdLessThan(String value) {
            addCriterion("sw_meeting_cycle_rule_id <", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdLessThanOrEqualTo(String value) {
            addCriterion("sw_meeting_cycle_rule_id <=", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdLike(String value) {
            addCriterion("sw_meeting_cycle_rule_id like", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdNotLike(String value) {
            addCriterion("sw_meeting_cycle_rule_id not like", value, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdIn(List<String> values) {
            addCriterion("sw_meeting_cycle_rule_id in", values, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdNotIn(List<String> values) {
            addCriterion("sw_meeting_cycle_rule_id not in", values, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdBetween(String value1, String value2) {
            addCriterion("sw_meeting_cycle_rule_id between", value1, value2, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingCycleRuleIdNotBetween(String value1, String value2) {
            addCriterion("sw_meeting_cycle_rule_id not between", value1, value2, "swMeetingCycleRuleId");
            return (Criteria) this;
        }

        public Criteria andZoomAdminIsNull() {
            addCriterion("zoom_admin is null");
            return (Criteria) this;
        }

        public Criteria andZoomAdminIsNotNull() {
            addCriterion("zoom_admin is not null");
            return (Criteria) this;
        }

        public Criteria andZoomAdminEqualTo(String value) {
            addCriterion("zoom_admin =", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminNotEqualTo(String value) {
            addCriterion("zoom_admin <>", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminGreaterThan(String value) {
            addCriterion("zoom_admin >", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminGreaterThanOrEqualTo(String value) {
            addCriterion("zoom_admin >=", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminLessThan(String value) {
            addCriterion("zoom_admin <", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminLessThanOrEqualTo(String value) {
            addCriterion("zoom_admin <=", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminLike(String value) {
            addCriterion("zoom_admin like", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminNotLike(String value) {
            addCriterion("zoom_admin not like", value, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminIn(List<String> values) {
            addCriterion("zoom_admin in", values, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminNotIn(List<String> values) {
            addCriterion("zoom_admin not in", values, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminBetween(String value1, String value2) {
            addCriterion("zoom_admin between", value1, value2, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andZoomAdminNotBetween(String value1, String value2) {
            addCriterion("zoom_admin not between", value1, value2, "zoomAdmin");
            return (Criteria) this;
        }

        public Criteria andTranNoIsNull() {
            addCriterion("tran_no is null");
            return (Criteria) this;
        }

        public Criteria andTranNoIsNotNull() {
            addCriterion("tran_no is not null");
            return (Criteria) this;
        }

        public Criteria andTranNoEqualTo(String value) {
            addCriterion("tran_no =", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotEqualTo(String value) {
            addCriterion("tran_no <>", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThan(String value) {
            addCriterion("tran_no >", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThanOrEqualTo(String value) {
            addCriterion("tran_no >=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThan(String value) {
            addCriterion("tran_no <", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThanOrEqualTo(String value) {
            addCriterion("tran_no <=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLike(String value) {
            addCriterion("tran_no like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotLike(String value) {
            addCriterion("tran_no not like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoIn(List<String> values) {
            addCriterion("tran_no in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotIn(List<String> values) {
            addCriterion("tran_no not in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoBetween(String value1, String value2) {
            addCriterion("tran_no between", value1, value2, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotBetween(String value1, String value2) {
            addCriterion("tran_no not between", value1, value2, "tranNo");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdIsNull() {
            addCriterion("biz_object_id is null");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdIsNotNull() {
            addCriterion("biz_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdEqualTo(String value) {
            addCriterion("biz_object_id =", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdNotEqualTo(String value) {
            addCriterion("biz_object_id <>", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdGreaterThan(String value) {
            addCriterion("biz_object_id >", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_object_id >=", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdLessThan(String value) {
            addCriterion("biz_object_id <", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdLessThanOrEqualTo(String value) {
            addCriterion("biz_object_id <=", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdLike(String value) {
            addCriterion("biz_object_id like", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdNotLike(String value) {
            addCriterion("biz_object_id not like", value, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdIn(List<String> values) {
            addCriterion("biz_object_id in", values, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdNotIn(List<String> values) {
            addCriterion("biz_object_id not in", values, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdBetween(String value1, String value2) {
            addCriterion("biz_object_id between", value1, value2, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andBizObjectIdNotBetween(String value1, String value2) {
            addCriterion("biz_object_id not between", value1, value2, "bizObjectId");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceIsNull() {
            addCriterion("workflow_instance is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceIsNotNull() {
            addCriterion("workflow_instance is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceEqualTo(String value) {
            addCriterion("workflow_instance =", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceNotEqualTo(String value) {
            addCriterion("workflow_instance <>", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceGreaterThan(String value) {
            addCriterion("workflow_instance >", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_instance >=", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceLessThan(String value) {
            addCriterion("workflow_instance <", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceLessThanOrEqualTo(String value) {
            addCriterion("workflow_instance <=", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceLike(String value) {
            addCriterion("workflow_instance like", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceNotLike(String value) {
            addCriterion("workflow_instance not like", value, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceIn(List<String> values) {
            addCriterion("workflow_instance in", values, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceNotIn(List<String> values) {
            addCriterion("workflow_instance not in", values, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceBetween(String value1, String value2) {
            addCriterion("workflow_instance between", value1, value2, "workflowInstance");
            return (Criteria) this;
        }

        public Criteria andWorkflowInstanceNotBetween(String value1, String value2) {
            addCriterion("workflow_instance not between", value1, value2, "workflowInstance");
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