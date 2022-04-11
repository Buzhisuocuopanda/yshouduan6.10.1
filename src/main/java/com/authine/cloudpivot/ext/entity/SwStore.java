package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwStore implements Serializable {
    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private Byte deleted;

    private String ysResult;

    private String tranNo;

    private String bizObjectId;

    private String workflowInstance;

    private Byte endCommit;

    private String storeName;

    private String storeAddress;

    private String storePic;

    private Byte isEnabled;

    private Integer storeGoodsNum;

    private Integer storeGoodsSkuNum;

    private String storeAdmin;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic == null ? null : storePic.trim();
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getStoreGoodsNum() {
        return storeGoodsNum;
    }

    public void setStoreGoodsNum(Integer storeGoodsNum) {
        this.storeGoodsNum = storeGoodsNum;
    }

    public Integer getStoreGoodsSkuNum() {
        return storeGoodsSkuNum;
    }

    public void setStoreGoodsSkuNum(Integer storeGoodsSkuNum) {
        this.storeGoodsSkuNum = storeGoodsSkuNum;
    }

    public String getStoreAdmin() {
        return storeAdmin;
    }

    public void setStoreAdmin(String storeAdmin) {
        this.storeAdmin = storeAdmin == null ? null : storeAdmin.trim();
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
        SwStore other = (SwStore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getYsResult() == null ? other.getYsResult() == null : this.getYsResult().equals(other.getYsResult()))
            && (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getBizObjectId() == null ? other.getBizObjectId() == null : this.getBizObjectId().equals(other.getBizObjectId()))
            && (this.getWorkflowInstance() == null ? other.getWorkflowInstance() == null : this.getWorkflowInstance().equals(other.getWorkflowInstance()))
            && (this.getEndCommit() == null ? other.getEndCommit() == null : this.getEndCommit().equals(other.getEndCommit()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreAddress() == null ? other.getStoreAddress() == null : this.getStoreAddress().equals(other.getStoreAddress()))
            && (this.getStorePic() == null ? other.getStorePic() == null : this.getStorePic().equals(other.getStorePic()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
            && (this.getStoreGoodsNum() == null ? other.getStoreGoodsNum() == null : this.getStoreGoodsNum().equals(other.getStoreGoodsNum()))
            && (this.getStoreGoodsSkuNum() == null ? other.getStoreGoodsSkuNum() == null : this.getStoreGoodsSkuNum().equals(other.getStoreGoodsSkuNum()))
            && (this.getStoreAdmin() == null ? other.getStoreAdmin() == null : this.getStoreAdmin().equals(other.getStoreAdmin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getYsResult() == null) ? 0 : getYsResult().hashCode());
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getBizObjectId() == null) ? 0 : getBizObjectId().hashCode());
        result = prime * result + ((getWorkflowInstance() == null) ? 0 : getWorkflowInstance().hashCode());
        result = prime * result + ((getEndCommit() == null) ? 0 : getEndCommit().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreAddress() == null) ? 0 : getStoreAddress().hashCode());
        result = prime * result + ((getStorePic() == null) ? 0 : getStorePic().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        result = prime * result + ((getStoreGoodsNum() == null) ? 0 : getStoreGoodsNum().hashCode());
        result = prime * result + ((getStoreGoodsSkuNum() == null) ? 0 : getStoreGoodsSkuNum().hashCode());
        result = prime * result + ((getStoreAdmin() == null) ? 0 : getStoreAdmin().hashCode());
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
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", ysResult=").append(ysResult);
        sb.append(", tranNo=").append(tranNo);
        sb.append(", bizObjectId=").append(bizObjectId);
        sb.append(", workflowInstance=").append(workflowInstance);
        sb.append(", endCommit=").append(endCommit);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeAddress=").append(storeAddress);
        sb.append(", storePic=").append(storePic);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", storeGoodsNum=").append(storeGoodsNum);
        sb.append(", storeGoodsSkuNum=").append(storeGoodsSkuNum);
        sb.append(", storeAdmin=").append(storeAdmin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}