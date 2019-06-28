package com.mkyong.hashing;

import java.util.ResourceBundle;

public class ResBundle {

	private ResBundle() {
    		throw new IllegalStateException("Resource Bundle class");
  	}

	public static String getBundle(String key) {
		ResourceBundle rs = ResourceBundle.getBundle("global");
		return rs.getString(key);
	}
}
