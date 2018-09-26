package com.shawntime.designpattern.strategy.example;

import java.util.Map;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 礼品信息环境角色类
 */
@Component
public class GiftInfoContext {

    // 注入的策略
    @Autowired
    private Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap;

    // 对外暴露的统一获取礼品信息的返回
    public GiftInfo getGiftInfo(int subjectId, int activityId) {
        IGiftInfoStrategyService giftInfoStrategyService = giftInfoStrategyServiceMap.get(subjectId);
        Assert.assertNotNull(giftInfoStrategyService);
        return giftInfoStrategyService.getGiftInfo(activityId);
    }
}
