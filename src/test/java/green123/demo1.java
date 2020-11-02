package green123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.homeboxstores.com/ae/en/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Dining']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Wall Decor']")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='jcf-select-opener']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Price - Low to High'])[1]")).click();
	}
}

	
