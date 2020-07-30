package io.github.tanghuibo.springcachestudy.service;


/**
 * @author tanghuibo
 * @date 2020/7/30下午11:31
 */
public interface CacheTestService {

    /**
     * 缓存key
     * @param key
     * @return
     */
    String ableCache(int key);

    /**
     * 移除key
     * @param key
     */
    void cacheEvictCache(int key);

}
