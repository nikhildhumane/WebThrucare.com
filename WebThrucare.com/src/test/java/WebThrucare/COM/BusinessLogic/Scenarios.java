package WebThrucare.COM.BusinessLogic;

import WebThrucare.COM.TestCases.Tc_01_Patient_RegistrationDone;
import WebThrucare.COM.TestCases.Tc_02_Patient_LoginDone;

public class Scenarios 
{

	public static void RegistrationDone_Valid_Credentials() throws Exception
	{
		
		GenericMethods.OpenBrowser("chrome","RegistrationDone_Valid_Credentials");
		GenericMethods.OpenUrl(ReadProperties.data("URL"));
		Thread.sleep(5000);
		GenericMethods.Click_SignIn_OR_SignUp(Xpaths.or_signIn_r_signUp);
		Thread.sleep(5000);
		GenericMethods.Click_Select(Xpaths.or_SelectButton_InPatient);
		Thread.sleep(5000);
		GenericMethods.Click_SignUp_Link(Xpaths.or_signUp_Link);
		Thread.sleep(5000);
		GenericMethods.InputUsername(Xpaths.or_NewUsername,"Patient_UserName");
		Thread.sleep(5000);
		GenericMethods.InputEmail(Xpaths.or_NewEmail, "Patient_Email");
		Thread.sleep(5000);
		GenericMethods.Password(Xpaths.or_NewPassword, ReadProperties.data("patient_NewPassword"));
		Thread.sleep(5000);
     	GenericMethods.Click_signUpButton(Xpaths.or_signUp);
		Thread.sleep(5000);
		GenericMethods.Code_verification(Xpaths.or_verificationCode_Field,Xpaths.or_confirmAccount_Button);
		Thread.sleep(5000);
		GenericMethods.Enter_FirstName(Xpaths.or_PatientFirstName, "Patient_firstname");
		Thread.sleep(5000);
		GenericMethods.Enter_LastName(Xpaths.or_patientLastName, "Patient_Lastname");
		Thread.sleep(5000);
		GenericMethods.Select_Gender(Xpaths.or_patientGender, "Male");
		Thread.sleep(5000);
		GenericMethods.Enter_DOB(Xpaths.or_patientDOB,"DOB");
		Thread.sleep(5000);
		GenericMethods.Select_phoneCountry(Xpaths.or_phoneNumberCountry, "India");
		Thread.sleep(5000);
		GenericMethods.Enter_phoneNumber(Xpaths.or_phoneNumber, "mobileNumber");
		Thread.sleep(5000);
		GenericMethods.Click_SignUpButton_Registration(Xpaths.or_SignUpbutton);
		Thread.sleep(5000);
		GenericMethods.ClosedBrowser();
		
	}
	
	
	
	
	public void RegiStrationDone_ResendOtp() throws Exception
	{
		GenericMethods.OpenBrowser("chrome","RegiStrationDone_ResendOtp");
		GenericMethods.OpenUrl(ReadProperties.data("URL"));
		Thread.sleep(5000);
		GenericMethods.Click_SignIn_OR_SignUp(Xpaths.or_signIn_r_signUp);
		Thread.sleep(5000);
		GenericMethods.Click_Select(Xpaths.or_SelectButton_InPatient);
		Thread.sleep(5000);
		GenericMethods.Click_SignUp_Link(Xpaths.or_signUp_Link);
		Thread.sleep(5000);
		GenericMethods.InputUsername(Xpaths.or_NewUsername,"Patient_UserName");
		Thread.sleep(5000);
    	GenericMethods.InputEmail(Xpaths.or_NewEmail, "Patient_Email");
 		Thread.sleep(5000);
    	GenericMethods.Password(Xpaths.or_NewPassword, ReadProperties.data("patient_NewPassword"));
    	Thread.sleep(5000);
		GenericMethods.Click_signUpButton(Xpaths.or_signUp);
    	Thread.sleep(5000);
    	GenericMethods.Click_Send_A_New_Code(Xpaths.or_Send_A_New_code_Link);
    	Thread.sleep(5000);
		GenericMethods.Code_verification(Xpaths.or_verificationCode_Field,Xpaths.or_confirmAccount_Button);
		Thread.sleep(5000);
		GenericMethods.Enter_FirstName(Xpaths.or_PatientFirstName, "Patient_firstname");
		Thread.sleep(5000);
		GenericMethods.Enter_LastName(Xpaths.or_patientLastName, "Patient_Lastname");
    	Thread.sleep(5000);
		GenericMethods.Select_Gender(Xpaths.or_patientGender, "Male");
	    Thread.sleep(5000);
	    GenericMethods.Enter_DOB(Xpaths.or_patientDOB,"DOB");
		Thread.sleep(5000);
		GenericMethods.Select_phoneCountry(Xpaths.or_phoneNumberCountry, "India");
		Thread.sleep(5000);
		GenericMethods.Enter_phoneNumber(Xpaths.or_phoneNumber, "mobileNumber");
		Thread.sleep(5000);
		GenericMethods.Click_SignUpButton_Registration(Xpaths.or_SignUpbutton);
		Thread.sleep(5000);
		GenericMethods.ClosedBrowser();
	    
		
		
		
		
	}
	
	
	
	
	public static void LoginDone_with_validCredentials(String filename) throws Exception
	{
		GenericMethods.OpenBrowser("chrome",filename);
		GenericMethods.OpenUrl(ReadProperties.data("URL"));
		Thread.sleep(5000);
		GenericMethods.Click_SignIn_OR_SignUp(Xpaths.or_signIn_r_signUp);
		Thread.sleep(5000);
		GenericMethods.Click_Select(Xpaths.or_SelectButton_InPatient);
		Thread.sleep(5000);
		GenericMethods.Username(Xpaths.or_username, ReadProperties.data("Patient_UserName"));
		Thread.sleep(5000);
		GenericMethods.Password(Xpaths.or_password, ReadProperties.data("patient_NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Click_signIn(Xpaths.or_SignIn);
		
		
	}
	
	
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
		GenericMethods.Send_UserName(Xpaths.or_Username_InForgotPasswordPage, ReadProperties.data("username"));
		Thread.sleep(5000);
		GenericMethods.click_Reset_my_Password_Button(Xpaths.or_Reset_Your_Password);
		Thread.sleep(5000);
		GenericMethods.code_Verification_ForgotPassword(Xpaths.or_Forgot_password_code);
		Thread.sleep(5000);
		GenericMethods.Send_NewPassword(Xpaths.or_New_Password, ReadProperties.data("NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Send_ConfirmPassword(Xpaths.Or_Confirm_Password, ReadProperties.data("NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Username(Xpaths.or_username, ReadProperties.data("username"));
		Thread.sleep(5000);
		GenericMethods.Password(Xpaths.or_password, ReadProperties.data("NewPassword"));
		Thread.sleep(5000);
		GenericMethods.Click_signIn(Xpaths.or_SignIn);
		
		
		
	}
	
	
}
