package org.gj.thread.sync.exam5;

public class Main {

	public static void main(String[] args) {
		for(int i=0; i<3; i++){
			Thread thread = new MyThread();
			thread.start();
		}
	}

}
