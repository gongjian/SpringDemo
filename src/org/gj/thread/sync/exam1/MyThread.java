package org.gj.thread.sync.exam1;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sync sync = new Sync();
		sync.test();
	}

}
