package com.mkyong.hashing;

import org.apache.log4j.Logger;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
	   logger.info("Hello World");
	   Locale lo=Locale.getDefault();
	   final String msg1="msg1";
	   logger.info(lo);
	   logger.info(ResBundle.getBundle(msg1)); 
    }

    public String checkEvenOdd(int n){
		if(n%2==0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
}
