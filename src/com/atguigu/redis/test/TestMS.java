package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

/**
*
*@author:jt   
*@date:2020年4月1日  下午2:26:47
*/

public class TestMS {

	public static void main(String[] args) {
		Jedis jedis_m = new Jedis("192.168.253.130", 6379);
		Jedis jedis_s = new Jedis("192.168.253.130", 6380);
		
		jedis_s.slaveof("192.168.253.130", 6379);
		
		jedis_m.set("class","1111222");
		
		System.out.println(jedis_s.get("class"));
	}
}
