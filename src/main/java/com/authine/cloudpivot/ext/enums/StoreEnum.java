package com.authine.cloudpivot.ext.enums;

public enum StoreEnum {

    //是否提交成功
    ENDCOMMIT(new Byte("1"), "成功"),
    NOT_ENDCOMMIT(new Byte("2"), "失败"),

    //是否可用
    ISENDLED(new Byte("1"), "是"),
    NOT_ISENDLED(new Byte("2"), "否"),

    //删除
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

    StoreEnum(Byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
