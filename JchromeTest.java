package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.excel_arr;
import libraries.utilities;
import libraries.wait_type;
import pom.login_pom;
import pom.reg_pom;



public class JchromeTest extends excel_arr{
 
WebDriver dr;
	
	login_pom l;
	reg_pom r;
	utilities u;
	wait_type w;
	
	String url="https://jpetstore.cfapps.io/login";
	
	@BeforeMethod
	public void launch_chr()
	{
		u=new utilities(dr);
		dr=u.launch_browser("CHROME", url);
		//u.update_log("completed reading from excel");
		u.update_log("chrome browser launched");
		
	}
	
	
	
  @Test(dataProvider="login")
  public void test(String uid,String pwd,String a) {
	  w=new wait_type(dr);
	  u=new utilities(dr);
	  
//	  r=new regi_pom(dr);
//	  r.do_reg("kriz", "abc123456", "abc123456","kriz","jr","kiki@gmail.com","256637882","ded","newhd","deed","232","usa","English","DOGS");
	  
	  l=new login_pom(dr);
	  l.do_login(uid,pwd);	  
	  String act_msg=l.get_name();

	  u.screensh();
	  u.update_log("login successful with " + uid +" and " +pwd);
	  Assert.assertTrue(act_msg.contains(a));
  }
  
  @DataProvider(name="login")
	public String[][] prov_data(){
	  
	  get_test_data();
		return testdata;
	}
  
  @AfterMethod
  public void am()
  {
	  dr.close();
  }
  
}
