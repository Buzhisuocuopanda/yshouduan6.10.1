package com.authine.cloudpivot.ext.twocommit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.integration.redis.util.RedisLockRegistry;

/**
 * ClassName DistributedLockAutoConfiguration
 * Description
 * Create by gfy
 * Date 2022/2/22 11:54
 */
@Configuration
/** 指定配置文件中存在某个对应值时 才可加载此配置 */
//@ConditionalOnProperty(name = "auxiliary.distributed.lock.enable", havingValue = "true")
@ComponentScan(basePackages = "com.authine.cloudpivot.ext.twocommit")
public class DistributedLockAutoConfiguration {

    @Bean
    public RedisLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory) {
        return new RedisLockRegistry(redisConnectionFactory, "distributed-lock");
    }


}