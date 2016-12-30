package org.gj.thread.sync.exam5;

public class Sync {
	
	public void test(){
		synchronized(Sync.class){
			System.out.println(Thread.currentThread().getName() + " - Test begin.");
			
			try{
				Thread.sleep(3000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " - Test end.");
		}
	}
}
