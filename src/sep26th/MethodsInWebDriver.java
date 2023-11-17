package sep26th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(String):void this method  will launch the app
		driver.get("https://adactinhotelapp.com/");
		
		//driver.findElement(By.xpath("//img[contains@src,'ios-button')]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		



	}

}
