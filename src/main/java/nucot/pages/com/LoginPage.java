package nucot.pages.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver odriver;
	//private ElementUtil eleUtil;
	
	
	//1.private By locators
	private By username=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By loginBtn=By.xpath("//button[@type='submit']");
	
	
	//2.page constants......
	public LoginPage(WebDriver odriver){
		this.odriver=odriver;
		//eleUtil=new ElementUtil(odriver);
		
	}
	

	//3.page actions/methods

	public String getCurrentUrlLoginPage(){
		String currUrl=odriver.getCurrentUrl();
		System.out.println("Loginpage url is "+currUrl);
		return currUrl;	
	}
	
	
	public String getCurrentTitleLoginPage(){
		String currTitle=odriver.getTitle();
		System.out.println("Loginpage url is "+currTitle);
		return currTitle;	
	}
	
	
	public void  dologinPage(String un,String pw){
	
//		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AppConstants.DEFAULT_MEDIUM_TIMEOUT));
//		eleUtil.doSendKeys(unername, un);
//		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AppConstants.DEFAULT_MEDIUM_TIMEOUT));
//		eleUtil.doSendKeys(password, pw);
//		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AppConstants.DEFAULT_MEDIUM_TIMEOUT));
//		eleUtil.doClick(loginBtn);
//		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AppConstants.DEFAULT_MEDIUM_TIMEOUT));
//		
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		odriver.findElement(username).sendKeys(un);;

		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		odriver.findElement(password).sendKeys(pw);
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		odriver.findElement(loginBtn).click();
			
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	

}
