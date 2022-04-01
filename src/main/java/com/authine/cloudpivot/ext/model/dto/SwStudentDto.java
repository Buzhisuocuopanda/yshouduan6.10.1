package com.authine.cloudpivot.ext.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SwStudentDto {
    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private Byte deleted;

    private String studentCode;

    private String studentName;

    private String swClassId;

    private Integer goodNum;

    private String grade;

    private String major;

    private String className;

}
