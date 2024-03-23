package nucot.testpages.com;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {
	
	
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String actualTitle=ologinPage.getCurrentTitleLoginPage();
		Assert.assertEquals(actualTitle,"");
	}
	
	@Test(priority=2)
	public void loginPageCurrentUrlTest(){
	String actualUrl=ologinPage.getCurrentUrlLoginPage();
	Assert.assertEquals(actualUrl,"");
	
	}
	
	@Test(priority=3)
	public void dologinPageTest(){	
		ologinPage.dologinPage(oprop.getProperty("username"),oprop.getProperty("password").trim());
		
		
			
	}
	

}
