/**
 * 
 */
package org.springtest.redis.support;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @author qijb
 *
 */
public class ByteSerializationRedisSerializer implements RedisSerializer<byte[]> {

	/**
	 * 
	 */
	public ByteSerializationRedisSerializer() {
		// TODO Auto-generated constructor stub
	}

	public byte[] deserialize(byte[] arg0) throws SerializationException {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] serialize(byte[] arg0) throws SerializationException {
		// TODO Auto-generated method stub
		return null;
	}



}
