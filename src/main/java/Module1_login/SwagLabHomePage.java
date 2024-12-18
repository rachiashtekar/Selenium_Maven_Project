package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	//step1:declaration
@FindBy(xpath="//div[@class='app_logo']")	private  WebElement  logo;
@FindBy(xpath="//button[@id='react-burger-menu-btn']")	private  WebElement  openMenu;

//step2:initialization

public SwagLabHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//step3

//public void verifySwagLabHomePageLogo(String expLogoText) {
//	String actLogoText = logo.getText();
//	
//	if(actLogoText.equals(expLogoText))
//	{
//		System.out.println("Pass");
//	}
//	else
//	{
//		System.out.println("Fails");
//	}

public String getSwagLabHomePageLogoText() 
{
String LogoText = logo.getText();
return LogoText;
}

	
	

public void clickSwagLabHomePageOpenMenu() {
	openMenu.click();
	
}

}
