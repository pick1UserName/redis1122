package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
*
*@author:jt   
*@date:2020年4月1日  下午3:07:54
*/

public class TestJedisPool {

	public static void main(String[] args) {
		
		JedisPool jedisPool1 = JedisPoolUtil.getJedisPool();
		System.out.println(jedisPool1);
		
		Jedis jedis = null;
		try {
			jedis = jedisPool1.getResource();
			jedis.set("ka","as");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JedisPoolUtil.release(jedisPool1, jedis);
		}
		
	}
}
