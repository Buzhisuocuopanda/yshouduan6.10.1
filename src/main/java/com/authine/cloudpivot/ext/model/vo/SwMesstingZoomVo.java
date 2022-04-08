package com.authine.cloudpivot.ext.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class SwMesstingZoomVo {

    @ApiModelProperty(
            value = "创建者",
            required = true
    )
    @NotBlank(message = "创建者不能为空")
    //创建者
    private String creater;
    //创建时间
    private Date createtime;
    //修改者
    private String updater;
    //修改时间
    private Date updatetime;
    //流水号
    private String sequeceno;
    //所属组织
    private String organization;

    @ApiModelProperty(
            value = "会议室名称",
            required = true
    )
    @NotBlank(message = "会议室名称不能为空")
    //会议室名称
    private String meetingname;
    //会议室图片
    private String meetinguri;

    @ApiModelProperty(
            value = "会议室分类",
            required = true
    )
    @NotBlank(message = "会议室分类不能为空")
    //会议室分类
    private String meetingtype;
    //排序号
    private int slot;
    //所需设备
    private String device;

    @ApiModelProperty(
            value = "会议室地址",
            required = true
    )
    @NotBlank(message = "会议室地址不能为空")
    //会议室地址
    private String address;
    //容纳人数
    private int peoplenum;
    //会议管理员id
    private String meetingadmin;
    //开启会议是否需要审核 1：是 -1不是
    private Byte ifcheck;
    //是否有效 1：有效 -1 无效
    private Byte isdisabled;
    //是否被删除，0：否；1：是
    private Byte deleted;

    @ApiModelProperty(
            value = "会议室管理员",
            required = true
    )
    @NotBlank(message = "会议室管理员不能为空")
    //会议管理员姓名
    private String meetingadminname;

    @ApiModelProperty(
            value = "创建者姓名",
            required = true
    )
    @NotBlank(message = "创建者姓名不能为空")
    //创建人姓名
    private String createname;

    private String SwMeetingZoomId;

    private String bizObjectId;
    @NotBlank
    private String tranNo;

    private String workflowInstance;

    private String ysReult;


}
