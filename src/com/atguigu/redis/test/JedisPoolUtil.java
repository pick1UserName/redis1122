package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
*
*@author:jt   
*@date:2020年4月1日  下午2:58:07
*/

public class JedisPoolUtil {
	
	private static JedisPool jedisPool;
	private JedisPoolUtil() {}
	
	public static JedisPool getJedisPool() {
		if (jedisPool == null) {
			synchronized (JedisPoolUtil.class) {
				if (jedisPool == null) {
					JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
					jedisPoolConfig.setMaxActive(1000);
					jedisPoolConfig.setMaxIdle(32);
					jedisPoolConfig.setMaxWait(100*1000);
					jedisPoolConfig.setTestOnBorrow(true);
					jedisPool = new JedisPool(jedisPoolConfig, "192.168.253.130", 6379);
				}
			}
		}
		return jedisPool;
	}
	
	public static void release(JedisPool jedisPool,Jedis jedis) {
		if (jedis != null) {
			jedisPool.returnResourceObject(jedis);
			
		}
		
	}

}
