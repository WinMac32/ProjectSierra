package ca.viaware.api.sql.factory.obj;

import ca.viaware.api.sql.Database;
import ca.viaware.api.sql.factory.BaseFactory;

public abstract class DatabaseObject {

	private int databaseId;
	
	/**
	 * Constructs database object. Make sure id is unique SQL database primary key
	 * @param id
	 */
	public DatabaseObject(int databaseId) {
		this.databaseId = databaseId;
	}
	
	public int getId() {
		return databaseId;
	}
	
	public void setId(int databaseId) {
		this.databaseId = databaseId;
	}
	
}
