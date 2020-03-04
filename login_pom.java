package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.wait_type;



public class login_pom {

	
	WebDriver dr;
	wait_type wt;
	//dr.By.xpath("//li[@class='success']");
	
	//By uid=By.xpath("//form[@action='/login']/p[2]/input[1]");
	//By pwd=By.xpath("//form[@action='/login']/p[2]/input[2]");
	//By btn=By.xpath("//form[@action='/login']/input[2]");
	By getname=By.xpath("//form[@action='/login']/input[2]");
	
	public login_pom(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void set_uid(String un1)
	{
		//WebElement we_eid=wt.waitForElement(uid, 20);
//		we_eid.sendKeys(un1);
		dr.findElement(By.xpath("//form[@action='/login']/p[2]/input[1]")).sendKeys(un1);
		
		
	}
	
	public void set_pwd(String pass)
	{
//		WebElement  we_pwd=wt.waitForElement(pwd, 20);
//		we_pwd.sendKeys(pass);
		dr.findElement(By.xpath("//form[@action='/login']/p[2]/input[2]")).sendKeys(pass);
	}
	
	public void cli_btn()
	{
//		WebElement we_sub=wt.elementToBeClickable(getname, 20);
//		we_sub.click();
		dr.findElement(By.xpath("//form[@action='/login']/input[2]")).click();
	}
	
	public void do_login(String u1, String p)
	{
		this.set_uid(u1);
		this.set_pwd(p);
		this.cli_btn();
	}
	
	public String get_title()
	{
		return dr.getTitle();
	}
	
	public String get_name()
	{
		String name=dr.findElement(By.xpath("//div[@id='WelcomeContent']/div")).getText();
		return name;
		
	}
}
