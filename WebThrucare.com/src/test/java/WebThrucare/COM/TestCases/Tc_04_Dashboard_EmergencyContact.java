package WebThrucare.COM.TestCases;

import org.testng.annotations.Test;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.ReadProperties;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class Tc_04_Dashboard_EmergencyContact 
{
	@Test
       public void EmergencyContact() throws Exception
       {
		Scenarios.LoginDone_with_validCredentials("Dashboard_EmergencyContact ");
		Thread.sleep(5000);
		GenericMethods.Click_viewProfile(Xpaths.or_ViewProfile);
		Thread.sleep(5000);
		GenericMethods.Click_EmergencyContact(Xpaths.or_tabs, Xpaths.or_EmergencyContact, ReadProperties.data("EmergencyContact"));
		Thread.sleep(5000);
		GenericMethods.Enter_EmergencyFirstName(Xpaths.or_EmergencyFirstName, "Emergency_FirstName");
		Thread.sleep(5000);
		GenericMethods.Enter_EmergencyLastName(Xpaths.or_EmergencyLastName, "Emergency_LastName");
		Thread.sleep(5000);
		GenericMethods.Enter_EmergencyEmail(Xpaths.or_EmergencyEmail, "Emergency_Email");
		Thread.sleep(5000);
		GenericMethods.Select_phoneCountry(Xpaths.or_country_EmergencyContact, "India");
		Thread.sleep(5000);
		GenericMethods.Enter_phoneNumber(Xpaths.or_EmergencyPhoneNumber, "Emergency_mobileNumber");
		Thread.sleep(5000);
		GenericMethods.Select_EmergencyRelation(Xpaths.or_Emergency_SelectRelation, "Brother");
		Thread.sleep(5000);
		GenericMethods.Click_SaveButton(Xpaths.or_saveButton);
		
		
       }
}
