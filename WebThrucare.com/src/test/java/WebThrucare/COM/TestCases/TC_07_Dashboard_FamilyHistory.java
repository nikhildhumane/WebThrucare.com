package WebThrucare.COM.TestCases;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class TC_07_Dashboard_FamilyHistory
{
	public void FamilyHistory() throws Exception
	{
		Scenarios.LoginDone_with_validCredentials("Dashboard_FamilyHistory");
		Thread.sleep(5000);
		GenericMethods.Click_viewProfile(Xpaths.or_ViewProfile);
		Thread.sleep(5000);
		
		
		
	}
	

}
