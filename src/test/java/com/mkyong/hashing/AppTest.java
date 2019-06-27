package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	public void testEvenOdd()
	{
		App ov = new App();
		String result = ov.checkEvenOdd(10);
		String expected = "Even";
		assertEquals(result,expected);
	}

	public void testEvenOdd1()
	{
		App ov = new App();
		String result = ov.checkEvenOdd(9);
		String expected = "Odd";
		assertEquals(result,expected);
	}

	public void testMain()
	{
		App ov = new App();
		ov.main(new String[] {"arg1", "arg2", "arg3"});
	}

}
