package com.mkyong.hashing;

import org.apache.log4j.Logger;

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
