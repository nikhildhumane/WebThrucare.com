package WebThrucare.COM.TestCases;

import org.testng.annotations.Test;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.ReadProperties;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class Tc_03_Dashboard_PersonalDetails 
{

	@Test
	public void personalDetails() throws Exception
	{
		Scenarios.LoginDone_with_validCredentials("DashBoard-personalDetails");
		Thread.sleep(5000);
		GenericMethods.Click_viewProfile(Xpaths.or_ViewProfile);
		Thread.sleep(5000);
		GenericMethods.Click_PersonalDetails(Xpaths.or_tabs, Xpaths.or_perosnalDetails, ReadProperties.data("personalDetails"));
		Thread.sleep(5000);
		GenericMethods.Select_BloodGroup(Xpaths.or_BloodGroup, "A+");
		Thread.sleep(5000);
		
		//facing issue to select a adress after sending the name of address
     	GenericMethods.Enter_Address(Xpaths.or_adressField, ReadProperties.data("adress"), Xpaths.or_adressOption);
		Thread.sleep(5000);
		
		
		
	}
	
}
