package ca.viaware.api.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionListenerThread extends Thread {

	private ServerSocket server;
	private ConnectionHandler handler;
	
	public ConnectionListenerThread(int port, ConnectionHandler handler) {
		try {
			this.server = new ServerSocket(port);
			this.handler = handler;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		while (true) {
			try {
				Socket client = server.accept();
				new ConnectionHandlerRunnerThread(handler, client).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
