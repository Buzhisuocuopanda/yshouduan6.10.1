package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class HBizComment implements Serializable {
    private String id;

    private String actiontype;

    private String activitycode;

    private String activityname;

    private String bizobjectid;

    private String bizpropertycode;

    private String content;

    private Date createdtime;

    private String creater;

    private Date modifiedtime;

    private String modifier;

    private String relusers;

    private String result;

    private String schemacode;

    private String workitemid;

    private String workflowinstanceid;

    private String workflowtokenid;

    private Integer tokenid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype == null ? null : actiontype.trim();
    }

    public String getActivitycode() {
        return activitycode;
    }

    public void setActivitycode(String activitycode) {
        this.activitycode = activitycode == null ? null : activitycode.trim();
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    public String getBizobjectid() {
        return bizobjectid;
    }

    public void setBizobjectid(String bizobjectid) {
        this.bizobjectid = bizobjectid == null ? null : bizobjectid.trim();
    }

    public String getBizpropertycode() {
        return bizpropertycode;
    }

    public void setBizpropertycode(String bizpropertycode) {
        this.bizpropertycode = bizpropertycode == null ? null : bizpropertycode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getRelusers() {
        return relusers;
    }

    public void setRelusers(String relusers) {
        this.relusers = relusers == null ? null : relusers.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getSchemacode() {
        return schemacode;
    }

    public void setSchemacode(String schemacode) {
        this.schemacode = schemacode == null ? null : schemacode.trim();
    }

    public String getWorkitemid() {
        return workitemid;
    }

    public void setWorkitemid(String workitemid) {
        this.workitemid = workitemid == null ? null : workitemid.trim();
    }

    public String getWorkflowinstanceid() {
        return workflowinstanceid;
    }

    public void setWorkflowinstanceid(String workflowinstanceid) {
        this.workflowinstanceid = workflowinstanceid == null ? null : workflowinstanceid.trim();
    }

    public String getWorkflowtokenid() {
        return workflowtokenid;
    }

    public void setWorkflowtokenid(String workflowtokenid) {
        this.workflowtokenid = workflowtokenid == null ? null : workflowtokenid.trim();
    }

    public Integer getTokenid() {
        return tokenid;
    }

    public void setTokenid(Integer tokenid) {
        this.tokenid = tokenid;
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
        HBizComment other = (HBizComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActiontype() == null ? other.getActiontype() == null : this.getActiontype().equals(other.getActiontype()))
            && (this.getActivitycode() == null ? other.getActivitycode() == null : this.getActivitycode().equals(other.getActivitycode()))
            && (this.getActivityname() == null ? other.getActivityname() == null : this.getActivityname().equals(other.getActivityname()))
            && (this.getBizobjectid() == null ? other.getBizobjectid() == null : this.getBizobjectid().equals(other.getBizobjectid()))
            && (this.getBizpropertycode() == null ? other.getBizpropertycode() == null : this.getBizpropertycode().equals(other.getBizpropertycode()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreatedtime() == null ? other.getCreatedtime() == null : this.getCreatedtime().equals(other.getCreatedtime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getModifiedtime() == null ? other.getModifiedtime() == null : this.getModifiedtime().equals(other.getModifiedtime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getRelusers() == null ? other.getRelusers() == null : this.getRelusers().equals(other.getRelusers()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getSchemacode() == null ? other.getSchemacode() == null : this.getSchemacode().equals(other.getSchemacode()))
            && (this.getWorkitemid() == null ? other.getWorkitemid() == null : this.getWorkitemid().equals(other.getWorkitemid()))
            && (this.getWorkflowinstanceid() == null ? other.getWorkflowinstanceid() == null : this.getWorkflowinstanceid().equals(other.getWorkflowinstanceid()))
            && (this.getWorkflowtokenid() == null ? other.getWorkflowtokenid() == null : this.getWorkflowtokenid().equals(other.getWorkflowtokenid()))
            && (this.getTokenid() == null ? other.getTokenid() == null : this.getTokenid().equals(other.getTokenid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActiontype() == null) ? 0 : getActiontype().hashCode());
        result = prime * result + ((getActivitycode() == null) ? 0 : getActivitycode().hashCode());
        result = prime * result + ((getActivityname() == null) ? 0 : getActivityname().hashCode());
        result = prime * result + ((getBizobjectid() == null) ? 0 : getBizobjectid().hashCode());
        result = prime * result + ((getBizpropertycode() == null) ? 0 : getBizpropertycode().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreatedtime() == null) ? 0 : getCreatedtime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getModifiedtime() == null) ? 0 : getModifiedtime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getRelusers() == null) ? 0 : getRelusers().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getSchemacode() == null) ? 0 : getSchemacode().hashCode());
        result = prime * result + ((getWorkitemid() == null) ? 0 : getWorkitemid().hashCode());
        result = prime * result + ((getWorkflowinstanceid() == null) ? 0 : getWorkflowinstanceid().hashCode());
        result = prime * result + ((getWorkflowtokenid() == null) ? 0 : getWorkflowtokenid().hashCode());
        result = prime * result + ((getTokenid() == null) ? 0 : getTokenid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actiontype=").append(actiontype);
        sb.append(", activitycode=").append(activitycode);
        sb.append(", activityname=").append(activityname);
        sb.append(", bizobjectid=").append(bizobjectid);
        sb.append(", bizpropertycode=").append(bizpropertycode);
        sb.append(", content=").append(content);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", creater=").append(creater);
        sb.append(", modifiedtime=").append(modifiedtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", relusers=").append(relusers);
        sb.append(", result=").append(result);
        sb.append(", schemacode=").append(schemacode);
        sb.append(", workitemid=").append(workitemid);
        sb.append(", workflowinstanceid=").append(workflowinstanceid);
        sb.append(", workflowtokenid=").append(workflowtokenid);
        sb.append(", tokenid=").append(tokenid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}