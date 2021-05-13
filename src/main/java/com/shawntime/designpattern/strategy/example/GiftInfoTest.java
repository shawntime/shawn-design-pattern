package com.shawntime.designpattern.strategy.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * 礼品信息调用
 */

@Rollback(value=false)
@Transactional(transactionManager="transactionManager")
public class GiftInfoTest {

    private AnnotationConfigWebApplicationContext context;

    @Before
    public void before() {
        context = new AnnotationConfigWebApplicationContext();
        context.register(GiftInfoConfig.class);
        context.refresh();
    }

    @Test
    public void getGiftInfo() {
        GiftInfoContext giftInfoContext = context.getBean(GiftInfoContext.class);
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(1, 2);
        Assert.assertNotNull(giftInfo);
    }
}
