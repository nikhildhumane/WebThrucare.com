package WebThrucare.COM.BusinessLogic;

public class Xpaths 
{
	
/*==================================================== Home page==============================================*/	
	
     public static String or_signIn_r_signUp="//a[normalize-space()='Sign-in/Sign-up']";
     
     
     
/*==================================================== Select module==============================================*/     
     
     
     public static String or_Patient_Text="//h5[normalize-space()='Patient']";
     public static String or_SelectButton_InPatient="//div/div/h5[normalize-space()='Patient']/parent::div/following-sibling::div/button";
     
     
     
     
 /*==================================================Login ====================================================*/
     
     public static String or_social_Text="//span[normalize-space()='Sign In with your social account'][2]";
     public static String or_user_text="(//span[normalize-space()='Sign in with your username and password'])[2]";
     public static String or_user_Text2="(//span[normalize-space()='Sign up with a new account'])[1]";
     public static String or_username="(//input[@id='signInFormUsername'])[2]";
     public static String or_NewUsername="(//input[@placeholder='Username'])[1]";
     public static String or_NewEmail="(//input[@placeholder='name@host.com'])[1]";
     public static String or_password="(//input[@id='signInFormPassword'])[2] ";
     public static String or_NewPassword="(//input[@placeholder='Password'])[1]";
     
     public static String or_Forgot_Your_Password_Link="(//a[normalize-space()='Forgot your password?'])[2]";
     
     public static String or_Header_Forgot_Your_Password="//span[contains(text(),'Enter your Username below and we will send a messa')]";
     public static String or_Username_InForgotPasswordPage="//input[@id='username']";
     public static String or_Reset_Your_Password="//button[normalize-space()='Reset my password']";
     public static String or_Forgot_password_code="//input[@id='forgot_password_code']";
     public static String or_New_Password="//input[@id='new_password']";
     public static String Or_Confirm_Password="//input[@id='confirm_password']";
     public static String or_change_Password_Button="//button[normalize-space()='Change Password']";
     public static String or_SignIn="(//input[@name='signInSubmitButton'])[2] ";
     public static String or_signUp="(//button[@name='signUpButton'][normalize-space()='Sign up'])[1]";
     public static String or_signUp_Link="(//a[contains(text(),'Sign up')])[2]";
     
     
     
 /*==================================================DashBoard ====================================================*/ 
     
     
     public static String or_patientName="//span[@class='username-text' and normalize-space()='nikhil patient51']";
     public static String or_profileStatus="//span[normalize-space()='Profile Status']";
     public static String or_ViewProfile="//span[normalize-space()='View Profile']";
    
     public static String or_tabs="//ul[@class='wizard-progressbar']//li";
     
     public static String or_Introduction="//li[@class='active current']";
     public static String or_perosnalDetails="//li[contains(text(),'Personal Details')]";
     public static String or_Header_personalDetails="//h6[normalize-space()='Enter your personal details below.']";
     public static String or_BloodGroup="//select[@name='txtBloodGroup']";
     public static String or_adressField="//input[@placeholder='Address Line 1']";
     public static String or_adressOption="(//div[@class='pac-item'])[1]";
     
     public static String or_EmergencyContact="//li[normalize-space()='Emergency Contact']";
     public static String or_Header_EmergencyContact="//h6[contains(text(),'Enter your emergency contact details using the form')]";
     public static String or_EmergencyFirstName="//input[@name='txtFName']";
     public static String or_EmergencyLastName="//input[@name='txtLName']";
     public static String or_EmergencyEmail="//input[@name='txtEmail']";
     public static String or_country_EmergencyContact="//select[@name='txtIsoCode']";
     public static String or_EmergencyPhoneNumber="//input[@placeholder='Eg. +12345678901']";
     public static String or_Emergency_SelectRelation="//select[@name='txtRelation']";
     public static String or_EmergencyTostify="(//div[normalize-space()='Emergency contact added successfully'])[5]";
     
     
     public static String or_Insurance="//li[normalize-space()='Insurance']";
     public static String or_Header_Insurance="//h6[contains(text(),'Add your insurance details along with a copy of yo')]";
     public static String or_Insurance_Player="//select[@name='txtType']";
     public static String or_Insurance_product="//select[@name='txtProduct']";
     public static String or_Insurance_Upload="//label[@class='btn btn-primary thru-btn-color form-label']";
     public static String or_insurance_uploadName="//input[@name='title']";
     
     
     
     public static String or_saveButton="//button[normalize-space()='Save']";
     public static String or_NextButton="//button[normalize-space()='Next']";
  
     
 /*==================================================Verification page  ====================================================*/     
     
     public static String or_verificationCOde_text="(//label[normalize-space()='Verification code'])[1]";
     public static String or_verificationCode_Field="//input[@id='verification_code']";
     public static String or_Send_A_New_code_Link="//button[normalize-space()='Send a new code']";
     public static String or_confirmAccount_Button="//button[normalize-space()='Confirm account']";
     
     
     
     
/*================================================Yopmail website====================================================*/    
     
     
     public static String or_YopmailInput="//input[@id='login']";   
     public static String or_YopmailLoginButton="//i[@class='material-icons-outlined f36']";
     public static String or_RefreshIcon="//button[@id='refresh']";
     public static String or_YopmailList="//div[@class='m']";
     public static String or_emailContent="//div[@id='mailctn']";
     
     
     
     
 /*============================================Registration page===================================================*/
     
     public static String or_Welcome_Text_Registration="//h1[normalize-space()='Welcome to ThruCare']";
     public static String or_PatientFirstName="//input[@id='formRegProFName']";
     public static String or_patientMiddleName="//input[@id='formRegProMName']";
     public static String or_patientLastName="//input[@id='formRegProLName']";
     public static String or_patientGender="//select[@id='formRegProGender']";
     public static String or_patientDOB="//div[@class='react-datepicker__input-container']//input[@type='text']";
     public static String or_phoneNumberCountry="//select[@name='txtIsoCode']";
     public static String or_phoneNumber="//input[@name='txtMobileNo']";
     public static String or_SignUpbutton="//button[normalize-space()='SignUp']";
     
     
     
     
     
     
     
     
}
