package com.authine.cloudpivot.ext.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwGoodsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwGoodsCriteria() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNull() {
            addCriterion("goods_detail is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNotNull() {
            addCriterion("goods_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailEqualTo(String value) {
            addCriterion("goods_detail =", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotEqualTo(String value) {
            addCriterion("goods_detail <>", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThan(String value) {
            addCriterion("goods_detail >", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("goods_detail >=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThan(String value) {
            addCriterion("goods_detail <", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThanOrEqualTo(String value) {
            addCriterion("goods_detail <=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLike(String value) {
            addCriterion("goods_detail like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotLike(String value) {
            addCriterion("goods_detail not like", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIn(List<String> values) {
            addCriterion("goods_detail in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotIn(List<String> values) {
            addCriterion("goods_detail not in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailBetween(String value1, String value2) {
            addCriterion("goods_detail between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotBetween(String value1, String value2) {
            addCriterion("goods_detail not between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicIsNull() {
            addCriterion("goods_head_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicIsNotNull() {
            addCriterion("goods_head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicEqualTo(String value) {
            addCriterion("goods_head_pic =", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicNotEqualTo(String value) {
            addCriterion("goods_head_pic <>", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicGreaterThan(String value) {
            addCriterion("goods_head_pic >", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("goods_head_pic >=", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicLessThan(String value) {
            addCriterion("goods_head_pic <", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicLessThanOrEqualTo(String value) {
            addCriterion("goods_head_pic <=", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicLike(String value) {
            addCriterion("goods_head_pic like", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicNotLike(String value) {
            addCriterion("goods_head_pic not like", value, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicIn(List<String> values) {
            addCriterion("goods_head_pic in", values, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicNotIn(List<String> values) {
            addCriterion("goods_head_pic not in", values, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicBetween(String value1, String value2) {
            addCriterion("goods_head_pic between", value1, value2, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andGoodsHeadPicNotBetween(String value1, String value2) {
            addCriterion("goods_head_pic not between", value1, value2, "goodsHeadPic");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdIsNull() {
            addCriterion("sw_store_id is null");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdIsNotNull() {
            addCriterion("sw_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdEqualTo(String value) {
            addCriterion("sw_store_id =", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdNotEqualTo(String value) {
            addCriterion("sw_store_id <>", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdGreaterThan(String value) {
            addCriterion("sw_store_id >", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("sw_store_id >=", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdLessThan(String value) {
            addCriterion("sw_store_id <", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdLessThanOrEqualTo(String value) {
            addCriterion("sw_store_id <=", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdLike(String value) {
            addCriterion("sw_store_id like", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdNotLike(String value) {
            addCriterion("sw_store_id not like", value, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdIn(List<String> values) {
            addCriterion("sw_store_id in", values, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdNotIn(List<String> values) {
            addCriterion("sw_store_id not in", values, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdBetween(String value1, String value2) {
            addCriterion("sw_store_id between", value1, value2, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andSwStoreIdNotBetween(String value1, String value2) {
            addCriterion("sw_store_id not between", value1, value2, "swStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIsNull() {
            addCriterion("goods_company is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIsNotNull() {
            addCriterion("goods_company is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyEqualTo(String value) {
            addCriterion("goods_company =", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyNotEqualTo(String value) {
            addCriterion("goods_company <>", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyGreaterThan(String value) {
            addCriterion("goods_company >", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("goods_company >=", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyLessThan(String value) {
            addCriterion("goods_company <", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyLessThanOrEqualTo(String value) {
            addCriterion("goods_company <=", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyLike(String value) {
            addCriterion("goods_company like", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyNotLike(String value) {
            addCriterion("goods_company not like", value, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIn(List<String> values) {
            addCriterion("goods_company in", values, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyNotIn(List<String> values) {
            addCriterion("goods_company not in", values, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyBetween(String value1, String value2) {
            addCriterion("goods_company between", value1, value2, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyNotBetween(String value1, String value2) {
            addCriterion("goods_company not between", value1, value2, "goodsCompany");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameIsNull() {
            addCriterion("sw_store_name is null");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameIsNotNull() {
            addCriterion("sw_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameEqualTo(String value) {
            addCriterion("sw_store_name =", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameNotEqualTo(String value) {
            addCriterion("sw_store_name <>", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameGreaterThan(String value) {
            addCriterion("sw_store_name >", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("sw_store_name >=", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameLessThan(String value) {
            addCriterion("sw_store_name <", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameLessThanOrEqualTo(String value) {
            addCriterion("sw_store_name <=", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameLike(String value) {
            addCriterion("sw_store_name like", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameNotLike(String value) {
            addCriterion("sw_store_name not like", value, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameIn(List<String> values) {
            addCriterion("sw_store_name in", values, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameNotIn(List<String> values) {
            addCriterion("sw_store_name not in", values, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameBetween(String value1, String value2) {
            addCriterion("sw_store_name between", value1, value2, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andSwStoreNameNotBetween(String value1, String value2) {
            addCriterion("sw_store_name not between", value1, value2, "swStoreName");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIsNull() {
            addCriterion("goods_total_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIsNotNull() {
            addCriterion("goods_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumEqualTo(Integer value) {
            addCriterion("goods_total_num =", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotEqualTo(Integer value) {
            addCriterion("goods_total_num <>", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumGreaterThan(Integer value) {
            addCriterion("goods_total_num >", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_total_num >=", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumLessThan(Integer value) {
            addCriterion("goods_total_num <", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_total_num <=", value, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumIn(List<Integer> values) {
            addCriterion("goods_total_num in", values, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotIn(List<Integer> values) {
            addCriterion("goods_total_num not in", values, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_total_num between", value1, value2, "goodsTotalNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_total_num not between", value1, value2, "goodsTotalNum");
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