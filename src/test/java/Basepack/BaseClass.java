package Basepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver openbrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	//ChromeOptions options = new ChromeOptions();
	WebDriver driver= new ChromeDriver();
   // options.addArguments("--disable-notification");
    //driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//driver.get("https://www.facebook.com");
	return driver;

}
}