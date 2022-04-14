package com.authine.cloudpivot.ext.enums;

public enum StoreEnum {

    ENDCOMMIT(new Byte("1"), "成功"),
    NOT_ENDCOMMIT(new Byte("2"), "失败"),

    ISENDLED(new Byte("1"), "成功"),
    NOT_ISENDLED(new Byte("2"), "失败"),
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
