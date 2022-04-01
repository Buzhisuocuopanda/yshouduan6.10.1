package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwMeetingZoomCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwMeetingZoomCriteria() {
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

        public Criteria andMeetingUriIsNull() {
            addCriterion("meeting_uri is null");
            return (Criteria) this;
        }

        public Criteria andMeetingUriIsNotNull() {
            addCriterion("meeting_uri is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingUriEqualTo(String value) {
            addCriterion("meeting_uri =", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriNotEqualTo(String value) {
            addCriterion("meeting_uri <>", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriGreaterThan(String value) {
            addCriterion("meeting_uri >", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_uri >=", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriLessThan(String value) {
            addCriterion("meeting_uri <", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriLessThanOrEqualTo(String value) {
            addCriterion("meeting_uri <=", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriLike(String value) {
            addCriterion("meeting_uri like", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriNotLike(String value) {
            addCriterion("meeting_uri not like", value, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriIn(List<String> values) {
            addCriterion("meeting_uri in", values, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriNotIn(List<String> values) {
            addCriterion("meeting_uri not in", values, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriBetween(String value1, String value2) {
            addCriterion("meeting_uri between", value1, value2, "meetingUri");
            return (Criteria) this;
        }

        public Criteria andMeetingUriNotBetween(String value1, String value2) {
            addCriterion("meeting_uri not between", value1, value2, "meetingUri");
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

        public Criteria andSlotIsNull() {
            addCriterion("slot is null");
            return (Criteria) this;
        }

        public Criteria andSlotIsNotNull() {
            addCriterion("slot is not null");
            return (Criteria) this;
        }

        public Criteria andSlotEqualTo(Integer value) {
            addCriterion("slot =", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotEqualTo(Integer value) {
            addCriterion("slot <>", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotGreaterThan(Integer value) {
            addCriterion("slot >", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot >=", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotLessThan(Integer value) {
            addCriterion("slot <", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotLessThanOrEqualTo(Integer value) {
            addCriterion("slot <=", value, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotIn(List<Integer> values) {
            addCriterion("slot in", values, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotIn(List<Integer> values) {
            addCriterion("slot not in", values, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotBetween(Integer value1, Integer value2) {
            addCriterion("slot between", value1, value2, "slot");
            return (Criteria) this;
        }

        public Criteria andSlotNotBetween(Integer value1, Integer value2) {
            addCriterion("slot not between", value1, value2, "slot");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminIsNull() {
            addCriterion("meeting_admin is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminIsNotNull() {
            addCriterion("meeting_admin is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminEqualTo(String value) {
            addCriterion("meeting_admin =", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNotEqualTo(String value) {
            addCriterion("meeting_admin <>", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminGreaterThan(String value) {
            addCriterion("meeting_admin >", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_admin >=", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminLessThan(String value) {
            addCriterion("meeting_admin <", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminLessThanOrEqualTo(String value) {
            addCriterion("meeting_admin <=", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminLike(String value) {
            addCriterion("meeting_admin like", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNotLike(String value) {
            addCriterion("meeting_admin not like", value, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminIn(List<String> values) {
            addCriterion("meeting_admin in", values, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNotIn(List<String> values) {
            addCriterion("meeting_admin not in", values, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminBetween(String value1, String value2) {
            addCriterion("meeting_admin between", value1, value2, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNotBetween(String value1, String value2) {
            addCriterion("meeting_admin not between", value1, value2, "meetingAdmin");
            return (Criteria) this;
        }

        public Criteria andIfCheckIsNull() {
            addCriterion("if_check is null");
            return (Criteria) this;
        }

        public Criteria andIfCheckIsNotNull() {
            addCriterion("if_check is not null");
            return (Criteria) this;
        }

        public Criteria andIfCheckEqualTo(Byte value) {
            addCriterion("if_check =", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckNotEqualTo(Byte value) {
            addCriterion("if_check <>", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckGreaterThan(Byte value) {
            addCriterion("if_check >", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_check >=", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckLessThan(Byte value) {
            addCriterion("if_check <", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckLessThanOrEqualTo(Byte value) {
            addCriterion("if_check <=", value, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckIn(List<Byte> values) {
            addCriterion("if_check in", values, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckNotIn(List<Byte> values) {
            addCriterion("if_check not in", values, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckBetween(Byte value1, Byte value2) {
            addCriterion("if_check between", value1, value2, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIfCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("if_check not between", value1, value2, "ifCheck");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("is_disabled is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("is_disabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Byte value) {
            addCriterion("is_disabled =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Byte value) {
            addCriterion("is_disabled <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Byte value) {
            addCriterion("is_disabled >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_disabled >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Byte value) {
            addCriterion("is_disabled <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Byte value) {
            addCriterion("is_disabled <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Byte> values) {
            addCriterion("is_disabled in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Byte> values) {
            addCriterion("is_disabled not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Byte value1, Byte value2) {
            addCriterion("is_disabled between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Byte value1, Byte value2) {
            addCriterion("is_disabled not between", value1, value2, "isDisabled");
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

        public Criteria andMeetingAdminNameIsNull() {
            addCriterion("meeting_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameIsNotNull() {
            addCriterion("meeting_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameEqualTo(String value) {
            addCriterion("meeting_admin_name =", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameNotEqualTo(String value) {
            addCriterion("meeting_admin_name <>", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameGreaterThan(String value) {
            addCriterion("meeting_admin_name >", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_admin_name >=", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameLessThan(String value) {
            addCriterion("meeting_admin_name <", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_admin_name <=", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameLike(String value) {
            addCriterion("meeting_admin_name like", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameNotLike(String value) {
            addCriterion("meeting_admin_name not like", value, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameIn(List<String> values) {
            addCriterion("meeting_admin_name in", values, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameNotIn(List<String> values) {
            addCriterion("meeting_admin_name not in", values, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameBetween(String value1, String value2) {
            addCriterion("meeting_admin_name between", value1, value2, "meetingAdminName");
            return (Criteria) this;
        }

        public Criteria andMeetingAdminNameNotBetween(String value1, String value2) {
            addCriterion("meeting_admin_name not between", value1, value2, "meetingAdminName");
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