package com.shawntime.designpattern.strategy.example2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 礼品信息环境角色类
 */
@Component
public class GiftInfoContext {

    private static final Logger logger = LoggerFactory.getLogger(GiftInfoContext.class);

    // 策略映射map
    private static final Map<Integer, Class<?>> providers = new HashMap<>();

    // 提供给策略具体实现类的注册返回
    public static void registerProvider(int subjectId, Class<?> provider) {
        providers.put(subjectId, provider);
    }

    // 对外暴露的获取礼品信息接口返回
    public static GiftInfo getGiftInfo(int subjectId, int activityId) {
        Class<?> providerClazz = providers.get(subjectId);
        Assert.assertNotNull(providerClazz);
        Object bean = SpringUtils.getBean(providerClazz);
        Assert.assertNotNull(bean);
        if (bean instanceof IGiftInfoStrategyService) {
            IGiftInfoStrategyService strategyService = (IGiftInfoStrategyService) bean;
            return strategyService.getGiftInfo(activityId);
        }
        logger.error("Not Class with IGiftInfoListService: {}", providerClazz.getName());
        return null;
    }
}
