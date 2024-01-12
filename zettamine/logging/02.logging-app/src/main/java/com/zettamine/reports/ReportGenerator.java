package com.zettamine.reports;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ReportGenerator {
	private static final Logger LOGGER = LogManager.getLogger(ReportGenerator.class);
	
	public static void main(String[] args) {
		generateReport();
	}

	private static void generateReport() {
		LOGGER.debug("DEBUG Message");		
		LOGGER.info("INFO Message");
		LOGGER.warn("Warning Message");
		LOGGER.error("ERROR Message");
		LOGGER.fatal("FATAL Message");
		LOGGER.trace("TRACE Message");
	}
}
