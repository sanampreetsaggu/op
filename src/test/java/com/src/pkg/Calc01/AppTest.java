package com.src.pkg.Calc01;

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

    public void testAddTwoPositiveIntegers() {
		int expected = 11;
		int actual = new App().add(4, 7);
		assertEquals(expected, actual);
	}


	public void testAddTwoNegativeIntegers() {
		int expected = -11;
		int actual = new App().add(-4, -7);
		assertEquals(expected, actual);
	}

	
	public void testAddNegativeIntegerToPositiveInteger() {
		int expected = -3;
		int actual = new App().add(4, -7);
		assertEquals(expected, actual);
	}
}
