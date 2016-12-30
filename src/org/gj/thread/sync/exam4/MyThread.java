package org.gj.thread.sync.exam4;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sync.test();
	}

}
