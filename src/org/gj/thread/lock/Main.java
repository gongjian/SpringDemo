package org.gj.thread.lock;

public class Main {
 
	
	
	public static void main(String[] args) {
		final Runnable task = new MyRunnable();
		for(int i=0; i<3; i++){
			Thread t = new Thread(task);
			t.start();
		}

	}

}
