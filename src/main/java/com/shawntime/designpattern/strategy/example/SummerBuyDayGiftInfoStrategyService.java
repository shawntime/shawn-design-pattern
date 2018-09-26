package com.shawntime.designpattern.strategy.example;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * 夏季购车节
 */
@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService {

    @Resource
    private GiftInfoMapper giftInfoMapper;
    
    public GiftInfo getGiftInfo(int activityId) {
        // 从数据库中查询
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("铁锅三件套");
        giftInfoMapper.getGiftInfoByActivityId(activityId)
        return giftInfo;
    }
}
