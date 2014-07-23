package ca.viaware.api.sql;

import java.util.HashMap;
import java.util.Set;

public class DatabaseRow {

	private HashMap<String,Object> columns;
	
	public DatabaseRow() {
		columns = new HashMap<String,Object>();
	}
	
	public void setColumn(String col, Object val) {
		columns.put(col, val);
	}
	
	public double getDouble(String col) {
		return (Double) columns.get(col);
	}
	
	public long getLong(String col) {
		return (Long) columns.get(col);
	}
	
	public String getString(String col) {
		return (String) columns.get(col);
	}
	
	public String getStringForced(String col) {
		if (columns.get(col) instanceof Integer) {
			return Integer.toString(getInt(col));
		} else if (columns.get(col) instanceof Long) {
			return Long.toString(getLong(col));
		} else if (columns.get(col) instanceof Double) {
			return Double.toString(getDouble(col));
		} else if (columns.get(col) instanceof String) {
			return getString(col);
		}
		return "UNKNOWN TYPE";
	}
	
	public int getInt(String col) {
		return (Integer) columns.get(col);
	}
	
	public Set<String> getColumNames() {
		return columns.keySet();
	}
}
