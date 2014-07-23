package ca.viaware.api.net;

import java.net.Socket;

public class ConnectionHandlerRunnerThread extends Thread {

	private ConnectionHandler handler;
	private Socket client;
	
	public ConnectionHandlerRunnerThread(ConnectionHandler handler, Socket client) {
		this.handler = handler;
		this.client = client;
	}
	
	public void run() {
		handler.handleConnection(client);
	}
	
}
