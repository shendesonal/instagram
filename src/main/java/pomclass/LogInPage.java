package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//private variables (webelement)
	    @FindBy (xpath = "//input[@ id='email']")
	    private WebElement userName ;
	    
	    @FindBy (xpath = "//input[@ type='password']")
	    private WebElement password;
	    
	    @FindBy (xpath = "//button[@name='login']")
	    private WebElement loginButton ;
	    
	    @FindBy (xpath = "//a[text()='Create New Account']")
	    private WebElement creatNewAccount ;
	    //public constructor (to initialize webelement)
	    public LogInPage(WebDriver driver) {
	    PageFactory.initElements(driver, this); //object of current class
	    }
	 //public methods(action of webelement)
	    public void senduserName() {
	    userName.sendKeys("sonalshende3009@gmail.com");
	    }
	    
	    public void sendpassword() {
	    	password.sendKeys("774000");	
	    }
	    public void clickloginbutton() {
	    	loginButton.click();
	    }
	    public void clickonNewAccount() {
	    	creatNewAccount.click();
	    }
	    //complete functionality
	    public void logtiAplication () {
	    	userName.sendKeys("sonalshende3009@gmail.com");	
	        password.sendKeys("774000");
	        loginButton.click();
	    creatNewAccount.click();
	    
	    }
}
