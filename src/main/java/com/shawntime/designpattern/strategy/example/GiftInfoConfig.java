package com.shawntime.designpattern.strategy.example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 礼品信息配置类
 */
@Configuration
public class GiftInfoConfig {

    @Resource
    private IGiftInfoStrategyService doubleElevenGiftInfoStrategyService;

    @Resource
    private IGiftInfoStrategyService summerBuyDayGiftInfoStrategyService;

    /**
     * 注入bean
     */
    @Bean
    public Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap() {
        Map<Integer, IGiftInfoStrategyService> dataMap = new HashMap<>();
        dataMap.put(1, summerBuyDayGiftInfoStrategyService);
        dataMap.put(2, doubleElevenGiftInfoStrategyService);
        return dataMap;
    }
}
