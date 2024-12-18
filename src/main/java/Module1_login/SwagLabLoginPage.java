package Module1_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SwagLabLoginPage {
	@FindBy(xpath="//input[@id='user-name']") private	WebElement UN;

	 @FindBy(xpath="//input[@id='password']")private	WebElement PWD;

	 @FindBy(xpath="//input[@type='submit']")private	WebElement loginBtn;
    @FindBy(xpath="//div[@class='error-message-container error']")  private WebElement errorMsg;
	 
	 public SwagLabLoginPage(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}

	 public void inpSwagLabLoginpageUsername(String username)
	 {
		 UN.sendKeys(username);
	 }
	 
	 public void inpSwagLabLoginPassword(String password) {
		 PWD.sendKeys(password);
		
	}
	 public void SwagLabloginBtn() {
		 loginBtn.click();
		
	}
	 public void SwagLabLoginPageErrorPageMsg(String expErrorMsg) {
		 String actErrorMsg=errorMsg.getText();
		 
		 if(actErrorMsg.contains(expErrorMsg))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
	 }
	 
	 
}



