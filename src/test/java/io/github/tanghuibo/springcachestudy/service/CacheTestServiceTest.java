package io.github.tanghuibo.springcachestudy.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2020/7/30下午11:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CacheTestServiceTest {

    @Resource
    CacheTestService cacheTestService;
    @Test
    void cacheTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cacheTestService.ableCache(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cacheTestService.ableCache(i));
        }

        for (int i = 0; i < 10; i++) {
            cacheTestService.cacheEvictCache(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cacheTestService.ableCache(i));
        }
    }
}