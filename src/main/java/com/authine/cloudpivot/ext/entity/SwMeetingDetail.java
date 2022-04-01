package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwMeetingDetail implements Serializable {
    private String id;

    private Date createTime;

    private String swMeetingId;

    private String meetingTitle;

    private String reporter;

    private Date reportTime;

    private String dataUri;

    private String dataUser;

    private Date dataTime;

    private Integer number;

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

    public String getSwMeetingId() {
        return swMeetingId;
    }

    public void setSwMeetingId(String swMeetingId) {
        this.swMeetingId = swMeetingId == null ? null : swMeetingId.trim();
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle == null ? null : meetingTitle.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getDataUri() {
        return dataUri;
    }

    public void setDataUri(String dataUri) {
        this.dataUri = dataUri == null ? null : dataUri.trim();
    }

    public String getDataUser() {
        return dataUser;
    }

    public void setDataUser(String dataUser) {
        this.dataUser = dataUser == null ? null : dataUser.trim();
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        SwMeetingDetail other = (SwMeetingDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSwMeetingId() == null ? other.getSwMeetingId() == null : this.getSwMeetingId().equals(other.getSwMeetingId()))
            && (this.getMeetingTitle() == null ? other.getMeetingTitle() == null : this.getMeetingTitle().equals(other.getMeetingTitle()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getDataUri() == null ? other.getDataUri() == null : this.getDataUri().equals(other.getDataUri()))
            && (this.getDataUser() == null ? other.getDataUser() == null : this.getDataUser().equals(other.getDataUser()))
            && (this.getDataTime() == null ? other.getDataTime() == null : this.getDataTime().equals(other.getDataTime()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSwMeetingId() == null) ? 0 : getSwMeetingId().hashCode());
        result = prime * result + ((getMeetingTitle() == null) ? 0 : getMeetingTitle().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getDataUri() == null) ? 0 : getDataUri().hashCode());
        result = prime * result + ((getDataUser() == null) ? 0 : getDataUser().hashCode());
        result = prime * result + ((getDataTime() == null) ? 0 : getDataTime().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
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
        sb.append(", swMeetingId=").append(swMeetingId);
        sb.append(", meetingTitle=").append(meetingTitle);
        sb.append(", reporter=").append(reporter);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", dataUri=").append(dataUri);
        sb.append(", dataUser=").append(dataUser);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}