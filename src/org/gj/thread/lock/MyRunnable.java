package org.gj.thread.lock;

public class MyRunnable implements Runnable {
	
	final Lockers locker = new Lockers();

	@Override
	public void run() {
		locker.test();
	}

}
