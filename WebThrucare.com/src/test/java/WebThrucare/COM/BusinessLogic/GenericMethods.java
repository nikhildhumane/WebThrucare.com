package WebThrucare.COM.BusinessLogic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericMethods 
{
	public static Logger log;
	
/*========================================= Browser ===============================================================*/	
   
	
	
	
	public static void OpenBrowser(String browsername,String Name1)
	{
	  try {
		 System.setProperty("logFilename", HelperMethods.generateDynamicFileName(Name1));
		 log= LogManager.getLogger("Thrucare");
         GenericMethods.log.info("=============="+HelperMethods.generateDynamicFileName(Name1)+"===========================================");
		 Methods.setupBrowser(browsername.toLowerCase());
		 log.info("open Browser= "+browsername);
	  }catch(Exception e)
	  {
		  HelperMethods.handleException(Methods.driver, e);
		  log.error("Exception Error " +new Exception ("Browser open method:" +e));
	  }
	  
	}
	
	
	
	public static void ClosedBrowser()
	{
		Methods.ClosedBrowser();
		GenericMethods.log.info("===========================================================================================");
	}
	
	
	
	
	
	
	
	
	public static void QuitBrowser()
	{
		Methods.QuiteBrowser();
		GenericMethods.log.info("===========================================================================================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*================================= = open Application ======================================================================*/
	
	
	
	
	
	
	
	
	
	
	public static void OpenUrl(String url) throws Exception
	{
	try {
		Methods.openURL(url);
		log.info("Open Url= "+url);
		
		Methods.Check_Text(Xpaths.or_signIn_r_signUp, ReadProperties.data("signIn_or_SignUp"));
		log.info("Verify Text ="+ReadProperties.data("signIn_or_SignUp"));
	}catch(Exception e)
	  {
		  HelperMethods.handleException(Methods.driver, e);
		  log.error("Exception Error " +new Exception ("Open URL Method:" +e));
	  }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*=====================================Home page =====================================================================*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Click_SignIn_OR_SignUp(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click Button =Sign In / Sign Up");
		Methods.Check_Text(Xpaths.or_Patient_Text, ReadProperties.data("patient_text"));
		log.info("Verify Text ="+ReadProperties.data("patient_text"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Sign Up / sign In method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*======================================Module Select====================================================================*/	

	
	
	
	
	
	
	
	public static void Click_Select(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click Select Button :");
		Methods.Check_Text(Xpaths.or_user_text, ReadProperties.data("user_Text"));
		log.info("Verify Text ="+ReadProperties.data("user_Text"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click Select method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
/*============================================Login & signup============================================================*/	
	
	
	
	
	
	public static void InputUsername(String xpath,String key)
	{
		try
		{
		      Methods.send_text_WithFaker(xpath,key, Methods.FirstNameWithNumber_FakerClassLogic());
		      log.info("Input Patient UserName : "+Methods.FirstNameWithNumber_FakerClassLogic());
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Input UserName method :" +e));
		  }
	}
	
	
	
	
	
	
	
	public static void Username(String xpath,String value)
	{
		try {
		Methods.send_text(xpath, value);
		 log.info("UserName : "+value);
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("UserName method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	public static void InputEmail(String xpath,String key)
	{
		try {
		;
		Methods.send_text_WithFaker(xpath,key,  Methods.Email_FakerclassLogic());
		 log.info("Input Patient UserEmail : "+ Methods.Email_FakerclassLogic());
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Input UserEmail method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Send_NewPassword(String xpath,String value)
	{
		try {
			 Methods.send_text(xpath, value);
			 log.info("Input New UserPassword : "+value);
			}catch(Exception e)
			  {
				  HelperMethods.handleException(Methods.driver, e);
				  log.error("Exception Error " +new Exception ("Input new UserPassword method :" +e));
			  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Send_ConfirmPassword(String xpath,String value)
	{
		try {
			 Methods.send_text(xpath, value);
			 log.info("Input confirm UserPassword : "+value);
			 Methods.Check_Text(Xpaths.or_user_text, ReadProperties.data("user_Text"));
				log.info("Verify Text ="+ReadProperties.data("user_Text"));
			}catch(Exception e)
			  {
				  HelperMethods.handleException(Methods.driver, e);
				  log.error("Exception Error " +new Exception ("Input confirm UserPassword method :" +e));
			  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Click_Change_PasswordButton(String xpath)
	{
		try {
			Methods.Click_Button(xpath);
			log.info("Click SignIn Button :");
		   Methods.Check_Text(Xpaths.or_profileStatus, ReadProperties.data("profilestatus"));
		   log.info("Verify Text ="+ReadProperties.data("profilestatus"));
		   }catch(Exception e)
			  {
				  HelperMethods.handleException(Methods.driver, e);
				  log.error("Exception Error " +new Exception ("Cilck Sign In method :" +e));
			  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Password(String xpath,String value)
	{
		try {
		 Methods.send_text(xpath, value);
		 log.info("Input patient UserPassword : "+value);
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Input UserPassword method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Click_signIn(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click SignIn Button :");
	   Methods.Check_Text(Xpaths.or_profileStatus, ReadProperties.data("profilestatus"));
	   log.info("Verify Text ="+ReadProperties.data("profilestatus"));
	   }catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Cilck Sign In method :" +e));
		  }
	}	
	
	
	
	
	
	
	
	
	public static void Click_SignUp_Link(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click Sign Up Link :");
		Methods.Check_Text(Xpaths.or_user_Text2, ReadProperties.data("user_text2"));
		log.info("Verify Text ="+ReadProperties.data("user_text2"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click Sign Up Link Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void Click_signUpButton(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click Sign Up Button :");
		Methods.Check_Text(Xpaths.or_verificationCOde_text, ReadProperties.data("codeVerificationText"));
		log.info("Verify Text ="+ReadProperties.data("codeVerificationText"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click Sign Up Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Click_Forgot_Your_password_Link(String xpath)
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click Forgot password Link :");
		Methods.Check_Text(Xpaths.or_Header_Forgot_Your_Password, ReadProperties.data("Header_Forgot_Your_Password"));
		log.info("Verify Text ="+ReadProperties.data("Header_Forgot_Your_Password"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click Forgot your password Method:" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	public static void Send_UserName(String xpath,String value)
	{
		try {
			Methods.send_text(xpath,value);
			log.info("Send UserName :" +value);
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Send_UserName Method:" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void click_Reset_my_Password_Button(String xpath)
	{
		try {
			Methods.Click_Button(xpath);
			log.info("Click Reset My Password Button :");
			
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("click_Reset_my_Password_Button Method:" +e));
		  }
	}

		
	
	
	
		
		
	
	
	
	
	
	
/*===========================================code verification==================================================*/		

	
	
	public static void Click_Send_A_New_Code(String xpath)
	{
		try {
		Methods.Click_Button(xpath);
		log.info("Click send a new code Link :");
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Send a New Code Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	public static void Code_verification(String xpath,String xpath2) throws Exception
	{
		try {
		Methods.switchwindow();
		log.info("Switch to Second window :");
		Methods.openURL(ReadProperties.data("yopmailUrl"));
		log.info("Open Yopmail URL ="+ReadProperties.data("yopmailUrl"));
		Methods.send_text_yopmail(Xpaths.or_YopmailInput, ReadProperties.data("Patient_Email"));
		log.info("Enter User Yopmail  ="+ReadProperties.data("Patient_Email"));
		Methods.Click_Button(Xpaths.or_YopmailLoginButton);
		Methods.Click_Button(Xpaths.or_RefreshIcon);
		
		Methods.Getcode();
		log.info("copy code ");
		Methods.switchBack();
		log.info("switch to First window");
		Methods.send_text(xpath, Methods.verificationCode);
		log.info("Enter verification code ");
		Methods.Click_Button(xpath2);
		log.info("click Confirm account Button ");
		Methods.Check_Text(Xpaths.or_Welcome_Text_Registration, ReadProperties.data("welcomeText"));
		log.info("Verify Text ="+ReadProperties.data("welcomeText"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Yopmail code Verification method :" +e));
		  }
		
	}
	
	
	
	
	public static void code_Verification_ForgotPassword(String xpath) throws Exception
	{
		Methods.switchwindow();
		log.info("Switch to Second window :");
		Methods.openURL(ReadProperties.data("yopmailUrl"));
		log.info("Open Yopmail URL ="+ReadProperties.data("yopmailUrl"));
		Methods.send_text_yopmail(Xpaths.or_YopmailInput, ReadProperties.data("EmailInput"));
		log.info("Enter User Yopmail  ="+ReadProperties.data("EmailInput"));
		Methods.Click_Button(Xpaths.or_YopmailLoginButton);
		Methods.Click_Button(Xpaths.or_RefreshIcon);
		
		Methods.Getcode();
		log.info("copy code ");
		Methods.switchBack();
		log.info("switch to First window");
		Methods.send_text(xpath, Methods.verificationCode);
		log.info("Enter verification code ");
	}
	
	
	
/*===========================================Registration =============================================================*/	
	
	
	
	
	
	public static void Enter_FirstName(String xpath,String key)
	{ 
		try
		{
		      Methods.send_text_WithFaker(xpath,key, Methods.FirstName_FakerClassLogic());
		      log.info("Input Patient UserName : "+Methods.FirstName_FakerClassLogic());
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Patient FirstName method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	public static void Enter_MiddleName(String xpath,String key) throws Exception
	{
		Methods.send_text_WithFaker(xpath, key, Methods.FakerClassLogic("middlename"));
	}
	
	
	
	
	
	
	
	
	public static void Enter_LastName(String xpath,String key)
	{
		try {
			
		Methods.send_text_WithFaker(xpath, key, Methods.LastName_FakerClassLogic());
		log.info("Patient Last Name="+Methods.LastName_FakerClassLogic());
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Enter Last name Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	public static void Select_Gender(String xpath,String value)
	{
		try {
		Methods.select_dropdownOption(xpath, value);
		log.info("Select patient Gender="+value);
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Select Gender Method :" +e));
		  }
	}
	
	
	
	
	
	
	public static void Enter_DOB(String xpath,String key)
	{
		try {
		Methods.send_text_WithFaker(xpath,key, Methods.Select_DOB());
		log.info("Enter patient DOB ="+Methods.Select_DOB());
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Enter DOB Method :" +e));
		  }
	}
	
	
	
	
	
	public static void Select_phoneCountry(String xpath,String value)
	{
		try {
		Methods.select_dropdownOption(xpath, value);
		log.info("Enter patient Phone Country ="+value);
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Select Phone Country Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	public static void Enter_phoneNumber(String xpath,String key)
	{
		try {
		Methods.send_text_WithFaker(xpath, key, Methods.FakerClassLogic("number"));
		log.info("Enter patient Phone Number ="+Methods.FakerClassLogic("number"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Enter Phone Number Method :" +e));
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Click_SignUpButton_Registration(String xpath) 
	{
		try {
		   Methods.Click_Button(xpath);
		   log.info("Click Sign Up Button" );
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click Sign Up Button :" +e));
		  }
	}
	
	
	
	
	
	
	
/*===========================================Dashboard ===============================================================*/		

	
	
	
	public static void Click_viewProfile(String xpath) throws Exception
	{
		try {
		Methods.Click_Button(xpath);
		  log.info("Click_viewProfile Link" );
	//	Methods.Check_Text(Xpaths.or_Introduction, ReadProperties.data("Introduction"));
		}catch(Exception e)
		  {
			  HelperMethods.handleException(Methods.driver, e);
			  log.error("Exception Error " +new Exception ("Click_viewProfile method :" +e));
		  }
	}
	
	
	
	
	
	public static void Click_NextButton(String xpath)
	{
		Methods.Click_Button(xpath);
		
	}
	
/*==================personal Details =====================*/	
	
	
	
	
	public static void Click_PersonalDetails(String xpath,String xpath1,String exptitle) throws Exception
	{
		Methods.verifiedpersonalDetails(xpath,xpath1,exptitle, Xpaths.or_NextButton );
		Methods.Check_Text(Xpaths.or_Header_personalDetails, ReadProperties.data("Header_PersonalDetails"));
	}
	
	
	
	
	
	
	public static void Select_BloodGroup(String xpath,String ActionType)
	{
		Methods.BloodGroup(xpath, ActionType);
	}
	
	
	
	
	
	
	
	
	
	
	public static void Enter_Address(String xpath,String value,String xpath1)
	{
		Methods.send_text_And_Select(xpath, value, xpath1);
	}
	
	
	
	
	
	
	
	
/*==================Emergency Contact =====================*/		
	
	
	
	
	public static void Click_EmergencyContact(String xpath,String xpath1,String exptitle) throws Exception
	{
		Methods.verifiedpersonalDetails(xpath,xpath1,exptitle, Xpaths.or_NextButton );
		Methods.Check_Text(Xpaths.or_Header_EmergencyContact, ReadProperties.data("Header_Insurance"));
	}
	
	
	
	
	public static void Enter_EmergencyFirstName(String xpath,String key) throws Exception
	{
		Methods.send_text_WithFaker(xpath, key, Methods.FakerClassLogic("firstname"));
	}
	
	
	public static void Enter_EmergencyLastName(String xpath,String key) throws Exception
	{
		Methods.send_text_WithFaker(xpath, key, Methods.FakerClassLogic("lastname"));
	}
	
	public static void Enter_EmergencyEmail(String xpath,String key) throws Exception
	{
		Methods.send_text_WithFaker(xpath, key, Methods.FakerClassLogic("email"));
	}
	
	
	
	public static void Select_EmergencyRelation(String xpath,String value)
	{
		Methods.select_dropdownOption(xpath, value);
	}
	
	public static void Click_SaveButton(String xpath) throws Exception
	{
		Methods.Click_Button(xpath);
		Methods.Check_Text(Xpaths.or_EmergencyTostify, ReadProperties.data("EmergencyTostify"));
		
	}
	
	
	/*==================Insurance =====================*/	
	
	
	public static void Click_InsuranceTab(String xpath,String xpath1,String exptitle) throws Exception
	{
		Methods.verifiedpersonalDetails(xpath,xpath1,exptitle, Xpaths.or_NextButton );
		Methods.Check_Text(Xpaths.or_Header_Insurance, ReadProperties.data("Header_EmergencyContact"));
	}
	
	
	public static void Select_Player(String xpath,String value)
	{
		Methods.select_dropdownOption(xpath, value);
	}
	
	
	
	
	public static void UploadImage(String xpath,String value)
	{
		Methods.send_text_Click(xpath, value);
	}
	
	public static void ImageName(String xpath,String value)
	{
		Methods.send_text_Click(xpath, value);
	}

	

	
/*====================social History =======================*/
	
	public static void Click_SocialHistory(String xpath,String xpath1,String exptitle) throws Exception
	{
		Methods.verifiedpersonalDetails(xpath,xpath1,exptitle, Xpaths.or_NextButton );
		Methods.Check_Text(Xpaths.or_Header_Insurance, ReadProperties.data("Header_EmergencyContact"));
	}
	
	
	
	
	
	
	
	
}
