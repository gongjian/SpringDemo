package org.gj.thread.sync.exam2;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sync sync = new Sync();
		sync.test();
	}

}
