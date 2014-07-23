package ca.viaware.api.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	public static String cleanNumber(String input) {
		String cleaned = "";
		Matcher matcher = Pattern.compile("[0-9.]").matcher(input);
		
		while (!matcher.hitEnd()) {
			if (matcher.find()) {
				cleaned += matcher.group();
			}
		}
		
		if (cleaned.equals("")) return "0";
		return cleaned;
	}
	
	public static String padMonospaced(String input, int minLength) {
		String padding = "";
		for (int i = 0; i < (minLength - input.length()); i++) {
			padding += " ";
		}
		return input + padding;
	}
	
	public static String padMonospacedCenter(String input, int width) {
		String padding = "";
		for (int i = 0; i < (width - input.length()) / 2; i++) {
			padding += " ";
		}
		return padding + input + padding;
	}
	
	public static String repeatLength(String input, int length) {
		String output = "";
		for (int i = 0; i < length; i++) {
			output += input;
		}
		return output;
	}
	
	public static String trimSetting(String text) {
		String[] split = text.split(":");
		String retString = "";
		
		for (int i = 1; i < split.length; i++) {
			if (i != 1) {
				retString += ":";
			}
			retString += split[i];
		}
		return retString;
	}
	
	public static String formatHex(String original, int length) {
		
		String newString = "";
		
		for (int i = original.length(); i < length; i++) {
			newString += "0";
		}
		
		return newString + original;
	}
	
	public static String formatHexReversed(String original, int length) {
		
		String newString = original;
		
		for (int i = original.length(); i < length; i++) {
			newString += "0";
		}
		
		return newString;
	}
	
	public static boolean validateIP(String ip) {
		if (ip == null) return false;
		if (!ip.contains(":")) return false;
		String[] split = ip.split(":");
		if (split.length < 2) return false;
		if (!split[0].contains(".")) return false;
		try {	
			Integer.parseInt(split[1]);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static String parseIPFromPLS(ArrayList<String> data) {
		for (String s : data) {
			if (s.startsWith("File")) {
				return s.substring(13, s.length());
			}
		}
		return "invalid";
	}
}
