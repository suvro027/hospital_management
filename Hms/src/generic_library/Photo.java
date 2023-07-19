package generic_library;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Photo 
{
	public static void capture(WebDriver driver) throws Exception
	{
		Date d=new Date();
		String s = d.toString();
		String res = s.replace(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File per=new File("./photo/"+res+".png");
		FileHandler.copy(temp, per);
		
	}

}
