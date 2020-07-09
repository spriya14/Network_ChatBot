package components;

import java.io.*;
import java.net.*;

public class CThread extends Thread {
	
	String nick;
	boolean connected;
	Socket clientSocket;
	PrintWriter out;
	BufferedReader in;
	
	CThread(Socket s){
		super("CThread");
		connected = false;
		nick = "";
		clientSocket = s;
		try {
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		}
		catch(Exception e) {
			System.out.println("Exception occured :" +e);
		}
	}
	
	public boolean equals (CThread c) {
		return c.nick.equals(this.nick);
	}
	
	synchronized void send (String msg) {
		out.println(msg);
	}
	

}
