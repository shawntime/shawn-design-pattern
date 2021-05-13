package com.shawntime.designpattern.strategy.example;

import org.springframework.stereotype.Service;

/**
 * 双11活动
 */
@Service
public class DoubleElevenGiftInfoStrategyService implements IGiftInfoStrategyService {

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        // 双11调用统一平台接口获取礼品信息
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(902);
        giftInfo.setGiftName("空气净化器");
        return giftInfo;
    }

    @Override
    public int typeId() {
        return 1;
    }
}
