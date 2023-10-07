package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendRequest {
	@FindBy (xpath = "//*[@id=\"mount_0_0_/3\"]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div/label/input")
    private WebElement search ;
    
    @FindBy (xpath = "//input[@value='anuja limbulkar deshmukh']")
    private WebElement SearchName ;
    
   // @FindBy (xpath = "")
    //private WebElement FriendRequest  ;
    
    @FindBy (xpath = "//*[@id=\"mount_9_0_Ku\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/span/span")
    private WebElement AddFriend ;
    //public constructor (to initialize webelement)
    public FriendRequest(WebDriver driver) {
    PageFactory.initElements(driver, this); //object of current class
    }
 //public methods(action of webelement)
    public void searchonclick() {
    	search.click();
    }
    
    public void searchinName() {
    	SearchName.sendKeys("anuja limbulkar deshmukh");	
    }
    public void clickOnAddFriend() {
    	AddFriend.click();
    }
   // public void clickonNewAccount() {
    	//creatNewAccount.click();
    
    //complete functionality
    public void logtiAplication () {
    	search.click();
    	SearchName.sendKeys("anuja limbulkar deshmukh");
        AddFriend.click();
    //creatNewAccount.click();
    
    }

}
