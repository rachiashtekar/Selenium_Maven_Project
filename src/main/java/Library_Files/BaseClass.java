package Library_Files;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseClass {
 public	WebDriver driver;
	
	public void initializeBrowser() throws EncryptedDocumentException, IOException
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		driver.get(UtilityClass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
}
