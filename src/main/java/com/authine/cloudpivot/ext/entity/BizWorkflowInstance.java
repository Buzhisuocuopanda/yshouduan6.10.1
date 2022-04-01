package com.authine.cloudpivot.ext.entity;

import java.io.Serializable;
import java.util.Date;

public class BizWorkflowInstance implements Serializable {
    private String id;

    private String bizobjectid;

    private String instancename;

    private String workflowcode;

    private Integer workflowversion;

    private String originator;

    private String departmentid;

    private String participant;

    private String state;

    private Date receivetime;

    private Date starttime;

    private Date finishtime;

    private Long usedtime;

    private Long waittime;

    private String remark;

    private String departmentname;

    private String originatorname;

    private String parentid;

    private Integer statevalue;

    private String workflowtokenid;

    private String appcode;

    private String sheetbizobjectid;

    private String sheetschemacode;

    private String sequenceno;

    private String trustee;

    private String trusteename;

    private String trusttype;

    private String schemacode;

    private String datatype;

    private String runmode;

    private String source;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBizobjectid() {
        return bizobjectid;
    }

    public void setBizobjectid(String bizobjectid) {
        this.bizobjectid = bizobjectid == null ? null : bizobjectid.trim();
    }

    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename == null ? null : instancename.trim();
    }

    public String getWorkflowcode() {
        return workflowcode;
    }

    public void setWorkflowcode(String workflowcode) {
        this.workflowcode = workflowcode == null ? null : workflowcode.trim();
    }

    public Integer getWorkflowversion() {
        return workflowversion;
    }

    public void setWorkflowversion(Integer workflowversion) {
        this.workflowversion = workflowversion;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator == null ? null : originator.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant == null ? null : participant.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Long getUsedtime() {
        return usedtime;
    }

    public void setUsedtime(Long usedtime) {
        this.usedtime = usedtime;
    }

    public Long getWaittime() {
        return waittime;
    }

    public void setWaittime(Long waittime) {
        this.waittime = waittime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getOriginatorname() {
        return originatorname;
    }

    public void setOriginatorname(String originatorname) {
        this.originatorname = originatorname == null ? null : originatorname.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getStatevalue() {
        return statevalue;
    }

    public void setStatevalue(Integer statevalue) {
        this.statevalue = statevalue;
    }

    public String getWorkflowtokenid() {
        return workflowtokenid;
    }

    public void setWorkflowtokenid(String workflowtokenid) {
        this.workflowtokenid = workflowtokenid == null ? null : workflowtokenid.trim();
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode == null ? null : appcode.trim();
    }

    public String getSheetbizobjectid() {
        return sheetbizobjectid;
    }

    public void setSheetbizobjectid(String sheetbizobjectid) {
        this.sheetbizobjectid = sheetbizobjectid == null ? null : sheetbizobjectid.trim();
    }

    public String getSheetschemacode() {
        return sheetschemacode;
    }

    public void setSheetschemacode(String sheetschemacode) {
        this.sheetschemacode = sheetschemacode == null ? null : sheetschemacode.trim();
    }

    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno == null ? null : sequenceno.trim();
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee == null ? null : trustee.trim();
    }

    public String getTrusteename() {
        return trusteename;
    }

    public void setTrusteename(String trusteename) {
        this.trusteename = trusteename == null ? null : trusteename.trim();
    }

    public String getTrusttype() {
        return trusttype;
    }

    public void setTrusttype(String trusttype) {
        this.trusttype = trusttype == null ? null : trusttype.trim();
    }

    public String getSchemacode() {
        return schemacode;
    }

    public void setSchemacode(String schemacode) {
        this.schemacode = schemacode == null ? null : schemacode.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getRunmode() {
        return runmode;
    }

    public void setRunmode(String runmode) {
        this.runmode = runmode == null ? null : runmode.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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
        BizWorkflowInstance other = (BizWorkflowInstance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizobjectid() == null ? other.getBizobjectid() == null : this.getBizobjectid().equals(other.getBizobjectid()))
            && (this.getInstancename() == null ? other.getInstancename() == null : this.getInstancename().equals(other.getInstancename()))
            && (this.getWorkflowcode() == null ? other.getWorkflowcode() == null : this.getWorkflowcode().equals(other.getWorkflowcode()))
            && (this.getWorkflowversion() == null ? other.getWorkflowversion() == null : this.getWorkflowversion().equals(other.getWorkflowversion()))
            && (this.getOriginator() == null ? other.getOriginator() == null : this.getOriginator().equals(other.getOriginator()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getParticipant() == null ? other.getParticipant() == null : this.getParticipant().equals(other.getParticipant()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getReceivetime() == null ? other.getReceivetime() == null : this.getReceivetime().equals(other.getReceivetime()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getFinishtime() == null ? other.getFinishtime() == null : this.getFinishtime().equals(other.getFinishtime()))
            && (this.getUsedtime() == null ? other.getUsedtime() == null : this.getUsedtime().equals(other.getUsedtime()))
            && (this.getWaittime() == null ? other.getWaittime() == null : this.getWaittime().equals(other.getWaittime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDepartmentname() == null ? other.getDepartmentname() == null : this.getDepartmentname().equals(other.getDepartmentname()))
            && (this.getOriginatorname() == null ? other.getOriginatorname() == null : this.getOriginatorname().equals(other.getOriginatorname()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getStatevalue() == null ? other.getStatevalue() == null : this.getStatevalue().equals(other.getStatevalue()))
            && (this.getWorkflowtokenid() == null ? other.getWorkflowtokenid() == null : this.getWorkflowtokenid().equals(other.getWorkflowtokenid()))
            && (this.getAppcode() == null ? other.getAppcode() == null : this.getAppcode().equals(other.getAppcode()))
            && (this.getSheetbizobjectid() == null ? other.getSheetbizobjectid() == null : this.getSheetbizobjectid().equals(other.getSheetbizobjectid()))
            && (this.getSheetschemacode() == null ? other.getSheetschemacode() == null : this.getSheetschemacode().equals(other.getSheetschemacode()))
            && (this.getSequenceno() == null ? other.getSequenceno() == null : this.getSequenceno().equals(other.getSequenceno()))
            && (this.getTrustee() == null ? other.getTrustee() == null : this.getTrustee().equals(other.getTrustee()))
            && (this.getTrusteename() == null ? other.getTrusteename() == null : this.getTrusteename().equals(other.getTrusteename()))
            && (this.getTrusttype() == null ? other.getTrusttype() == null : this.getTrusttype().equals(other.getTrusttype()))
            && (this.getSchemacode() == null ? other.getSchemacode() == null : this.getSchemacode().equals(other.getSchemacode()))
            && (this.getDatatype() == null ? other.getDatatype() == null : this.getDatatype().equals(other.getDatatype()))
            && (this.getRunmode() == null ? other.getRunmode() == null : this.getRunmode().equals(other.getRunmode()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizobjectid() == null) ? 0 : getBizobjectid().hashCode());
        result = prime * result + ((getInstancename() == null) ? 0 : getInstancename().hashCode());
        result = prime * result + ((getWorkflowcode() == null) ? 0 : getWorkflowcode().hashCode());
        result = prime * result + ((getWorkflowversion() == null) ? 0 : getWorkflowversion().hashCode());
        result = prime * result + ((getOriginator() == null) ? 0 : getOriginator().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getParticipant() == null) ? 0 : getParticipant().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getReceivetime() == null) ? 0 : getReceivetime().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getFinishtime() == null) ? 0 : getFinishtime().hashCode());
        result = prime * result + ((getUsedtime() == null) ? 0 : getUsedtime().hashCode());
        result = prime * result + ((getWaittime() == null) ? 0 : getWaittime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
        result = prime * result + ((getOriginatorname() == null) ? 0 : getOriginatorname().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getStatevalue() == null) ? 0 : getStatevalue().hashCode());
        result = prime * result + ((getWorkflowtokenid() == null) ? 0 : getWorkflowtokenid().hashCode());
        result = prime * result + ((getAppcode() == null) ? 0 : getAppcode().hashCode());
        result = prime * result + ((getSheetbizobjectid() == null) ? 0 : getSheetbizobjectid().hashCode());
        result = prime * result + ((getSheetschemacode() == null) ? 0 : getSheetschemacode().hashCode());
        result = prime * result + ((getSequenceno() == null) ? 0 : getSequenceno().hashCode());
        result = prime * result + ((getTrustee() == null) ? 0 : getTrustee().hashCode());
        result = prime * result + ((getTrusteename() == null) ? 0 : getTrusteename().hashCode());
        result = prime * result + ((getTrusttype() == null) ? 0 : getTrusttype().hashCode());
        result = prime * result + ((getSchemacode() == null) ? 0 : getSchemacode().hashCode());
        result = prime * result + ((getDatatype() == null) ? 0 : getDatatype().hashCode());
        result = prime * result + ((getRunmode() == null) ? 0 : getRunmode().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bizobjectid=").append(bizobjectid);
        sb.append(", instancename=").append(instancename);
        sb.append(", workflowcode=").append(workflowcode);
        sb.append(", workflowversion=").append(workflowversion);
        sb.append(", originator=").append(originator);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", participant=").append(participant);
        sb.append(", state=").append(state);
        sb.append(", receivetime=").append(receivetime);
        sb.append(", starttime=").append(starttime);
        sb.append(", finishtime=").append(finishtime);
        sb.append(", usedtime=").append(usedtime);
        sb.append(", waittime=").append(waittime);
        sb.append(", remark=").append(remark);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", originatorname=").append(originatorname);
        sb.append(", parentid=").append(parentid);
        sb.append(", statevalue=").append(statevalue);
        sb.append(", workflowtokenid=").append(workflowtokenid);
        sb.append(", appcode=").append(appcode);
        sb.append(", sheetbizobjectid=").append(sheetbizobjectid);
        sb.append(", sheetschemacode=").append(sheetschemacode);
        sb.append(", sequenceno=").append(sequenceno);
        sb.append(", trustee=").append(trustee);
        sb.append(", trusteename=").append(trusteename);
        sb.append(", trusttype=").append(trusttype);
        sb.append(", schemacode=").append(schemacode);
        sb.append(", datatype=").append(datatype);
        sb.append(", runmode=").append(runmode);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}