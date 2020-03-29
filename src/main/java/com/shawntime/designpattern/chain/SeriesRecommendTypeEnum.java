package com.shawntime.designpattern.chain;

/**
 * 定义责任链的处理机制
 */
public enum SeriesRecommendTypeEnum {

    USER_PORTRAIT(1, "用户画像偏好车系"),

    COMPETING_SERIES(2, "竞品车系"),

    LEADS_COUNT(3, "最近半年报名量"),

    CURR_ACTIVITY(4, "当前活动"),

    RANDOM(5, "随机返回"),

    TOP_SERIES(6, "置顶车系"),

    USER_PORTRAIT_BUY_SERIES(7, "用户画像已购车系"),

    USER_MOBILE(8, "用户手机号最近一次报名车系"),

    BRAND(9, "品牌匹配"),

    USER_PORTRAIT_COMPETING_SERIES(10, "用户画像偏好车系竞品车系"),

    SUBJECT_CITY_DEFUALT_SERIES(11, "专题车系默认车系单表"),

    HISTORY_SERIES_LEADS_COUNT(12, "专题城市车系历史报名量"),

    ;

    private int code;

    private String description;

    SeriesRecommendTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}

