package com.qianlq.customer.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author CoderQian
 * @date 2018-10-02 下午3:15
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

    @Value("${profile}")
    private String profile;

    @Test
    public void testConfig() {
        // 先启动config server, 在执行该测试方法, 否则会报错
        Assert.assertEquals("native", profile);
    }
}
