package org.gj.thread.sync.exam3;

public class MyThread extends Thread {
	private Sync sync;
	
	public MyThread(Sync sync){
		this.sync = sync;
	}

	@Override
	public void run() {
		sync.test();
	}

}
