package com.mkyong.hashing;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;

public class ResBundle {

	static Logger logger = Logger.getLogger(ResBundle.class);

	public static void main( String[] args ) {
	   	logger.info("Hello World");
    	}

	public static String getBundle(String key) {
		ResourceBundle rs = ResourceBundle.getBundle("global");
		return rs.getString(key);
	}
}
