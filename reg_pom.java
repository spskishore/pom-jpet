package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import libraries.wait_type;



public class reg_pom {

	

	wait_type wt;
	
	
	By uid=By.xpath("//form[@action='/accounts/create']/table/tbody/tr[1]/td/input");
	By pwd=By.xpath("//form[@action='/accounts/create']/table/tbody/tr[2]/td/input");
	By r_pwd=By.xpath("//form[@action='/accounts/create']/table/tbody/tr[3]/td/input");
	
	By fn=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[1]/td/input");
	By ln=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[2]/td/input");
	By email=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[3]/td/input");
	By ph_no=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[4]/td/input");
	By address=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[5]/td/input");
	By city=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[7]/td/input");
	By state=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[8]/td/input");
	By zip=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[9]/td/input");
	By country=By.xpath("//form[@action='/accounts/create']/div/table/tbody/tr[10]/td/input");
	
	By LP=By.xpath("//form[@action='/accounts/create']/div/table[2]/tbody/tr[1]/td[2]/select");
	By fc=By.xpath("//form[@action='/accounts/create']/div/table[2]/tbody/tr[2]/td[2]/select");
	By eml=By.xpath("//form[@action='/accounts/create']/div/table[2]/tbody/tr[3]/td[2]/input[1]");
	By emb=By.xpath("//form[@action='/accounts/create']/div/table[2]/tbody/tr[4]/td[2]/input[1]");
	
	By submit=By.xpath("//input[@id='save']");
	
	static WebDriver dr;
	
	public reg_pom(WebDriver dr)
	{
		this.dr=dr;
		wt= new wait_type(dr);
	}
	
	public void set_uid(String un)
	{
		
		WebElement we_eid=wt.waitForElement(uid, 20);
		we_eid.sendKeys(un);
	}
	
	public void set_pwd(String pass)
	{
		WebElement  we_pwd=wt.waitForElement(pwd, 20);
		we_pwd.sendKeys(pass);
	}
	
	public void rep_pwd(String rpass)
	{
		WebElement we_rp=wt.waitForElement(r_pwd, 20);
		we_rp.sendKeys(rpass);
	}
	
	public void fn(String fname) 
	{
		WebElement we_fn=wt.waitForElement(fn, 20);
		we_fn.sendKeys(fname);
	}
	
	public void ln(String lname) 
	{
		WebElement we_ln=wt.waitForElement(ln, 20);
		we_ln.sendKeys(lname);
	}
	
	public void email(String e) 
	{
		WebElement we_em=wt.waitForElement(email, 20);
		we_em.sendKeys(e);
	}
	
	public void ph(String ph) 
	{
		WebElement we_ph=wt.waitForElement(ph_no, 20);
		we_ph.sendKeys(ph);
	}
	
	public void address(String a) 
	{
		WebElement we_a=wt.waitForElement(address, 20);
		we_a.sendKeys(a);
	}
	
	public void city(String c) 
	{
		WebElement we_ct=wt.waitForElement(city, 20);
		we_ct.sendKeys(c);
	}
	
	public void state(String st) 
	{
		WebElement we_st=wt.waitForElement(state, 20);
		we_st.sendKeys(st);
	}
	
	public void zip(String z) 
	{
		WebElement we_zip=wt.waitForElement(zip, 20);
		we_zip.sendKeys(z);
	}
	
	public void country(String ctry) 
	{
		WebElement we_co=wt.waitForElement(country, 20);
		we_co.sendKeys(ctry);
	}
	
	public void LP(String lp) 
	{
		WebElement we_lp=wt.waitForElement(LP, 20);
		Select sel=new Select((WebElement) we_lp);
		sel.selectByVisibleText(lp);
		
	}
	
	public void fc(String f) 
	{
		WebElement we_fc=wt.waitForElement(fc, 20);
		Select sel=new Select((WebElement) we_fc);
		sel.selectByVisibleText(f);
	}
	
	public void eml()
	{
		WebElement we_eml=wt.elementToBeClickable(eml, 20);
		we_eml.click();
	}
	
	public void emb()
	{
		WebElement we_emb=wt.elementToBeClickable(emb, 20);
		we_emb.click();
	}
	
	public void submit()
	{
		WebElement we_sub=wt.elementToBeClickable(submit, 20);
		we_sub.click();
	}
	
	public String get_title()
	{
		return dr.getTitle();
	}
	

	public void do_reg(String u,String np,String rp,String fn,String ln,String em,String p,String ad,String ci,String sa,String zp,String cy,String lp1,String fc1 )
	{
		this.set_uid(u);
		this.set_pwd(np);
		this.rep_pwd(rp);
		this.fn(fn);
		this.ln(ln);
		this.email(em);
		this.ph(p);
		this.address(ad);
		this.city(ci);
		this.state(sa);
		this.zip(zp);
		this.country(cy);
		this.LP(lp1);
		this.fc(fc1);
		this.eml();
		this.emb();
		this.submit();
		
	}
	
	
}
