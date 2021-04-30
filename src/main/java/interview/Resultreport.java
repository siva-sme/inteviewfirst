package interview;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Resultreport {
	
	static ExtentReports extent;
	
	public static ExtentReports extentResult() {
		
		Date d = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMdd-hhmmss");

		String timeStamp = dateFormat.format(d);
		
		
		String path = System.getProperty("user.dir")+"\\reports\\interview-"+timeStamp+".html";
		
		ExtentSparkReporter reporter =  new ExtentSparkReporter (path);
		
		reporter.config().setReportName("Extent TestNG Reports");
		
		reporter.config().setDocumentTitle("Reults");
		
		 extent= new  ExtentReports();
		 
		 extent.attachReporter(reporter);
		 
		 extent.setSystemInfo("Tester", "Siva");
		
		return extent;
		
	}

}
