package ca.viaware.api.sql.exceptions;

import com.almworks.sqlite4java.SQLiteException;

@SuppressWarnings("serial")
public class ViaWareSQLException extends Exception {

	public ViaWareSQLException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
	
	public ViaWareSQLException(SQLiteException origin) {
		this(origin.getMessage(), origin.getCause());
	}

}
