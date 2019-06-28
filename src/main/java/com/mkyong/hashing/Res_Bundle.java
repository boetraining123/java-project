package com.mkyong.hashing;

import java.util.ResourceBundle;

public class Res_Bundle {
	public static String getBundle(String key) {
		ResourceBundle rs = ResourceBundle.getBundle("global");
		return rs.getString(key);
	}
}
