package sep25th;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\java_selenium\\softwares\\edgedriver_win64\\msedgedriver.exe");
	   // WebDriverManager.edgedriver().setup();
		new EdgeDriver();
	}
		
}
	
