package com.shawntime.designpattern.strategy.example2;

import org.junit.Assert;

/**
 * Created by shma on 2018/9/26.
 */
public class GiftInfoTest {

    public GiftInfo getGiftInfo(int subjectId, int activityId) {
        GiftInfo giftInfo = GiftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        return giftInfo;
    }
}
