package ca.viaware.api.sql;

import java.util.ArrayList;

import ca.viaware.api.utils.StringUtils;

public class DatabaseResults {

	private ArrayList<DatabaseRow> rows;
	
	public DatabaseResults() {
		rows = new ArrayList<DatabaseRow>();
	}
	
	public void addRow(DatabaseRow row) {
		rows.add(row);
	}
	
	public DatabaseRow getRow(int row) {
		return rows.get(row);
	}
	
	public int getRowCount() {
		return rows.size();
	}
	
	public String toString() {
		String output = "";
		if (getRowCount() > 0) {
			String separator = StringUtils.repeatLength("-", getRow(0).getColumNames().size() * 20);
			output += separator + "\n";
			output += StringUtils.padMonospacedCenter("Database Results", separator.length()) + "\n";
			output += separator + "\n";
			for (String col : getRow(0).getColumNames()) {
				output += StringUtils.padMonospaced(col, 20);
			}
			output += "\n";
			output += separator + "\n";
			for (DatabaseRow row : rows) {
				for (String col : row.getColumNames()) {
					output += StringUtils.padMonospaced(row.getStringForced(col), 20);
				}
				output += "\n";
			}
			output += separator;
		} else {
			output += "NO DATA IN THIS TABLE YET";
		}
		return output;
	}
	
}
