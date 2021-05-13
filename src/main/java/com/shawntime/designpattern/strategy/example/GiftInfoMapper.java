package com.shawntime.designpattern.strategy.example;

import org.springframework.stereotype.Component;

/**
 * Created by shma on 2018/9/26.
 */
public interface GiftInfoMapper {

    GiftInfo getGiftInfoByActivityId(int activityId);
}
