package ca.viaware.api.logging;

import java.util.Calendar;

public class Log {

	public static void info(String msg) {
		System.out.println("[" + getTime() + "][INFO] " + msg);
	}
	
	public static void info(String msg, Object... args) {
		for (int i = 0; i < args.length; i++) {
			msg = msg.replace("%" + i, "\"" + args[i].toString() + "\"");
		}
		info(msg);
	}
	
	public static void error(String msg) {
		System.err.println("[" + getTime() + "][ERROR] " + msg);
	}
	
	public static void error(String msg, Object... args) {
		for (int i = 0; i < args.length; i++) {
			msg = msg.replace("%" + i, "\"" + args[i].toString() + "\"");
		}
		error(msg);
	}
	
	private static String getTime() {
		
		Calendar cal = Calendar.getInstance();
		
		return "" + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
	}
	
}
