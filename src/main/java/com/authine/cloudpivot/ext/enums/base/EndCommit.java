package com.authine.cloudpivot.ext.enums.base;

public enum EndCommit {
    COMMIT(new Byte("1"), "提交成功"),
    NOT_COMMIT(new Byte("2"), "提交失败"),
    ;

    private Byte code;

    private String msg;

    public Byte getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    EndCommit(Byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}