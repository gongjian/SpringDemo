package org.gj.thread.sync.exam4;

public class Sync {
	
	public static synchronized void test(){
		System.out.println(Thread.currentThread().getName() + " - Test begin.");
		
		try{
			Thread.sleep(3000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " - Test end.");
	}
}
