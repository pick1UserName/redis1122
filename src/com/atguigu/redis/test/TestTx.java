package com.atguigu.redis.test;



import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
*
*@author:jt   
*@date:2020年4月1日  下午2:04:01
*/

public class TestTx {
	
	public boolean transMethod() {
		int balance;
		int dept;
		int price = 10;
		
		Jedis jedis = new Jedis("192.168.253.130", 6379);
		  /**
		   * 通俗点讲，watch命令就是标记一个键，如果标记了一个键， 
		   * 在提交事务前如果该键被别人修改过，那事务就会失败，这种情况通常可以在程序中
		   * 重新再尝试一次。
		   * 首先标记了键balance，然后检查余额是否足够，不足就取消标记，并不做扣减； 
		   * 足够的话，就启动事务进行更新操作，
		   * 如果在此期间键balance被其它人修改， 那在提交事务（执行exec）时就会报错， 
		   * 程序中通常可以捕获这类错误再重新执行一次，直到成功。
		   */
		jedis.watch("balance");
		balance = Integer.parseInt(jedis.get("balance"));
		if (balance < price) {
			jedis.unwatch();
			 System.out.println("modify");
			return false;
		}else {
			System.out.println("redis Transaction......");
			Transaction tx = jedis.multi();
			tx.decrBy("balance",price);
			tx.incrBy("dept",price);
			tx.exec();
			balance = Integer.parseInt(jedis.get("balance"));
			dept = Integer.parseInt(jedis.get("dept"));
			System.out.println("balance:"+balance+"============"+"dept:"+dept);
			return true;
		}
	}

	public static void main(String[] args) {
		TestTx tx = new TestTx();
		boolean retVal = tx.transMethod();
		System.out.println(retVal);
		
	}
}
