package org.gj.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(8888);
			
			while(true){
				Socket socket = ss.accept();
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("客户端地址信息："+ socket.getInetAddress() + "\t端口号：" + socket.getPort());
				dos.writeUTF("This is test server.");
				
				dos.close();
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
