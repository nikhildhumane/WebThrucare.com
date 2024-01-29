package WebThrucare.COM.BusinessLogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	public static Properties pro;
	
	public static String data(String parameterName) throws Exception
	{
		File src=new File("E:\\New folder (5)\\com.orangeHRM\\WebThrucare.com\\Properties_File\\Data.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
		String parameterValue=pro.getProperty(parameterName);
		return parameterValue;
		
		
	}
	
	
	public static void SaveValueToPropertyFile(String key, String value) 
	{
        pro.setProperty(key, value);
        try (FileOutputStream output = new FileOutputStream("E:\\New folder (5)\\com.orangeHRM\\WebThrucare.com\\Properties_File\\Data.properties")) 
        {
            pro.store(output, "Generate values");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	
	
	
}
