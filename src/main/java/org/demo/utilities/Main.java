package org.demo.utilities;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

private static final Logger LOG =LoggerFactory.getLogger(Main.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyHelper.loadProperties("Dateformat.properties");
		System.out.println(PropertyHelper.getProperty("abc")); 
		LOG.info("In logger"); 
	}

}
