package org.gj.thread.sync.exam3;

public class Sync {
	
	public void test(){
		synchronized(this){
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
