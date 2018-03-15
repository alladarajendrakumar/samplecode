package org.demo.utilities;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGenericComparator.class, TestHexAsciiConversion.class,
		TestLogger.class, TestXMLCase.class })
public class AllTests {

}
