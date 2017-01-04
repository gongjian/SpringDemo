package org.gj.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class NIOClient {

	public static void main(String[] args) {
		try {
			Socket s1 = new Socket("127.0.0.1", 8080);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
			dis.close();
			s1.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
