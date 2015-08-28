/**
 * 
 */
package org.springtest.redis.support;

import java.io.IOException;

import org.msgpack.MessagePack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @author ying_7839
 * 
 */
public class MessagePackSerializer<E> implements RedisSerializer<E> {
	protected static final Logger log = LoggerFactory
			.getLogger(MessagePackSerializer.class);
	static final byte[] EMPTY_ARRAY = new byte[0];

	private MessagePack messagePack = new MessagePack();
	private final Class<E> javaType;

	/**
	 * 
	 */
	public MessagePackSerializer(Class<E> type) {
		this.javaType = type;
	}

	public E deserialize(byte[] bytes) throws SerializationException {
		if (null != bytes && bytes.length > 0) {
			try {
				return this.messagePack.read(bytes, javaType);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
		return null;
	}

	public byte[] serialize(E t) throws SerializationException {
		if (null != t) {
			try {
				return messagePack.write(t);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
		return EMPTY_ARRAY;
	}

}
