package libraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilities {
 
	Logger log;
	
 WebDriver dr;
	 
	 public utilities(WebDriver dr)
	 {
		 this.dr=dr;
		 log=Logger.getLogger("devpinoyLogger");
	 }
	 
	 public void update_log(String msg)
	 {
		 log.debug(msg);
	 }
	
	public static WebDriver launch_browser(String browser, String url)
	{
		WebDriver dr=null;
		switch(browser)
		{
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","chromedriver_v79.exe");
		    dr=new ChromeDriver();
		    break;
		    
		case "FIREFOX":
			System.setProperty("webdriver.geckop.driver","geckodriver.exe");
		    dr=new FirefoxDriver();
			break;
			
		default:
			System.out.println("Supported browser options : chrome & firefox");
		    break;
		}
		dr.get(url);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		return dr;
		
	}
	
	static int counter=1;
	
	public void screensh() {
		String path="C:\\softwares\\screenshots\\";
		String filename=counter +".png";
		
		File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		File f2= new File(path+filename);
		
		try
		{
			FileUtils.copyFileToDirectory(f1, f2);
		}
		catch(IOException e)
		{
			this.update_log("IOException ocuured while taking screenshot");
			System.out.println("Screenshot" +counter +"failed");
			e.printStackTrace();
		}
		counter++;
	}
	
	
}
