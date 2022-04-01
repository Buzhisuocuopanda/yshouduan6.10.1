package com.authine.cloudpivot.ext.enums;


public enum DeleteFlagEnum  {

    DELETE(new Byte("1"), "已删除"),
    NOT_DELETE(new Byte("0"), "未删除"),
    ;

    private Byte code;

    private String msg;

    public Byte getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    DeleteFlagEnum(Byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
