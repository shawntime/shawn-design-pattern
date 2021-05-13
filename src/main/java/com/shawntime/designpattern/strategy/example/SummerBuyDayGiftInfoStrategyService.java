package com.shawntime.designpattern.strategy.example;

import org.springframework.stereotype.Service;

/**
 * 夏季购车节
 */
@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService {


    @Override
    public GiftInfo getGiftInfo(int activityId) {
        // 从数据库中查询
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("铁锅三件套");
        return giftInfo;
    }

    @Override
    public int typeId() {
        return 2;
    }
}
