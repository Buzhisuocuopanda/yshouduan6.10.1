package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwGoods implements Serializable {
    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Byte deleted;

    private String ysResult;

    private String tranNo;

    private String bizObjectId;

    private String workflowInstance;

    private Byte endCommit;

    private String goodsName;

    private String goodsCode;

    private String goodsDetail;

    private String goodsHeadPic;

    private String swStoreId;

    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getYsResult() {
        return ysResult;
    }

    public void setYsResult(String ysResult) {
        this.ysResult = ysResult == null ? null : ysResult.trim();
    }

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public String getBizObjectId() {
        return bizObjectId;
    }

    public void setBizObjectId(String bizObjectId) {
        this.bizObjectId = bizObjectId == null ? null : bizObjectId.trim();
    }

    public String getWorkflowInstance() {
        return workflowInstance;
    }

    public void setWorkflowInstance(String workflowInstance) {
        this.workflowInstance = workflowInstance == null ? null : workflowInstance.trim();
    }

    public Byte getEndCommit() {
        return endCommit;
    }

    public void setEndCommit(Byte endCommit) {
        this.endCommit = endCommit;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public String getGoodsHeadPic() {
        return goodsHeadPic;
    }

    public void setGoodsHeadPic(String goodsHeadPic) {
        this.goodsHeadPic = goodsHeadPic == null ? null : goodsHeadPic.trim();
    }

    public String getSwStoreId() {
        return swStoreId;
    }

    public void setSwStoreId(String swStoreId) {
        this.swStoreId = swStoreId == null ? null : swStoreId.trim();
    }

    public String getGoodsCompany() {
        return goodsCompany;
    }

    public void setGoodsCompany(String goodsCompany) {
        this.goodsCompany = goodsCompany == null ? null : goodsCompany.trim();
    }

    public String getSwStoreName() {
        return swStoreName;
    }

    public void setSwStoreName(String swStoreName) {
        this.swStoreName = swStoreName == null ? null : swStoreName.trim();
    }

    public Integer getGoodsTotalNum() {
        return goodsTotalNum;
    }

    public void setGoodsTotalNum(Integer goodsTotalNum) {
        this.goodsTotalNum = goodsTotalNum;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SwGoods other = (SwGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getYsResult() == null ? other.getYsResult() == null : this.getYsResult().equals(other.getYsResult()))
            && (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getBizObjectId() == null ? other.getBizObjectId() == null : this.getBizObjectId().equals(other.getBizObjectId()))
            && (this.getWorkflowInstance() == null ? other.getWorkflowInstance() == null : this.getWorkflowInstance().equals(other.getWorkflowInstance()))
            && (this.getEndCommit() == null ? other.getEndCommit() == null : this.getEndCommit().equals(other.getEndCommit()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsDetail() == null ? other.getGoodsDetail() == null : this.getGoodsDetail().equals(other.getGoodsDetail()))
            && (this.getGoodsHeadPic() == null ? other.getGoodsHeadPic() == null : this.getGoodsHeadPic().equals(other.getGoodsHeadPic()))
            && (this.getSwStoreId() == null ? other.getSwStoreId() == null : this.getSwStoreId().equals(other.getSwStoreId()))
            && (this.getGoodsCompany() == null ? other.getGoodsCompany() == null : this.getGoodsCompany().equals(other.getGoodsCompany()))
            && (this.getSwStoreName() == null ? other.getSwStoreName() == null : this.getSwStoreName().equals(other.getSwStoreName()))
            && (this.getGoodsTotalNum() == null ? other.getGoodsTotalNum() == null : this.getGoodsTotalNum().equals(other.getGoodsTotalNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getYsResult() == null) ? 0 : getYsResult().hashCode());
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getBizObjectId() == null) ? 0 : getBizObjectId().hashCode());
        result = prime * result + ((getWorkflowInstance() == null) ? 0 : getWorkflowInstance().hashCode());
        result = prime * result + ((getEndCommit() == null) ? 0 : getEndCommit().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsDetail() == null) ? 0 : getGoodsDetail().hashCode());
        result = prime * result + ((getGoodsHeadPic() == null) ? 0 : getGoodsHeadPic().hashCode());
        result = prime * result + ((getSwStoreId() == null) ? 0 : getSwStoreId().hashCode());
        result = prime * result + ((getGoodsCompany() == null) ? 0 : getGoodsCompany().hashCode());
        result = prime * result + ((getSwStoreName() == null) ? 0 : getSwStoreName().hashCode());
        result = prime * result + ((getGoodsTotalNum() == null) ? 0 : getGoodsTotalNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", updater=").append(updater);
        sb.append(", deleted=").append(deleted);
        sb.append(", ysResult=").append(ysResult);
        sb.append(", tranNo=").append(tranNo);
        sb.append(", bizObjectId=").append(bizObjectId);
        sb.append(", workflowInstance=").append(workflowInstance);
        sb.append(", endCommit=").append(endCommit);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsDetail=").append(goodsDetail);
        sb.append(", goodsHeadPic=").append(goodsHeadPic);
        sb.append(", swStoreId=").append(swStoreId);
        sb.append(", goodsCompany=").append(goodsCompany);
        sb.append(", swStoreName=").append(swStoreName);
        sb.append(", goodsTotalNum=").append(goodsTotalNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}