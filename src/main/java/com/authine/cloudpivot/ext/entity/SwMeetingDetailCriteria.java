package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwMeetingDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwMeetingDetailCriteria() {
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

        public Criteria andSwMeetingIdIsNull() {
            addCriterion("sw_meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdIsNotNull() {
            addCriterion("sw_meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdEqualTo(String value) {
            addCriterion("sw_meeting_id =", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdNotEqualTo(String value) {
            addCriterion("sw_meeting_id <>", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdGreaterThan(String value) {
            addCriterion("sw_meeting_id >", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdGreaterThanOrEqualTo(String value) {
            addCriterion("sw_meeting_id >=", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdLessThan(String value) {
            addCriterion("sw_meeting_id <", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdLessThanOrEqualTo(String value) {
            addCriterion("sw_meeting_id <=", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdLike(String value) {
            addCriterion("sw_meeting_id like", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdNotLike(String value) {
            addCriterion("sw_meeting_id not like", value, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdIn(List<String> values) {
            addCriterion("sw_meeting_id in", values, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdNotIn(List<String> values) {
            addCriterion("sw_meeting_id not in", values, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdBetween(String value1, String value2) {
            addCriterion("sw_meeting_id between", value1, value2, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andSwMeetingIdNotBetween(String value1, String value2) {
            addCriterion("sw_meeting_id not between", value1, value2, "swMeetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleIsNull() {
            addCriterion("meeting_title is null");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleIsNotNull() {
            addCriterion("meeting_title is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleEqualTo(String value) {
            addCriterion("meeting_title =", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleNotEqualTo(String value) {
            addCriterion("meeting_title <>", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleGreaterThan(String value) {
            addCriterion("meeting_title >", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_title >=", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleLessThan(String value) {
            addCriterion("meeting_title <", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleLessThanOrEqualTo(String value) {
            addCriterion("meeting_title <=", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleLike(String value) {
            addCriterion("meeting_title like", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleNotLike(String value) {
            addCriterion("meeting_title not like", value, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleIn(List<String> values) {
            addCriterion("meeting_title in", values, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleNotIn(List<String> values) {
            addCriterion("meeting_title not in", values, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleBetween(String value1, String value2) {
            addCriterion("meeting_title between", value1, value2, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andMeetingTitleNotBetween(String value1, String value2) {
            addCriterion("meeting_title not between", value1, value2, "meetingTitle");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
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

        public Criteria andDataUserIsNull() {
            addCriterion("data_user is null");
            return (Criteria) this;
        }

        public Criteria andDataUserIsNotNull() {
            addCriterion("data_user is not null");
            return (Criteria) this;
        }

        public Criteria andDataUserEqualTo(String value) {
            addCriterion("data_user =", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotEqualTo(String value) {
            addCriterion("data_user <>", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserGreaterThan(String value) {
            addCriterion("data_user >", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserGreaterThanOrEqualTo(String value) {
            addCriterion("data_user >=", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLessThan(String value) {
            addCriterion("data_user <", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLessThanOrEqualTo(String value) {
            addCriterion("data_user <=", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLike(String value) {
            addCriterion("data_user like", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotLike(String value) {
            addCriterion("data_user not like", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserIn(List<String> values) {
            addCriterion("data_user in", values, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotIn(List<String> values) {
            addCriterion("data_user not in", values, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserBetween(String value1, String value2) {
            addCriterion("data_user between", value1, value2, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotBetween(String value1, String value2) {
            addCriterion("data_user not between", value1, value2, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNull() {
            addCriterion("data_time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("data_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_time not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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