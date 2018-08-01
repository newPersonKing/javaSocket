package server;

import java.net.ServerSocket;
import java.net.Socket;

public class TestThreadServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss=null;
		ss=new ServerSocket(4567);
		while(true){
			Socket s=ss.accept();
			Runnable r1=new ServerReceiveRunnable(s);
			Thread t1=new Thread(r1);
			t1.start();
			
			Runnable r2=new ServerSendRunnable(s);
			Thread t2=new Thread(r2);
			t2.start();
		}
	}

	
}
