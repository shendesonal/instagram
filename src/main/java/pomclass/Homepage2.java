package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
	//private variables (webelement)
    @FindBy (xpath = "//a[@aria-current='page']")
    private WebElement Home ;
    
    @FindBy (xpath = "//div[@aria-label=\"Messenger\"][1]")
    private WebElement massenger;
    
    @FindBy (xpath = "//*[@id=\"mount_9_0_Ku\"]/div/div[1]/div/div[2]/div[4]/div[1]/div[1]/span/span/div/a")
    private WebElement notification ;
    
    @FindBy (xpath = "//a[@aria-label=\"Friends\"]")
    private WebElement friends ;
    
    //public constructor (to initialize webelement)
    public Homepage2(WebDriver driver) {
    PageFactory.initElements(driver, this); //object of current class
    }
 //public methods(action of webelement)
    public void clickonHome() {
   Home.click();;
    }
    public void clickonfrinds() {
    	   friends.click();
    	   }
    
    public void clickonmassenger() {
    	massenger.click();	
    }
    public void clickonnotification() {
    	notification.click();
    }
    
    //complete functionality
    public void logtiAplication () {
    	Home.click();	
    	massenger .click();
        notification.click();
        friends.click();
    
    }

}
