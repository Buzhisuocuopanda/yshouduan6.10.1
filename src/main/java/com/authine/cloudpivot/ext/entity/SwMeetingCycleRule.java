package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwMeetingCycleRule implements Serializable {
    private String id;

    private Date createTime;

    private String creater;

    private Date updateTime;

    private String updater;

    private String organization;

    private String sequeceNo;

    private Byte rate;

    private Byte meetingDate;

    private Date cycleStartDate;

    private Date cycleEndDate;

    private String cycleStartTime;

    private String cycleEndTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
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

    public Byte getRate() {
        return rate;
    }

    public void setRate(Byte rate) {
        this.rate = rate;
    }

    public Byte getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Byte meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Date getCycleStartDate() {
        return cycleStartDate;
    }

    public void setCycleStartDate(Date cycleStartDate) {
        this.cycleStartDate = cycleStartDate;
    }

    public Date getCycleEndDate() {
        return cycleEndDate;
    }

    public void setCycleEndDate(Date cycleEndDate) {
        this.cycleEndDate = cycleEndDate;
    }

    public String getCycleStartTime() {
        return cycleStartTime;
    }

    public void setCycleStartTime(String cycleStartTime) {
        this.cycleStartTime = cycleStartTime == null ? null : cycleStartTime.trim();
    }

    public String getCycleEndTime() {
        return cycleEndTime;
    }

    public void setCycleEndTime(String cycleEndTime) {
        this.cycleEndTime = cycleEndTime == null ? null : cycleEndTime.trim();
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
        SwMeetingCycleRule other = (SwMeetingCycleRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getSequeceNo() == null ? other.getSequeceNo() == null : this.getSequeceNo().equals(other.getSequeceNo()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getMeetingDate() == null ? other.getMeetingDate() == null : this.getMeetingDate().equals(other.getMeetingDate()))
            && (this.getCycleStartDate() == null ? other.getCycleStartDate() == null : this.getCycleStartDate().equals(other.getCycleStartDate()))
            && (this.getCycleEndDate() == null ? other.getCycleEndDate() == null : this.getCycleEndDate().equals(other.getCycleEndDate()))
            && (this.getCycleStartTime() == null ? other.getCycleStartTime() == null : this.getCycleStartTime().equals(other.getCycleStartTime()))
            && (this.getCycleEndTime() == null ? other.getCycleEndTime() == null : this.getCycleEndTime().equals(other.getCycleEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getSequeceNo() == null) ? 0 : getSequeceNo().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getMeetingDate() == null) ? 0 : getMeetingDate().hashCode());
        result = prime * result + ((getCycleStartDate() == null) ? 0 : getCycleStartDate().hashCode());
        result = prime * result + ((getCycleEndDate() == null) ? 0 : getCycleEndDate().hashCode());
        result = prime * result + ((getCycleStartTime() == null) ? 0 : getCycleStartTime().hashCode());
        result = prime * result + ((getCycleEndTime() == null) ? 0 : getCycleEndTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", creater=").append(creater);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updater=").append(updater);
        sb.append(", organization=").append(organization);
        sb.append(", sequeceNo=").append(sequeceNo);
        sb.append(", rate=").append(rate);
        sb.append(", meetingDate=").append(meetingDate);
        sb.append(", cycleStartDate=").append(cycleStartDate);
        sb.append(", cycleEndDate=").append(cycleEndDate);
        sb.append(", cycleStartTime=").append(cycleStartTime);
        sb.append(", cycleEndTime=").append(cycleEndTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}