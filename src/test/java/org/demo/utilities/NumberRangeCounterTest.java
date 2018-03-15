package org.demo.utilities;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NumberRangeCounterTest {
	  private static final int LOWER_BOUND = 1000;
	  private static final int RANGE = 1000;
	  private static final int ZERO_RANGE = 0;
	  private NumberRangeCounter counter
	    = new NumberRangeCounter( LOWER_BOUND, RANGE );
	  
	  private CounterStorage storage;
	   	@Before
	  	public void setUp() {
	  	  storage = new CounterStorageDouble();
	  	  counter = new NumberRangeCounter( storage, LOWER_BOUND, RANGE );
	  	}
	  @Test
	  public void subsequentNumber() {
	    int first = counter.next();
	    int second = counter.next();
	    assertEquals( first, second );
	  }
	  @Test
	  public void lowerBound() {
	    int actual = counter.next();
	    assertEquals( ZERO_RANGE, actual );
	  }
	}