/**
 * 
 */
package components;

/**
 * @author spriya1
 *
 */

import java.io.*;
import java.net.*;
import java.util.Vector;

public class Server {
	
	static Vector clients; 
	static Socket clientSocket;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clients = new Vector();
		clientSocket = null;
		ServerSocket serversocket = null;
		
		try {
			serversocket = new ServerSocket(9999);
						
		}
		catch(IOException e) {
			System.out.println("IO Exception occured:  " +e);
		}
		

	}

}
