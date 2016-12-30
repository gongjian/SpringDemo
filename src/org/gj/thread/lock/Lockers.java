package org.gj.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockers {
	private Lock lock = new ReentrantLock();
	
	public void test(){
		lock.lock();
		
		System.out.println(Thread.currentThread().getName() + " - Test begin.");
		
		try{
			Thread.sleep(3000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " - Test end.");
		lock.unlock();
	}
	
}
