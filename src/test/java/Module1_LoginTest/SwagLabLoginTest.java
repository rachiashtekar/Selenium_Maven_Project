package Module1_LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import Module1_login.SwagLabHomePage;
import Module1_login.SwagLabLoginPage;
import Module1_login.SwagLabOpenMenuPage;

public class SwagLabLoginTest extends BaseClass {
	int a; //declare globally
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();
		
		login=new SwagLabLoginPage(driver);  
		home=new SwagLabHomePage(driver);
		menu=new SwagLabOpenMenuPage(driver);
	}


	@BeforeMethod
    public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println(a);
		login.inpSwagLabLoginpageUsername(UtilityClass.getPFData("UN"));
		login.inpSwagLabLoginPassword(UtilityClass.getPFData("PWD"));
		login.SwagLabloginBtn();
		Thread.sleep(2000);

		
	}
	@Test
	public void verifyLogo() throws EncryptedDocumentException, IOException{
		TCID=101;
		String actLogoText=home.getSwagLabHomePageLogoText();
//		String expLogoText=UtilityClass.getTD(0, 2);
		String expLogoText=UtilityClass.getPFData("logo");
		Assert.assertEquals(actLogoText, expLogoText,"Failed: - both results are diff: ");
		
	}
	@AfterMethod
	public void LogoutFromApp (ITestResult S1) throws InterruptedException, IOException
	{
		if(S1.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.CaptureSS(driver,TCID);
		}
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		menu.clickOnLogout();
		Thread.sleep(5000);

		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

}

//In Java, every variable must have a data type. The variables login, home, and menu do have a data type — but it’s not a primitive type like int or String. Instead, the data types here are custom classes: SwagLabLoginPage, SwagLabHomePage, and SwagLabOpenMenuPage.


//Here, the variables login, home, and menu are declared with their respective data types:
//
//SwagLabLoginPage: This is the data type for the variable login.
//SwagLabHomePage: This is the data type for the variable home.
//SwagLabOpenMenuPage: This is the data type for the variable menu.
//These data types are classes, defined somewhere in your project (likely under the Module1_login package).
