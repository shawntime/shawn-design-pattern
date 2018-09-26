package com.shawntime.designpattern.factory.simplefactory;

/**
 * Created by shma on 2018/4/13.
 */
public enum FactoryTypeEnum {

    CHANGHONG(1, "长虹"),
    GREE(2, "格力"),
    MEDIA(3, "美的"),
    ;

    private int typeId;

    private String factoryName;

    FactoryTypeEnum(int typeId, String factoryName) {
        this.typeId = typeId;
        this.factoryName = factoryName;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getFactoryName() {
        return factoryName;
    }
}
