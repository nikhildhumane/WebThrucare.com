package WebThrucare.COM.TestCases;

import org.testng.annotations.Test;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.Methods;
import WebThrucare.COM.BusinessLogic.ReadProperties;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class TC_05_Dashboard_Insurance
{
	@Test
     public void Insurance() throws Exception
     {
		Scenarios.LoginDone_with_validCredentials("Dashboard_Insurance");
		Thread.sleep(5000);
		GenericMethods.Click_viewProfile(Xpaths.or_ViewProfile);
		Thread.sleep(5000);
		GenericMethods.Click_InsuranceTab(Xpaths.or_tabs, Xpaths.or_Insurance, ReadProperties.data("insurance"));
		Thread.sleep(5000);
		GenericMethods.Select_Player(Xpaths.or_Insurance_Player, "Aetna");
		Thread.sleep(5000);
		GenericMethods.Select_Player(Xpaths.or_Insurance_product, "PPO");
		Thread.sleep(5000);
		GenericMethods.UploadImage(Xpaths.or_Insurance_Upload, "C:\\Users\\ADMIN\\OneDrive\\Pictures\\ball bearing.jfif");
		Thread.sleep(5000);
		GenericMethods.ImageName(Xpaths.or_insurance_uploadName, Methods.FakerClassLogic("firstname"));
		Thread.sleep(5000);
		GenericMethods.Click_SaveButton(Xpaths.or_saveButton);
		
		
     }
}
