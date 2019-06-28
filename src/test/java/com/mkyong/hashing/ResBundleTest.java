package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ResBundleTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ResBundleTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ResBundleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testResBundle()
    {
        assertTrue( true );
    }

	public void testgetBundle()
	{
		ResBundle ov = new ResBundle();
		String result = ov.getBundle("msg1");
		String expected = "Hello World America";
		assertEquals(result,expected);
	}

}
