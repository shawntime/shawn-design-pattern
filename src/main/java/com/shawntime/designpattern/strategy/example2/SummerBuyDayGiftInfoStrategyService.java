package com.shawntime.designpattern.strategy.example2;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * 夏季购车节
 */
@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService {

    // 静态代码块中注册关联
    static {
        GiftInfoContext.registerProvider(1, SummerBuyDayGiftInfoStrategyService.class);
    }

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
