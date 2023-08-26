package TNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {

	@Test(invocationCount = 2)
	public void lion()
	{
		Reporter.log("Hello",true);

	}

}
