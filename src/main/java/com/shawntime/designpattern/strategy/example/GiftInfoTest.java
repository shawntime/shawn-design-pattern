package com.shawntime.designpattern.strategy.example;

import javax.annotation.Resource;

import org.junit.Assert;

/**
 * 礼品信息调用
 */
public class GiftInfoTest {

    @Resource
    private GiftInfoContext giftInfoContext;

    public GiftInfo getGiftInfo(int subjectId, int activityId) {
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        return giftInfo;
    }
}
