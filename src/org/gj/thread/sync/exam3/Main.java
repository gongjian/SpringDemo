package org.gj.thread.sync.exam3;

public class Main {

	public static void main(String[] args) {
		Sync sync = new Sync();
		
		for(int i=0; i<3; i++){
			Thread thread = new MyThread(sync);
			thread.start();
		}
	}

}
