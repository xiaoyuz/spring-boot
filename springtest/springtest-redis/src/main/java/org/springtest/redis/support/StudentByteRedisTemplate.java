/**
 * 
 */
package org.springtest.redis.support;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springtest.domain.Student;

/**
 * @author qijb
 *
 */

public class StudentByteRedisTemplate extends RedisTemplate<String, Student> {

	public StudentByteRedisTemplate() {
		RedisSerializer<String> stringSerializer = new StringRedisSerializer();
		MessagePackSerializer messagePackSerializer = new MessagePackSerializer(Student.class);
		
		//Key type is string，value type is byte[]
		setKeySerializer(stringSerializer);
		setValueSerializer(messagePackSerializer);
		
		setHashKeySerializer(stringSerializer);
		setHashValueSerializer(messagePackSerializer);
	}
	
	public StudentByteRedisTemplate(RedisConnectionFactory connectionFactory) {
		this();
		setConnectionFactory(connectionFactory);
		afterPropertiesSet();
	}
}
