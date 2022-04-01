package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class SwMeetingCloseLog implements Serializable {
    private String id;

    private Date createTime;

    private String swMeetingId;

    private String userId;

    private String closeMsg;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCloseMsg() {
        return closeMsg;
    }

    public void setCloseMsg(String closeMsg) {
        this.closeMsg = closeMsg == null ? null : closeMsg.trim();
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
        SwMeetingCloseLog other = (SwMeetingCloseLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSwMeetingId() == null ? other.getSwMeetingId() == null : this.getSwMeetingId().equals(other.getSwMeetingId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCloseMsg() == null ? other.getCloseMsg() == null : this.getCloseMsg().equals(other.getCloseMsg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSwMeetingId() == null) ? 0 : getSwMeetingId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCloseMsg() == null) ? 0 : getCloseMsg().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", closeMsg=").append(closeMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}