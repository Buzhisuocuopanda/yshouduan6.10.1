package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwStoreCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwStoreCriteria() {
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

        public Criteria andYsResultIsNull() {
            addCriterion("ys_result is null");
            return (Criteria) this;
        }

        public Criteria andYsResultIsNotNull() {
            addCriterion("ys_result is not null");
            return (Criteria) this;
        }

        public Criteria andYsResultEqualTo(String value) {
            addCriterion("ys_result =", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultNotEqualTo(String value) {
            addCriterion("ys_result <>", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultGreaterThan(String value) {
            addCriterion("ys_result >", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultGreaterThanOrEqualTo(String value) {
            addCriterion("ys_result >=", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultLessThan(String value) {
            addCriterion("ys_result <", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultLessThanOrEqualTo(String value) {
            addCriterion("ys_result <=", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultLike(String value) {
            addCriterion("ys_result like", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultNotLike(String value) {
            addCriterion("ys_result not like", value, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultIn(List<String> values) {
            addCriterion("ys_result in", values, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultNotIn(List<String> values) {
            addCriterion("ys_result not in", values, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultBetween(String value1, String value2) {
            addCriterion("ys_result between", value1, value2, "ysResult");
            return (Criteria) this;
        }

        public Criteria andYsResultNotBetween(String value1, String value2) {
            addCriterion("ys_result not between", value1, value2, "ysResult");
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

        public Criteria andEndCommitIsNull() {
            addCriterion("end_commit is null");
            return (Criteria) this;
        }

        public Criteria andEndCommitIsNotNull() {
            addCriterion("end_commit is not null");
            return (Criteria) this;
        }

        public Criteria andEndCommitEqualTo(Byte value) {
            addCriterion("end_commit =", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitNotEqualTo(Byte value) {
            addCriterion("end_commit <>", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitGreaterThan(Byte value) {
            addCriterion("end_commit >", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitGreaterThanOrEqualTo(Byte value) {
            addCriterion("end_commit >=", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitLessThan(Byte value) {
            addCriterion("end_commit <", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitLessThanOrEqualTo(Byte value) {
            addCriterion("end_commit <=", value, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitIn(List<Byte> values) {
            addCriterion("end_commit in", values, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitNotIn(List<Byte> values) {
            addCriterion("end_commit not in", values, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitBetween(Byte value1, Byte value2) {
            addCriterion("end_commit between", value1, value2, "endCommit");
            return (Criteria) this;
        }

        public Criteria andEndCommitNotBetween(Byte value1, Byte value2) {
            addCriterion("end_commit not between", value1, value2, "endCommit");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNull() {
            addCriterion("store_pic is null");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNotNull() {
            addCriterion("store_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStorePicEqualTo(String value) {
            addCriterion("store_pic =", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotEqualTo(String value) {
            addCriterion("store_pic <>", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThan(String value) {
            addCriterion("store_pic >", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThanOrEqualTo(String value) {
            addCriterion("store_pic >=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThan(String value) {
            addCriterion("store_pic <", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThanOrEqualTo(String value) {
            addCriterion("store_pic <=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLike(String value) {
            addCriterion("store_pic like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotLike(String value) {
            addCriterion("store_pic not like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicIn(List<String> values) {
            addCriterion("store_pic in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotIn(List<String> values) {
            addCriterion("store_pic not in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicBetween(String value1, String value2) {
            addCriterion("store_pic between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotBetween(String value1, String value2) {
            addCriterion("store_pic not between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Byte value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Byte value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Byte value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Byte value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Byte> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Byte> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Byte value1, Byte value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumIsNull() {
            addCriterion("store_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumIsNotNull() {
            addCriterion("store_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumEqualTo(Integer value) {
            addCriterion("store_goods_num =", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumNotEqualTo(Integer value) {
            addCriterion("store_goods_num <>", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumGreaterThan(Integer value) {
            addCriterion("store_goods_num >", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_goods_num >=", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumLessThan(Integer value) {
            addCriterion("store_goods_num <", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("store_goods_num <=", value, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumIn(List<Integer> values) {
            addCriterion("store_goods_num in", values, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumNotIn(List<Integer> values) {
            addCriterion("store_goods_num not in", values, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("store_goods_num between", value1, value2, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("store_goods_num not between", value1, value2, "storeGoodsNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumIsNull() {
            addCriterion("store_goods_sku_num is null");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumIsNotNull() {
            addCriterion("store_goods_sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumEqualTo(Integer value) {
            addCriterion("store_goods_sku_num =", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumNotEqualTo(Integer value) {
            addCriterion("store_goods_sku_num <>", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumGreaterThan(Integer value) {
            addCriterion("store_goods_sku_num >", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_goods_sku_num >=", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumLessThan(Integer value) {
            addCriterion("store_goods_sku_num <", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumLessThanOrEqualTo(Integer value) {
            addCriterion("store_goods_sku_num <=", value, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumIn(List<Integer> values) {
            addCriterion("store_goods_sku_num in", values, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumNotIn(List<Integer> values) {
            addCriterion("store_goods_sku_num not in", values, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumBetween(Integer value1, Integer value2) {
            addCriterion("store_goods_sku_num between", value1, value2, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreGoodsSkuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("store_goods_sku_num not between", value1, value2, "storeGoodsSkuNum");
            return (Criteria) this;
        }

        public Criteria andStoreAdminIsNull() {
            addCriterion("store_admin is null");
            return (Criteria) this;
        }

        public Criteria andStoreAdminIsNotNull() {
            addCriterion("store_admin is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAdminEqualTo(String value) {
            addCriterion("store_admin =", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminNotEqualTo(String value) {
            addCriterion("store_admin <>", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminGreaterThan(String value) {
            addCriterion("store_admin >", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminGreaterThanOrEqualTo(String value) {
            addCriterion("store_admin >=", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminLessThan(String value) {
            addCriterion("store_admin <", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminLessThanOrEqualTo(String value) {
            addCriterion("store_admin <=", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminLike(String value) {
            addCriterion("store_admin like", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminNotLike(String value) {
            addCriterion("store_admin not like", value, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminIn(List<String> values) {
            addCriterion("store_admin in", values, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminNotIn(List<String> values) {
            addCriterion("store_admin not in", values, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminBetween(String value1, String value2) {
            addCriterion("store_admin between", value1, value2, "storeAdmin");
            return (Criteria) this;
        }

        public Criteria andStoreAdminNotBetween(String value1, String value2) {
            addCriterion("store_admin not between", value1, value2, "storeAdmin");
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