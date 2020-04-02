package com.atguigu.redis.test;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;

/**
*
*@author:jt   
*@date:2020年4月1日  上午10:58:23
*/

public class TestAPI {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.253.130", 6379);
		System.out.println(jedis.ping()); 
		
		//string
//		System.out.println(jedis.set("k1", "1"));
//		System.out.println(jedis.mset("a1","1","a2","2"));
//		System.out.println(jedis.mget("k1","k2"));
//		System.out.println(jedis.keys("a?"));
//		jedis.append("k1", "hello");
//		System.out.println(jedis.getrange("k1", 1, 4));
//		jedis.setrange("k1", 3,"xxx" );
//		System.out.println(jedis.get("k1"));
//		jedis.del("a2");
//		System.out.println(jedis.keys("*"));
//		jedis.setex("k3",20, "eee");
//		System.out.println(jedis.get("k3"));
//		System.out.println(jedis.setnx("k3", "aaa"));
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(jedis.get("k3"));
//		System.out.println(jedis.setnx("k3", "aaa"));
//		System.out.println(jedis.get("k3"));
		
		//list
//		jedis.flushDB();
//		jedis.lpush("list01", "1","2","3","4","5","6");
//		System.out.println(jedis.lrange("list01", 0, -1));
//		jedis.rpush("list02", "1","2","2","2","2","3","4","5","6");
//		System.out.println(jedis.lrange("list02", 0, -1));
//		System.out.println(jedis.lindex("list01", 2));
//		jedis.lrem("lsit02", 3, "2");
//		System.out.println(jedis.lrange("list02", 0, -1));
//		jedis.rpoplpush("list01", "list02");
//		System.out.println(jedis.lrange("list01", 0, -1));
//		System.out.println(jedis.lrange("list02", 0, -1));
//		jedis.ltrim("list02", 2, 5);
//		System.out.println(jedis.lrange("list02", 0, -1));
//		jedis.lset("list02", 2, "aaa");
//		System.out.println(jedis.lrange("list02", 0, -1));
//		jedis.linsert("list02",  BinaryClient.LIST_POSITION.AFTER,"2", "didid");
//		System.out.println(jedis.lrange("list02", 0, -1));
		
		//set
//		jedis.flushDB();
//		jedis.sadd("set01","1","2","3","4","5","6");
//		jedis.sadd("set02","1","2","3","x","y","z");
//		System.out.println(jedis.smembers("set01"));
//		System.out.println(jedis.smembers("set02"));
//		System.out.println(jedis.sismember("set01","1"));
//		jedis.srem("list02", "1");
//		System.out.println(jedis.sismember("set01","1"));
//		System.out.println(jedis.smembers("set01"));
//		System.out.println(jedis.sdiff("set01","set02"));
//		System.out.println(jedis.sinter("set01","set02"));
//		System.out.println(jedis.sunion("set01","set02"));
//		jedis.srandmember("set01");
		
		//hash
//		jedis.hset("user", "name", "jiangtao");
//		Map<String, String> studentMap = new HashMap<String, String>();
//		studentMap.put("id", "10001");
//		studentMap.put("name", "goudongxi");
//		studentMap.put("age", "14");
//		studentMap.put("score", "80");
//		jedis.hmset("student", studentMap );
//		System.out.println(jedis.keys("*"));
//		System.out.println(jedis.hlen("user"));
//		System.out.println(jedis.hlen("student"));
//		System.out.println(jedis.hexists("student", "age"));
//		System.out.println(jedis.hexists("student", "age1"));
//		System.out.println(jedis.hkeys("student"));
//		System.out.println(jedis.hvals("student"));
//		System.out.println(jedis.hgetAll("student"));
		
		//zset
//		jedis.flushDB();
//		Map<Double, String> map = new HashMap<Double, String>();
//		map.put(60.0, "lv1");
//		map.put(70.0, "lv2");
//		map.put(80.0, "lv3");
//		map.put(90.0, "lv4");
//		map.put(100.0, "lv5");
//		jedis.zadd("zset1", map);
//		System.out.println(jedis.zrange("zset1", 1, 3));
//		System.out.println(jedis.zrangeWithScores("zset1", 1, 3));
//		System.out.println(jedis.zcard("zset1"));
//		System.out.println(jedis.zcount("zset1",60,90));
//		System.out.println(jedis.zscore("zset1","lv4"));
//		jedis.zrem("zset1", "lv4");
//		System.out.println(jedis.zrange("zset1", 0, -1));
		
		
	}
}
