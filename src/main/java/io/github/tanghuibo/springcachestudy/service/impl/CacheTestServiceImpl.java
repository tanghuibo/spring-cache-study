package io.github.tanghuibo.springcachestudy.service.impl;

import io.github.tanghuibo.springcachestudy.service.CacheTestService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author tanghuibo
 * @date 2020/7/30下午11:33
 */
@Service
public class CacheTestServiceImpl implements CacheTestService {

    @Override
    @Cacheable(cacheNames = {"key1"}, key = "#key % 5", unless="#result == null")
    public String ableCache(int key) {
        System.out.println("计算中...");
        if(key == 3) {
            return null;
        }
        return String.format("你好: %s", key);
    }

    @Override
    @CacheEvict(cacheNames = {"key1"}, key = "#key")
    public void cacheEvictCache(int key) {
        System.out.println(String.format("移除key %s", key));
    }
}
