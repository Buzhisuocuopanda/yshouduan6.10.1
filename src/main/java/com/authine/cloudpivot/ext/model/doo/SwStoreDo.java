package com.authine.cloudpivot.ext.model.doo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class SwStoreDo {
    //创建者
    private String creater;

    //创建时间
    private Date createtime;

    //修改者
    private String updater;

    //修改时间
    private Date updatetime;

    //是否删除
    private Byte deleted;

    //云枢审核结果
    private String  ysresult;

    //自生成流程标识号
    private String tranno;

    //业务对象id
    private String bizobjectid;

    //流程id
    private String workflowinstance;

    //云枢是否提交成功
    private Byte endcommit;

    @ApiModelProperty(
            value = "仓库名称",
            required = true
    )
    @NotBlank(message = "仓库名称不能为空")
    //仓库名称
    private String storename;

    @ApiModelProperty(
            value = "仓库地址",
            required = true
    )
    @NotBlank(message = "仓库地址不能为空")
    //仓库地址
    private String storeaddress;

    //仓库图片
    private String storepic;


    //是否可用
    private Byte isenabled;


    //货物种类总量
    private Integer storegoodsnum;

    //货物库存总量
    private Integer storegoodsskunum;

    @ApiModelProperty(
            value = "仓库主管",
            required = true
    )
    @NotBlank(message = "仓库主管不能为空")
    //仓库主管
    private String storeadmin;
}
