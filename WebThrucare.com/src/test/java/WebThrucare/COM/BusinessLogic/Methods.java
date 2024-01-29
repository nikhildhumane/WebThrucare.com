package WebThrucare.COM.BusinessLogic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Methods 
{

	public static WebDriver driver;
	public static Faker faker = new Faker();
	public static String fakeUsername;
	public static String verificationCode;
	public static Select select ;
	public static String Fname=faker.name().firstName();
	public static 	int randomNumber1;
	
/*========================================= Browser ===============================================================*/		
	
	
	
	
	
	
	 public static void setupBrowser(String Browsername)
	 	{

	 		//launch browser
	 		switch(Browsername.toLowerCase())
	 		{
	 		   case "chrome":
	 			WebDriverManager.chromedriver().setup();
	 			driver = new ChromeDriver();
	 			Assert.assertTrue(true);
	 			break;

	 		case "msedge":
	 			WebDriverManager.edgedriver().setup();
	 			driver = new EdgeDriver();
	 			Assert.assertTrue(true);
	 			break;

	 		case "firefox":
	 			WebDriverManager.firefoxdriver().setup();
	 			driver = new FirefoxDriver();  
	 			Assert.assertTrue(true);
	 			break;
	 			
	 		default:
	 			driver = null;
	 			break;

	 		}
	 	
	 	}
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void QuiteBrowser()
	 {
		 driver.quit();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void ClosedBrowser()
		{
			driver.close();
		}
		
		
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	 
	 
/*=============================================Open Application=========================================================*/
	 
	 
	 
	 
	 
	 
        public static void openURL(String URL)
        {
        	
        	if(URL!=null)
        	{
        		driver.get(URL);
        		Assert.assertTrue(true);
        		driver.manage().window().maximize();
        	}
        	
        }
        
        
        
        
        
        
        
        
  /*=============================================Switch Window=========================================================*/        
        
        
        
          public static void switchwindow()
        {
        	((ChromeDriver) driver).executeScript("window.open()");
            String secondTab = driver.getWindowHandles().toArray()[1].toString();
            driver.switchTo().window(secondTab);
            Assert.assertTrue(true);
        }
        
          
          
          
          
        
        public static void switchBack()
        {
        	String firstTab = driver.getWindowHandles().toArray()[0].toString();
            driver.switchTo().window(firstTab);
        }
        
        
        
        
        
        
        
        
/*==========================================Verified Opration ================================================================*/
   	        
        
        
        
        
        
	 
	 public static void Check_Text(String xpath,String Exptitle)
	 {
		 if(xpath!=null)
		 {
			 HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
			 WebElement e=driver.findElement(By.xpath(xpath));
			
			 String actual=e.getText();
			
			 if(actual!=null)
			 {
				 if(Exptitle!=null)
				 {
					 Assert.assertEquals(actual, Exptitle);
				 }
				 else
				 {
					 Assert.assertFalse(true);
				 }
			 }
			 else
			 {
				 Assert.assertFalse(true);
			 }
			 
		 }
		 
		 
	 }
	 
	 
	 
	 
	 
	 public static void verifiedpersonalDetails(String xpath,String xpath1,String exptitle,String xpath2)
		{
			
			List<WebElement> tabs=driver.findElements(By.xpath(xpath));
			
			for(WebElement tab:tabs)
			{
				String tabing=tab.getText();
				
				if(tabing.equals(exptitle))
				{
				//	tab.click();
					break;
				}
				else
				{
					Click_Button(xpath2);
				}
			}
			
			
			
		}
		


	 
	 
	 
	 
	 
	 
	 
	 
	 
/*===============================================Click Operation =========================================================*/	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 public static void Click_Button(String xpath)
	 {
		 if(xpath!=null)
		 {
			 HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
			 WebElement e=driver.findElement(By.xpath(xpath));
			 HelperMethods.exp_wt_ElementToBeClickable(10, e);
			 e.click();
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.assertFalse(true);
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
/*=============================================Send Opration============================================================*/	 
	 
	 
	 
	 
	 	 
	 public static void send_text(String xpath,String value)
	 {
		 
		 if(xpath!=null)
		 { 
			 HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
			driver.findElement(By.xpath(xpath)).sendKeys(value);
			
			Assert.assertTrue(true);
			
		 }
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void send_text_yopmail(String xpath,String value)
	 {
		 
		 if(xpath!=null)
		 { 
			 HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
			 String value2 = value.substring(0, value.indexOf("@"));
			driver.findElement(By.xpath(xpath)).sendKeys(value2);
			
			Assert.assertTrue(true);
			
		 }
	}
	 
	 
	 
	 
	 
	 public static void send_text_WithFaker(String xpath,String key,String value)
	 {
		 
		 if(xpath!=null)
		 { 
			HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
			driver.findElement(By.xpath(xpath)).sendKeys(value);
			ReadProperties.SaveValueToPropertyFile(key, value);
			Assert.assertTrue(true);
			
		 }
	}
	 
	 
	 
	 
	 
	 
	 public static void send_text_Click(String xpath,String value)
	 {
		 
		 if(xpath!=null)
		 { 
			 
			WebElement e=driver.findElement(By.xpath(xpath));
			e.click();
			e.sendKeys(value);
			Assert.assertTrue(true);
			
		 }
	}

	 
	 
	 
	 
	 public static void send_text_And_Select(String xpath,String value,String xpath1)
	 {
		 
		 if(xpath!=null)
		 { 
			 
			driver.findElement(By.xpath(xpath)).sendKeys(value);
			driver.findElement(By.xpath(xpath1)).click();
			Assert.assertTrue(true);
			
		 }
	} 
	 
	 
	 
	 
	
	 
	 
 
	 
	 
	 


	 
	 
	 
	
	 
	 

	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
/*========================================== Get Code from Yopmail=========================================================*/		 
	 
	 
	 
	 
	 public static void Getcode()
	 {
		
		
            driver.switchTo().frame("ifinbox");
		    List<WebElement> yopmailElements = driver.findElements(By.xpath(Xpaths.or_YopmailList));
		    int size=yopmailElements.size();
		   
            
		    for (int i = 0; i <= size; i++) 
		    {
		        WebElement yopmailElement = yopmailElements.get(i);
		        String yopmailAddress = yopmailElement.getText();
		        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		        
		        // Check for the specific email name
		        if (yopmailAddress.contains("no-reply@verificationemail.com")) {
		            yopmailElement.click(); 
		            
		            driver.switchTo().defaultContent();
		            
		            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		            driver.switchTo().frame("ifmail");
                     
		            WebElement emailContentElement = driver.findElement(By.xpath(Xpaths.or_emailContent));
		            String emailContent = emailContentElement.getText();

		            
		           
		           
		            verificationCode = emailContent.replaceAll("[^\\d]", "");
		          
		            
		            ReadProperties.SaveValueToPropertyFile("verificationCode", verificationCode);

		            break;
		        }
		    }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
/*==============================================Drop down Option=========================================================*/	
		
	 
	 
	 
	 
	public static void select_dropdownOption(String xpath,String value)
	{
		if(xpath!=null)
		{
	    HelperMethods.Expt_wt_presenceOfElementLocated(10, xpath);
		WebElement genderDropdown = driver.findElement(By.xpath(xpath));
		select = new Select(genderDropdown);
		 select.selectByVisibleText(value);
		 Assert.assertTrue(true);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*==============================================Switch Operation ========================================================*/		
		
	
	
	
	
	
	public static void BloodGroup(String xpath,String Actiontype)
	{
		WebElement genderDropdown = driver.findElement(By.xpath(xpath));
		select = new Select(genderDropdown);

		switch(Actiontype)
		{
		case "A-":
			 select.selectByVisibleText("Blood group A negative");
			 break;
			 
		case "A+":
			 select.selectByVisibleText("Blood group A positive");
			 break;	 
			 
		case "B-":
			 select.selectByVisibleText("Blood group B negative");
			 break;
			 
		case "B+":
			 select.selectByVisibleText("Blood group B positive");
			 break;	 	 
		
			 
		case "AB-":
			 select.selectByVisibleText("Blood group AB negative");
			 break;
			 
		case "AB+":
			 select.selectByVisibleText("Blood group AB positive");
			 break;	 
			 
		case "O-":
			 select.selectByVisibleText("Blood group O negative");
			 break;
			 
		case "O+":
			 select.selectByVisibleText("Blood group O positive");
			 break;	 	 
		
		case "O_Bombay":
			 select.selectByVisibleText("Blood group O Bombay");
			 break;	
			 
			  
	 	   default:
			throw new IllegalArgumentException("Unsupported action type: " +Actiontype);	 
			 
		}
       
		
	}
	
		    
	
	
	
	
		    

	
	
	public static String FirstName_FakerClassLogic() throws Exception
	{
		String FirstName=ReadProperties.data("Patient_UserName");
		 String result = FirstName.replaceAll("\\d", "");
	     return result;
	}
	 
	
	
	
	
	
	public static String LastName_FakerClassLogic() throws Exception
	{
		String Lname=faker.name().lastName();
 		Assert.assertTrue(true);
 		return Lname;
	}
	
	
	
	
	
	public static String FirstNameWithNumber_FakerClassLogic() throws Exception
	{
		randomNumber1 = faker.number().numberBetween(1, 100); 
		return Fname+randomNumber1;
	}
	
	
	public static String Email_FakerclassLogic() throws Exception
	{
		 	 String domain="@yopmail.com";
		 	 Assert.assertTrue(true);
		 	  return ReadProperties.data("Patient_UserName")+domain ;
	}
	
	
	
	
	public static String Select_DOB()
	{
		    Date randomDOB = faker.date().birthday(42, 100);
	    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        String Dob = sdf.format(randomDOB);
	    	return Dob;
		
	}
	
	 public static String FakerClassLogic(String Actiontype) throws Exception
	 {
		 Fname=faker.name().firstName();
		 randomNumber1 = faker.number().numberBetween(1, 100); 
		//launch browser
	 		switch(Actiontype.toLowerCase())
	 		{
	 		
	 		    case "firstname":
	 			 Assert.assertTrue(true);
	 			return Fname;
	 	    	
	 	      case "firstnamenumber":
	 	    	 Assert.assertTrue(true);
	 			 return Fname+randomNumber1;
	 	        
	 	        
	 	       case "middlename":
			 	String mname=faker.name().nameWithMiddle();
			    Assert.assertTrue(true);
			 	return mname;
	 	        
	 	    	
	 	    	
	 	    	
	 	        case "lastname":
		 	    String Lname=faker.name().lastName();
		 		Assert.assertTrue(true);
		 		return Lname;
		 	   
	 	    	
	 	    	
	 	    	
	 	    	
	 	       case "lastnamenumber":
		 	   String lastname=faker.name().lastName();
		 	   Assert.assertTrue(true);
		 	   int randomNumber2 = faker.number().numberBetween(1, 100); 
		 	   return lastname + randomNumber2;
		 	   
		 	   
		 	   
	 	      case "cityname":
			 	   String cname=faker.address().cityName();
			 	   Assert.assertTrue(true);
			 	   return cname ;
			 	   
		 	   
	 	     case "statename":
			 	   String Sname=faker.address().state();
			 	   Assert.assertTrue(true);
			 	   return Sname ;
			 	   
			 	   
			 
	 	    case "password":
			 	   String pname=faker.name().firstName();
			 	   pname = Character.toUpperCase(pname.charAt(0)) + pname.substring(1);
			 	  int randomNumber3 = faker.number().numberBetween(1, 100); 
			 	  String symbol="$";
			 	   Assert.assertTrue(true);
			 	  return pname+randomNumber3+symbol ;	   
			 	   
			 	   
	 	     case "email":
	 	    String emailName=ReadProperties.data("Patient_UserName");
	 	    System.out.println("emailname="+emailName);
	 	     emailName = Character.toUpperCase(Fname.charAt(0)) + Fname.substring(1);
		 	 String domain="@yopmail.com";
		 	 Assert.assertTrue(true);
		 	  return emailName+domain ;
		 	  
	 	  
			 	  
		 	  
		 	  
		 	  
	 	    case "number":
	 	    	 String number=faker.phoneNumber().subscriberNumber(10);
	 	    	
	 	    	 return number;
	 	    	
		 	  
		 	  
	 	     case "dob":
	 	    	 Date dob1=faker.date().birthday();
	 	    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 	        String Dob = sdf.format(dob1);
	 	    	return Dob;
			 	   
			 	   
		 	   
		 	   default:
	 			throw new IllegalArgumentException("Unsupported action type: " +Actiontype);

	 		}
	 	
		 
	 }
	 
	 
	 
	 
		    
		    
		    
		 
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
