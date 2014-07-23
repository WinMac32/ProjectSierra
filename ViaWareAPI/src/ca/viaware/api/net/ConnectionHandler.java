package ca.viaware.api.net;

import java.net.Socket;

public interface ConnectionHandler {
	
	public void handleConnection(Socket client);
	
}
