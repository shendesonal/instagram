package Testpack;









import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepack.BaseClass;
import pomclass.FriendRequest;
import pomclass.Homepage2;
import pomclass.LogInPage;

 

	
		
		
	public class FacebookTestClass extends BaseClass {
		private WebDriver Driver;
		private LogInPage login;
		private Homepage2 home;
		private FriendRequest request;
		//@beforetest
		
		@BeforeClass
		    public void pomobject()  //objects
		
		{
		
		login= new LogInPage(Driver);
		 home = new Homepage2(Driver);
		  request = new FriendRequest(Driver);
	}
		  
		 @BeforeMethod 
			 public void BeforeMethod() throws InterruptedException 
			 {
			 Driver.get("https://www.facebook.com");
			 
		login.senduserName();
		Thread.sleep(3000);
		
		login.sendpassword();
		Thread.sleep(3000);
		
		login.clickloginbutton();
		Thread.sleep(3000);
		//login.clickonNewAccount();
		
		
		home.clickonHome();
		Thread.sleep(3000);
		
		home.clickonnotification();
		Thread.sleep(3000);
		
		home.clickonmassenger();
		Thread.sleep(3000);
		
		home.clickonfrinds();
		Thread.sleep(3000);
		}
		
		@Test
		public void sendrequest() throws InterruptedException {
		
		request.searchonclick();
		Thread.sleep(3000);
		
		request.searchinName();
		Thread.sleep(3000);
		
		request.clickOnAddFriend();
		Thread.sleep(3000);
	}
		//@Aftermethod
		//public void logout() 
		{
			
			
		}
	
		@AfterClass
		public void aftreclass() {
			
			login = null;
			home= null;
			request = null;  
			//@Aftertest
			Driver.close();
			Driver = null ;
			System.gc();//gc garbage collector
		}
		

}
