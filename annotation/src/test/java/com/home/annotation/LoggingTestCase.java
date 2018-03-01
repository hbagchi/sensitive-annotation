package com.home.annotation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.home.model.Customer;

public class LoggingTestCase {

	private static final Logger logger = LogManager.getLogger(LoggingTestCase.class);
	
	@Test
	public void testLog4j2Logging() {
		
		Customer cust = new Customer();
		cust.setUserid("john");
		cust.setName("John Doe");
		cust.setSsn("761-234-0965");
		
		logger.info(cust.toString());
	}

}
