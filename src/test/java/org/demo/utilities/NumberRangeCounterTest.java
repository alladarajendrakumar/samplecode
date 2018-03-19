package org.demo.utilities;

import org.testng.Assert; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.AfterClass; 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberRangeCounterTest {
	  private static final int LOWER_BOUND = 1000;
	  private static final int RANGE = 1000;
	  private static final int ZERO_RANGE = 0;
	  private NumberRangeCounter counter
	    = new NumberRangeCounter( LOWER_BOUND, RANGE );
	  
	  private CounterStorage storage;
	   	@BeforeTest
	  	public void setUp() {
	  	  storage = new CounterStorageDouble();
	  	  counter = new NumberRangeCounter( storage, LOWER_BOUND, RANGE );
	  	}
	  @Test
	  public void subsequentNumber() {
	    int first = counter.next();
	    int second = counter.next();
	    Assert.assertEquals( first, second );
	  }
	  @Test
	  public void lowerBound() {
	    int actual = counter.next();
	    Assert.assertEquals( ZERO_RANGE, actual );
	  }
	}