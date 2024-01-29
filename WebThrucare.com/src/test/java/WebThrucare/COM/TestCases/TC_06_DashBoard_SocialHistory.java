package WebThrucare.COM.TestCases;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class TC_06_DashBoard_SocialHistory 
{
    
	public void SocialHistory() throws Exception
	{
		Scenarios.LoginDone_with_validCredentials("DashBoard_SocialHistory");
		Thread.sleep(5000);
		GenericMethods.Click_viewProfile(Xpaths.or_ViewProfile);
		Thread.sleep(5000);
		
		
		
	}
	
}
