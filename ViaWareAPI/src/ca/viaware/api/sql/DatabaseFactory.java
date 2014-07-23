package ca.viaware.api.sql;

import java.io.File;

import ca.viaware.api.logging.Log;
import ca.viaware.api.sql.exceptions.ViaWareSQLException;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;

public class DatabaseFactory {

	public Database getDatabase(String path) throws ViaWareSQLException {
		Log.info("Loading database \"" + path + "\"...");
		SQLiteConnection connection = new SQLiteConnection(new File(path));
		try {
			connection.open(true);
		} catch (SQLiteException e) {
			throw new ViaWareSQLException(e);
		}
		Log.info("Database loaded successfully.");
		return new Database(connection);
	}
	
}
