package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwMeeting implements Serializable {
    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String createName;

    private Byte deleted;

    private Byte meetingStatus;

    private String organization;

    private String sequeceNo;

    private Byte type;

    private String meetingName;

    private String meetingType;

    private String meetingHost;

    private String swMeetingZoomId;

    private String meetingZoom;

    private String meetingAddress;

    private String meetingGoal;

    private String dataUri;

    private String remark;

    private String organPeople;

    private String meetingOrganization;

    private String summaryPeople;

    private Date summaryTime;

    private String scheduleResult;

    private String meetingDevice;

    private String meetingService;

    private String meetingLayout;

    private String auidtMsg;

    private Date meetingStarttime;

    private Date meetingEndtime;

    private String swMeetingCycleRuleId;

    private String zoomAdmin;

    private String tranNo;

    private String bizObjectId;

    private String workflowInstance;

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

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Byte getMeetingStatus() {
        return meetingStatus;
    }

    public void setMeetingStatus(Byte meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getSequeceNo() {
        return sequeceNo;
    }

    public void setSequeceNo(String sequeceNo) {
        this.sequeceNo = sequeceNo == null ? null : sequeceNo.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType == null ? null : meetingType.trim();
    }

    public String getMeetingHost() {
        return meetingHost;
    }

    public void setMeetingHost(String meetingHost) {
        this.meetingHost = meetingHost == null ? null : meetingHost.trim();
    }

    public String getSwMeetingZoomId() {
        return swMeetingZoomId;
    }

    public void setSwMeetingZoomId(String swMeetingZoomId) {
        this.swMeetingZoomId = swMeetingZoomId == null ? null : swMeetingZoomId.trim();
    }

    public String getMeetingZoom() {
        return meetingZoom;
    }

    public void setMeetingZoom(String meetingZoom) {
        this.meetingZoom = meetingZoom == null ? null : meetingZoom.trim();
    }

    public String getMeetingAddress() {
        return meetingAddress;
    }

    public void setMeetingAddress(String meetingAddress) {
        this.meetingAddress = meetingAddress == null ? null : meetingAddress.trim();
    }

    public String getMeetingGoal() {
        return meetingGoal;
    }

    public void setMeetingGoal(String meetingGoal) {
        this.meetingGoal = meetingGoal == null ? null : meetingGoal.trim();
    }

    public String getDataUri() {
        return dataUri;
    }

    public void setDataUri(String dataUri) {
        this.dataUri = dataUri == null ? null : dataUri.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrganPeople() {
        return organPeople;
    }

    public void setOrganPeople(String organPeople) {
        this.organPeople = organPeople == null ? null : organPeople.trim();
    }

    public String getMeetingOrganization() {
        return meetingOrganization;
    }

    public void setMeetingOrganization(String meetingOrganization) {
        this.meetingOrganization = meetingOrganization == null ? null : meetingOrganization.trim();
    }

    public String getSummaryPeople() {
        return summaryPeople;
    }

    public void setSummaryPeople(String summaryPeople) {
        this.summaryPeople = summaryPeople == null ? null : summaryPeople.trim();
    }

    public Date getSummaryTime() {
        return summaryTime;
    }

    public void setSummaryTime(Date summaryTime) {
        this.summaryTime = summaryTime;
    }

    public String getScheduleResult() {
        return scheduleResult;
    }

    public void setScheduleResult(String scheduleResult) {
        this.scheduleResult = scheduleResult == null ? null : scheduleResult.trim();
    }

    public String getMeetingDevice() {
        return meetingDevice;
    }

    public void setMeetingDevice(String meetingDevice) {
        this.meetingDevice = meetingDevice == null ? null : meetingDevice.trim();
    }

    public String getMeetingService() {
        return meetingService;
    }

    public void setMeetingService(String meetingService) {
        this.meetingService = meetingService == null ? null : meetingService.trim();
    }

    public String getMeetingLayout() {
        return meetingLayout;
    }

    public void setMeetingLayout(String meetingLayout) {
        this.meetingLayout = meetingLayout == null ? null : meetingLayout.trim();
    }

    public String getAuidtMsg() {
        return auidtMsg;
    }

    public void setAuidtMsg(String auidtMsg) {
        this.auidtMsg = auidtMsg == null ? null : auidtMsg.trim();
    }

    public Date getMeetingStarttime() {
        return meetingStarttime;
    }

    public void setMeetingStarttime(Date meetingStarttime) {
        this.meetingStarttime = meetingStarttime;
    }

    public Date getMeetingEndtime() {
        return meetingEndtime;
    }

    public void setMeetingEndtime(Date meetingEndtime) {
        this.meetingEndtime = meetingEndtime;
    }

    public String getSwMeetingCycleRuleId() {
        return swMeetingCycleRuleId;
    }

    public void setSwMeetingCycleRuleId(String swMeetingCycleRuleId) {
        this.swMeetingCycleRuleId = swMeetingCycleRuleId == null ? null : swMeetingCycleRuleId.trim();
    }

    public String getZoomAdmin() {
        return zoomAdmin;
    }

    public void setZoomAdmin(String zoomAdmin) {
        this.zoomAdmin = zoomAdmin == null ? null : zoomAdmin.trim();
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
        SwMeeting other = (SwMeeting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateName() == null ? other.getCreateName() == null : this.getCreateName().equals(other.getCreateName()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getMeetingStatus() == null ? other.getMeetingStatus() == null : this.getMeetingStatus().equals(other.getMeetingStatus()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getSequeceNo() == null ? other.getSequeceNo() == null : this.getSequeceNo().equals(other.getSequeceNo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMeetingName() == null ? other.getMeetingName() == null : this.getMeetingName().equals(other.getMeetingName()))
            && (this.getMeetingType() == null ? other.getMeetingType() == null : this.getMeetingType().equals(other.getMeetingType()))
            && (this.getMeetingHost() == null ? other.getMeetingHost() == null : this.getMeetingHost().equals(other.getMeetingHost()))
            && (this.getSwMeetingZoomId() == null ? other.getSwMeetingZoomId() == null : this.getSwMeetingZoomId().equals(other.getSwMeetingZoomId()))
            && (this.getMeetingZoom() == null ? other.getMeetingZoom() == null : this.getMeetingZoom().equals(other.getMeetingZoom()))
            && (this.getMeetingAddress() == null ? other.getMeetingAddress() == null : this.getMeetingAddress().equals(other.getMeetingAddress()))
            && (this.getMeetingGoal() == null ? other.getMeetingGoal() == null : this.getMeetingGoal().equals(other.getMeetingGoal()))
            && (this.getDataUri() == null ? other.getDataUri() == null : this.getDataUri().equals(other.getDataUri()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOrganPeople() == null ? other.getOrganPeople() == null : this.getOrganPeople().equals(other.getOrganPeople()))
            && (this.getMeetingOrganization() == null ? other.getMeetingOrganization() == null : this.getMeetingOrganization().equals(other.getMeetingOrganization()))
            && (this.getSummaryPeople() == null ? other.getSummaryPeople() == null : this.getSummaryPeople().equals(other.getSummaryPeople()))
            && (this.getSummaryTime() == null ? other.getSummaryTime() == null : this.getSummaryTime().equals(other.getSummaryTime()))
            && (this.getScheduleResult() == null ? other.getScheduleResult() == null : this.getScheduleResult().equals(other.getScheduleResult()))
            && (this.getMeetingDevice() == null ? other.getMeetingDevice() == null : this.getMeetingDevice().equals(other.getMeetingDevice()))
            && (this.getMeetingService() == null ? other.getMeetingService() == null : this.getMeetingService().equals(other.getMeetingService()))
            && (this.getMeetingLayout() == null ? other.getMeetingLayout() == null : this.getMeetingLayout().equals(other.getMeetingLayout()))
            && (this.getAuidtMsg() == null ? other.getAuidtMsg() == null : this.getAuidtMsg().equals(other.getAuidtMsg()))
            && (this.getMeetingStarttime() == null ? other.getMeetingStarttime() == null : this.getMeetingStarttime().equals(other.getMeetingStarttime()))
            && (this.getMeetingEndtime() == null ? other.getMeetingEndtime() == null : this.getMeetingEndtime().equals(other.getMeetingEndtime()))
            && (this.getSwMeetingCycleRuleId() == null ? other.getSwMeetingCycleRuleId() == null : this.getSwMeetingCycleRuleId().equals(other.getSwMeetingCycleRuleId()))
            && (this.getZoomAdmin() == null ? other.getZoomAdmin() == null : this.getZoomAdmin().equals(other.getZoomAdmin()))
            && (this.getTranNo() == null ? other.getTranNo() == null : this.getTranNo().equals(other.getTranNo()))
            && (this.getBizObjectId() == null ? other.getBizObjectId() == null : this.getBizObjectId().equals(other.getBizObjectId()))
            && (this.getWorkflowInstance() == null ? other.getWorkflowInstance() == null : this.getWorkflowInstance().equals(other.getWorkflowInstance()));
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
        result = prime * result + ((getCreateName() == null) ? 0 : getCreateName().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getMeetingStatus() == null) ? 0 : getMeetingStatus().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getSequeceNo() == null) ? 0 : getSequeceNo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMeetingName() == null) ? 0 : getMeetingName().hashCode());
        result = prime * result + ((getMeetingType() == null) ? 0 : getMeetingType().hashCode());
        result = prime * result + ((getMeetingHost() == null) ? 0 : getMeetingHost().hashCode());
        result = prime * result + ((getSwMeetingZoomId() == null) ? 0 : getSwMeetingZoomId().hashCode());
        result = prime * result + ((getMeetingZoom() == null) ? 0 : getMeetingZoom().hashCode());
        result = prime * result + ((getMeetingAddress() == null) ? 0 : getMeetingAddress().hashCode());
        result = prime * result + ((getMeetingGoal() == null) ? 0 : getMeetingGoal().hashCode());
        result = prime * result + ((getDataUri() == null) ? 0 : getDataUri().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOrganPeople() == null) ? 0 : getOrganPeople().hashCode());
        result = prime * result + ((getMeetingOrganization() == null) ? 0 : getMeetingOrganization().hashCode());
        result = prime * result + ((getSummaryPeople() == null) ? 0 : getSummaryPeople().hashCode());
        result = prime * result + ((getSummaryTime() == null) ? 0 : getSummaryTime().hashCode());
        result = prime * result + ((getScheduleResult() == null) ? 0 : getScheduleResult().hashCode());
        result = prime * result + ((getMeetingDevice() == null) ? 0 : getMeetingDevice().hashCode());
        result = prime * result + ((getMeetingService() == null) ? 0 : getMeetingService().hashCode());
        result = prime * result + ((getMeetingLayout() == null) ? 0 : getMeetingLayout().hashCode());
        result = prime * result + ((getAuidtMsg() == null) ? 0 : getAuidtMsg().hashCode());
        result = prime * result + ((getMeetingStarttime() == null) ? 0 : getMeetingStarttime().hashCode());
        result = prime * result + ((getMeetingEndtime() == null) ? 0 : getMeetingEndtime().hashCode());
        result = prime * result + ((getSwMeetingCycleRuleId() == null) ? 0 : getSwMeetingCycleRuleId().hashCode());
        result = prime * result + ((getZoomAdmin() == null) ? 0 : getZoomAdmin().hashCode());
        result = prime * result + ((getTranNo() == null) ? 0 : getTranNo().hashCode());
        result = prime * result + ((getBizObjectId() == null) ? 0 : getBizObjectId().hashCode());
        result = prime * result + ((getWorkflowInstance() == null) ? 0 : getWorkflowInstance().hashCode());
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
        sb.append(", createName=").append(createName);
        sb.append(", deleted=").append(deleted);
        sb.append(", meetingStatus=").append(meetingStatus);
        sb.append(", organization=").append(organization);
        sb.append(", sequeceNo=").append(sequeceNo);
        sb.append(", type=").append(type);
        sb.append(", meetingName=").append(meetingName);
        sb.append(", meetingType=").append(meetingType);
        sb.append(", meetingHost=").append(meetingHost);
        sb.append(", swMeetingZoomId=").append(swMeetingZoomId);
        sb.append(", meetingZoom=").append(meetingZoom);
        sb.append(", meetingAddress=").append(meetingAddress);
        sb.append(", meetingGoal=").append(meetingGoal);
        sb.append(", dataUri=").append(dataUri);
        sb.append(", remark=").append(remark);
        sb.append(", organPeople=").append(organPeople);
        sb.append(", meetingOrganization=").append(meetingOrganization);
        sb.append(", summaryPeople=").append(summaryPeople);
        sb.append(", summaryTime=").append(summaryTime);
        sb.append(", scheduleResult=").append(scheduleResult);
        sb.append(", meetingDevice=").append(meetingDevice);
        sb.append(", meetingService=").append(meetingService);
        sb.append(", meetingLayout=").append(meetingLayout);
        sb.append(", auidtMsg=").append(auidtMsg);
        sb.append(", meetingStarttime=").append(meetingStarttime);
        sb.append(", meetingEndtime=").append(meetingEndtime);
        sb.append(", swMeetingCycleRuleId=").append(swMeetingCycleRuleId);
        sb.append(", zoomAdmin=").append(zoomAdmin);
        sb.append(", tranNo=").append(tranNo);
        sb.append(", bizObjectId=").append(bizObjectId);
        sb.append(", workflowInstance=").append(workflowInstance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}