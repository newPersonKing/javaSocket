package server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReceiveRunnable implements Runnable{

	private Socket s=null;

	public ServerReceiveRunnable(Socket s){
		this.s=s;
	}

	public void run() {
		// TODO Auto-generated method stub
		InputStream is=null;
		DataInputStream dis=null;

		try {
			while(true){
				is=s.getInputStream();
				dis=new DataInputStream(is);
				System.out.println("server received:"+dis.readUTF());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


}
