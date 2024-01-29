package WebThrucare.COM.BusinessLogic;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HelperMethods
{
      
public static WebDriverWait wait;
	
	
/*===================================== Dynamic file Name setup============================================================*/	

public static String generateDynamicFileName(String Name1) {
    // Implement your logic to generate a dynamic file name
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String timestamp = dateFormat.format(new Date());
    
    return  Name1;
}





/*===================================== wait =============================== ==========================================*/	
	



    public static void Implicit_wait(int A)
    {
    	Methods.driver.manage().timeouts().implicitlyWait(A, TimeUnit.SECONDS);
    }
	
    
    public static void Explicit_wait(int i)
    {
         wait=new WebDriverWait(Methods.driver,Duration.ofSeconds(i));
    }
    
    
    
    
    
  //  an alert is present and assign it to an Alert object
    public static void exp_AlertIsPresent(int i)
    {
    	HelperMethods.Explicit_wait(i);
    	Alert alert=wait.until(ExpectedConditions.alertIsPresent()); 
    }
    
    
    
    
    //wait until the Element is selected
    
    public static void exp_wt_ElementSelectionStateToBe(int i,WebElement element)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.elementSelectionStateToBe(element, true)); 
    }
   
    
    
    
   // wait until the button is clickable and reassign it to the same variable
    
    public static void exp_wt_ElementToBeClickable(int i,WebElement button)
    {
    	HelperMethods.Explicit_wait(i);
    	button = wait.until(ExpectedConditions.elementToBeClickable(button));
    }

    
    
    
    // wait until the option is selected
    public static void exp_wt_elementToBeSelected(int i,WebElement option)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.elementToBeSelected(option)); 
    }
    
    
    
 // wait until the frame is available and switch to it
    public static void expt_wt_frameToBeAvailableAndSwitchToIt(int i,WebElement frame)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame)); 

    }
    
    
    
 // wait until the element with xpath  does not contain the text "Please wait..."
    public static void Expt_wt_invisibilityOfTheElementLocated(int i,String xpath,String text)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(xpath),text)); 
    }
    
    
 // wait until all the elements with xpath are present and assign them to a list
    public static void Expt_wt_presenceOfAllElementsLocatedBy(int i,String xpath)
    {
    	HelperMethods.Explicit_wait(i);
    	List<WebElement> links = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))); 
    }
    
 // wait until the element  is present
    public static void Expt_wt_presenceOfElementLocated(int i,String xpath)
    {
    	HelperMethods.Explicit_wait(i);
    	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))); 
    }
    
    
 // wait until the button is visible 
	
    public static void Expt_wt_visibilityOf(int i,WebElement button)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.visibilityOf(button)); 
    }
    
    
 // wait until the title of the web page contains "Google"
    public static void Expt_wt_titleContains(int i,String title)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.titleContains(title)); 
    }
    
 // wait until the title of the web page is "Google"
    public static void Expt_wt_titleIs(int i,String title)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.titleIs(title)); 
    }
    
    
 // wait until the input element has a value attribute that contains the text "Hello"
    public static void Expt_wt_textToBePresentInElementValue(int i,WebElement e,String text)
    {
    	HelperMethods.Explicit_wait(i);
    	wait.until(ExpectedConditions.textToBePresentInElementValue(e, text)); 
    }
    
    
    
    
    
    
  /*=======================   Exception Hnadling =============================================*/
  
	
    
    
    
    public static void handleException(WebDriver driver, Exception e) 
	{
        if (e instanceof NoSuchElementException) {
        	  System.out.println("Element not found: " + e.getMessage());
        	 
        } else if (e instanceof TimeoutException) {
        	 System.out.println("Timeout occurred: " + e.getMessage());
        } 
        	 else if(e instanceof StaleElementReferenceException ) {
        		 System.out.println(" Element Not found : " + e.getMessage());
        	 }  else {
        	System.out.println("Unhandled Exception Occurred: " + e.getMessage());
        	 
        }
         
    }
    
    
	
}
