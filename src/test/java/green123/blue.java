package green123;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class blue {
@Test

public void add()
{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
}
}

