package com.authine.cloudpivot.ext.enums;

/**
 * ClassName MeetingDateEnum
 * Description
 * Create by gfy
 * Date 2022/3/2 9:41
 */
public enum MeetingDateEnum {

    EVERY(new Byte("1"), "每天"),
    WEEk1(new Byte("2"), "周一"),
    WEEk2(new Byte("3"), "周二"),
    WEEk3(new Byte("4"), "周三"),
    WEEk4(new Byte("5"), "周四"),
    WEEk5(new Byte("6"), "周五"),
    WEEk6(new Byte("7"), "周六"),
    WEEk7(new Byte("8"), "周天"),
    MONTH1(new Byte("9"), "1日"),
    MONTH2(new Byte("10"), "2日"),
    MONTH3(new Byte("11"), "3日"),
    MONTH4(new Byte("12"), "4日"),
    MONTH5(new Byte("13"), "5日"),
    MONTH6(new Byte("14"), "6日"),
    MONTH7(new Byte("15"), "7日"),
    MONTH8(new Byte("16"), "8日"),
    MONTH9(new Byte("17"), "9日"),
    MONTH10(new Byte("18"), "10日"),
    MONTH11(new Byte("19"), "11日"),
    MONTH12(new Byte("20"), "12日"),
    MONTH13(new Byte("21"), "13日"),
    MONTH14(new Byte("22"), "14日"),
    MONTH15(new Byte("23"), "15日"),
    MONTH16(new Byte("24"), "16日"),
    MONTH17(new Byte("25"), "17日"),
    MONTH18(new Byte("26"), "18日"),
    MONTH19(new Byte("27"), "19日"),
    MONTH20(new Byte("28"), "20日"),
    MONTH21(new Byte("29"), "21日"),
    MONTH22(new Byte("30"), "22日"),
    MONTH23(new Byte("31"), "23日"),
    MONTH24(new Byte("32"), "24日"),
    MONTH25(new Byte("33"), "25日"),
    MONTH26(new Byte("34"), "26日"),
    MONTH27(new Byte("35"), "27日"),
    MONTH28(new Byte("36"), "28日"),
    MONTH29(new Byte("37"), "29日"),
    MONTH30(new Byte("37"), "30日"),
    MONTH31(new Byte("37"), "31日"),

    ;

    private Byte code;

    private String msg;

    public Byte getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    MeetingDateEnum(Byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
