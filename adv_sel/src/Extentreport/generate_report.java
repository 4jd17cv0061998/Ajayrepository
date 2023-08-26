package Extentreport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class generate_report {
	
	@Test
	public void runy()
	{
		//object creation
		ExtentReports rpt = new ExtentReports("./Target/extentreport.html");
		ExtentTest startTest = rpt.startTest("test1");
		//log the status
		startTest.log(LogStatus.PASS,"pass");
		startTest.log(LogStatus.FAIL,"fail");
		startTest.log(LogStatus.SKIP,"skip");
		//stop the execution
		rpt.endTest(startTest);
		
		//flush the status in to report
		rpt.flush();
		
	}

}
