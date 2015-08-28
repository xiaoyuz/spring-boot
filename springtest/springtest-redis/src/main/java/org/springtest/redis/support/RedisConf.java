package org.springtest.redis.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class RedisConf {
	
	@Bean
    public StudentByteRedisTemplate stringByteRedisTemplate(  
            RedisConnectionFactory factory) {  
		StudentByteRedisTemplate template = new StudentByteRedisTemplate(factory); 
        return template;  
    }  

}
