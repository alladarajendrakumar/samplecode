package org.demo.utilities;

import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;

public class TestXMLCase extends XMLTestCase {

	@Test
	public void testForXMLEquality() throws Exception {
	      String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
	      String myTestXML = "<msg><localId>2376</localId></msg>";
	      assertXMLNotEqual("Comparing test xml to control xml", myControlXML, myTestXML);
	   }

}
