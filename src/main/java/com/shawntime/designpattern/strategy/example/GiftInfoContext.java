package com.shawntime.designpattern.strategy.example;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 礼品信息环境角色类
 */
@Component
public class GiftInfoContext implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * 注入的策略
     */
    private Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap = new HashMap<>();

    /**
     * 对外暴露的统一获取礼品信息的返回
     */
    public GiftInfo getGiftInfo(int typeId, int activityId) {
        IGiftInfoStrategyService giftInfoStrategyService = giftInfoStrategyServiceMap.get(typeId);
        Assert.assertNotNull(giftInfoStrategyService);
        return giftInfoStrategyService.getGiftInfo(activityId);
    }

    public Map<Integer, IGiftInfoStrategyService> getGiftInfoStrategyServiceMap() {
        return giftInfoStrategyServiceMap;
    }

    public void setGiftInfoStrategyServiceMap(Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap) {
        this.giftInfoStrategyServiceMap = giftInfoStrategyServiceMap;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        if (applicationContext.getParent() == null) {
            Map<String, IGiftInfoStrategyService> infoStrategyServiceMap =
                    applicationContext.getBeansOfType(IGiftInfoStrategyService.class);
            infoStrategyServiceMap.values()
                    .forEach(strategyService -> {
                        int typeId = strategyService.typeId();
                        giftInfoStrategyServiceMap.put(typeId, strategyService);
                    });

        }
    }
}
