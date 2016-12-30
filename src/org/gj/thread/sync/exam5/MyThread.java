package org.gj.thread.sync.exam5;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sync sync = new Sync();
		sync.test();
	}

}
