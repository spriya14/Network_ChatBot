package components;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput extends Thread {

	public void run() {
		BufferedReader kin = new BufferedReader (new InputStreamReader (System.in));
		
		while(true) {
			if (client.logout) {
				return;
			}
			
			try {
				String command = kin.readLine (); 
				if (command.equals ("Logout")) {
					client.send (command); 
					String response = client.read (); 
					client.logout = true; 
					return;
				}
				else {
					client.send (command);
				}
			}
			catch(Exception e) {
				
			}
		}
	}
}
