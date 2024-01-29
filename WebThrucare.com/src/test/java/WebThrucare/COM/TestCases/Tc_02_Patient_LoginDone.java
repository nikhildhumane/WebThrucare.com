package WebThrucare.COM.TestCases;

import org.testng.annotations.Test;

import WebThrucare.COM.BusinessLogic.GenericMethods;
import WebThrucare.COM.BusinessLogic.ReadProperties;
import WebThrucare.COM.BusinessLogic.Scenarios;
import WebThrucare.COM.BusinessLogic.Xpaths;

public class Tc_02_Patient_LoginDone 
{
	@Test
	public void patientLogin_Forgot_your_password() throws Exception
	{
		GenericMethods.OpenBrowser("chrome","patientLogin_Forgot_your_password");
		GenericMethods.OpenUrl(ReadProperties.data("URL"));
		Thread.sleep(5000);
		GenericMethods.Click_SignIn_OR_SignUp(Xpaths.or_signIn_r_signUp);
		Thread.sleep(5000);
		GenericMethods.Click_Select(Xpaths.or_SelectButton_InPatient);
		Thread.sleep(5000);
		GenericMethods.Click_Forgot_Your_password_Link(Xpaths.or_Forgot_Your_Password_Link);
		Thread.sleep(5000);
		GenericMethods.Send_UserName(Xpaths.or_Username_InForgotPasswordPage, ReadProperties.data("Patient_UserName"));
		Thread.sleep(5000);
		GenericMethods.click_Reset_my_Password_Button(Xpaths.or_Reset_Your_Password);
		Thread.sleep(5000);
		GenericMethods.code_Verification_ForgotPassword(Xpaths.or_Forgot_password_code);
		Thread.sleep(5000);
		GenericMethods.Send_NewPassword(Xpaths.or_New_Password, ReadProperties.data("patient_NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Send_ConfirmPassword(Xpaths.Or_Confirm_Password, ReadProperties.data("patient_NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Username(Xpaths.or_username, ReadProperties.data("Patient_UserName"));
		Thread.sleep(5000);
		GenericMethods.Password(Xpaths.or_password, ReadProperties.data("patient_NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Click_signIn(Xpaths.or_SignIn);
		
		
		
	}
	
	
	
	
	
	
	

}
