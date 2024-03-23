package nucot.testpages.com;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driverfactory.com.InitialSetUp;
import nucot.pages.com.LoginPage;

public class BaseTest {
	
	
	 InitialSetUp isp;
	 WebDriver odriver;
	 protected Properties oprop;
	 
	 protected LoginPage ologinPage;
	 
	@BeforeTest
	public void setUp(){
		isp=new  InitialSetUp();
		oprop=isp.initProp();
		odriver=isp.initDriver(oprop);
		ologinPage=new LoginPage(odriver);	
	}
	
	
	@AfterTest
	public void closeApp()
	{
		odriver.quit();
		
	}
	
	

}
