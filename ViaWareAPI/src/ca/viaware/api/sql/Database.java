package ca.viaware.api.sql;

import ca.viaware.api.logging.Log;
import ca.viaware.api.sql.exceptions.ViaWareSQLException;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;

public class Database {

	private SQLiteConnection connection;

	public Database(SQLiteConnection connection) {
		this.connection = connection;
	}

	public DatabaseResults query(String sql, Object... args) throws ViaWareSQLException {

		try {
			DatabaseResults results = new DatabaseResults();
			SQLiteStatement statement = connection.prepare(sql);

			for (int i = 0; i < args.length; i++) {
				if (args[i] instanceof Double) {
					statement.bind(i+1, (Double) args[i]);
				} else if (args[i] instanceof Integer) {
					statement.bind(i+1, (Integer) args[i]);
				} else if (args[i] instanceof String) {
					statement.bind(i+1, (String) args[i]);
				} else if (args[i] instanceof Long) {
					statement.bind(i+1, (Long) args[i]);
				} else {
					Log.error("Argument " + i + " is invalid type!");
				}
			}
			
			Log.info("SQL query: " + statement.toString());

			while (statement.step()) {
				DatabaseRow row = new DatabaseRow();
				for (int i = 0; i < statement.columnCount(); i++) {
					row.setColumn(statement.getColumnName(i), statement.columnValue(i));
				}
				results.addRow(row);
			}

			statement.dispose();

			return results;
		} catch (SQLiteException e) {
			throw new ViaWareSQLException(e);
		}
	}
	
	public int getLastInsertedID() {
		try {
			DatabaseResults results = query("SELECT last_insert_rowid()");
			return results.getRow(0).getInt(results.getRow(0).getColumNames().toArray()[0].toString());
		} catch (ViaWareSQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void close() {
		connection.dispose();
	}

}
