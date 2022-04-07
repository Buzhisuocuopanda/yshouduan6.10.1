package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwMeetingZoom implements Serializable {
    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String sequeceNo;

    private String organization;

    private String meetingName;

    private String meetingUri;

    private String meetingType;

    private Integer slot;

    private String device;

    private String address;

    private Integer peopleNum;

    private String meetingAdmin;

    private Byte ifCheck;

    private Byte isDisabled;

    private Byte deleted;

    private String meetingAdminName;

    private String createName;

    private String bizObjectId;

    private String tranNo;

    private String workflowInstance;

    private String ysReult;

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

    public String getSequeceNo() {
        return sequeceNo;
    }

    public void setSequeceNo(String sequeceNo) {
        this.sequeceNo = sequeceNo == null ? null : sequeceNo.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getMeetingUri() {
        return meetingUri;
    }

    public void setMeetingUri(String meetingUri) {
        this.meetingUri = meetingUri == null ? null : meetingUri.trim();
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType == null ? null : meetingType.trim();
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getMeetingAdmin() {
        return meetingAdmin;
    }

    public void setMeetingAdmin(String meetingAdmin) {
        this.meetingAdmin = meetingAdmin == null ? null : meetingAdmin.trim();
    }

    public Byte getIfCheck() {
        return ifCheck;
    }

    public void setIfCheck(Byte ifCheck) {
        this.ifCheck = ifCheck;
    }

    public Byte getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Byte isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getMeetingAdminName() {
        return meetingAdminName;
    }

    public void setMeetingAdminName(String meetingAdminName) {
        this.meetingAdminName = meetingAdminName == null ? null : meetingAdminName.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public String getBizObjectId() {
        return bizObjectId;
    }

    public void setBizObjectId(String bizObjectId) {
        this.bizObjectId = bizObjectId == null ? null : bizObjectId.trim();
    }

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public String getWorkflowInstance() {
        return workflowInstance;
    }

    public void setWorkflowInstance(String workflowInstance) {
        this.workflowInstance = workflowInstance == null ? null : workflowInstance.trim();
    }

    public String getYsReult() {
        return ysReult;
    }

    public void setYsReult(String ysReult) {
        this.ysReult = ysReult == null ? null : ysReult.trim();
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
        SwMeetingZoom other = (SwMeetingZoom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSequeceNo() == null ? other.getSequeceNo() == null : this.getSequeceNo().equals(other.getSequeceNo()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getMeetingName() == null ? other.getMeetingName() == null : this.getMeetingName().equals(other.getMeetingName()))
            && (this.getMeetingUri() == null ? other.getMeetingUri() == null : this.getMeetingUri().equals(other.getMeetingUri()))
            && (this.getMeetingType() == null ? other.getMeetingType() == null : this.getMeetingType().equals(other.getMeetingType()))
            && (this.getSlot() == null ? other.getSlot() == null : this.getSlot().equals(other.getSlot()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPeopleNum() == null ? other.getPeopleNum() == null : this.getPeopleNum().equals(other.getPeopleNum()))
            && (this.getMeetingAdmin() == null ? other.getMeetingAdmin() == null : this.getMeetingAdmin().equals(other.getMeetingAdmin()))
            && (this.getIfCheck() == null ? other.getIfCheck() == null : this.getIfCheck().equals(other.getIfCheck()))
            && (this.getIsDisabled() == null ? other.getIsDisabled() == null : this.getIsDisabled().equals(other.getIsDisabled()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getMeetingAdminName() == null ? other.getMeetingAdminName() == null : this.getMeetingAdminName().equals(other.getMeetingAdminName()))
            && (this.getCreateName() == null ? other.getCreateName() == null : this.getCreateName().equals(other.getCreateName()))
            && (this.getBizObjectId() == null ? other.getBizObjectId() == null : this.getBizObjectId().equals(other.getBizObjectId()))
            && (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getWorkflowInstance() == null ? other.getWorkflowInstance() == null : this.getWorkflowInstance().equals(other.getWorkflowInstance()))
            && (this.getYsReult() == null ? other.getYsReult() == null : this.getYsReult().equals(other.getYsReult()));
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
        result = prime * result + ((getSequeceNo() == null) ? 0 : getSequeceNo().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getMeetingName() == null) ? 0 : getMeetingName().hashCode());
        result = prime * result + ((getMeetingUri() == null) ? 0 : getMeetingUri().hashCode());
        result = prime * result + ((getMeetingType() == null) ? 0 : getMeetingType().hashCode());
        result = prime * result + ((getSlot() == null) ? 0 : getSlot().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPeopleNum() == null) ? 0 : getPeopleNum().hashCode());
        result = prime * result + ((getMeetingAdmin() == null) ? 0 : getMeetingAdmin().hashCode());
        result = prime * result + ((getIfCheck() == null) ? 0 : getIfCheck().hashCode());
        result = prime * result + ((getIsDisabled() == null) ? 0 : getIsDisabled().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getMeetingAdminName() == null) ? 0 : getMeetingAdminName().hashCode());
        result = prime * result + ((getCreateName() == null) ? 0 : getCreateName().hashCode());
        result = prime * result + ((getBizObjectId() == null) ? 0 : getBizObjectId().hashCode());
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getWorkflowInstance() == null) ? 0 : getWorkflowInstance().hashCode());
        result = prime * result + ((getYsReult() == null) ? 0 : getYsReult().hashCode());
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
        sb.append(", sequeceNo=").append(sequeceNo);
        sb.append(", organization=").append(organization);
        sb.append(", meetingName=").append(meetingName);
        sb.append(", meetingUri=").append(meetingUri);
        sb.append(", meetingType=").append(meetingType);
        sb.append(", slot=").append(slot);
        sb.append(", device=").append(device);
        sb.append(", address=").append(address);
        sb.append(", peopleNum=").append(peopleNum);
        sb.append(", meetingAdmin=").append(meetingAdmin);
        sb.append(", ifCheck=").append(ifCheck);
        sb.append(", isDisabled=").append(isDisabled);
        sb.append(", deleted=").append(deleted);
        sb.append(", meetingAdminName=").append(meetingAdminName);
        sb.append(", createName=").append(createName);
        sb.append(", bizObjectId=").append(bizObjectId);
        sb.append(", tranNo=").append(tranNo);
        sb.append(", workflowInstance=").append(workflowInstance);
        sb.append(", ysReult=").append(ysReult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}