package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScriptchrome {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\RadSoftware\\Selenium IDE Software\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
    driver.get("https://www.seleniumhq.org");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li/a[@title='Technical refrence and guides']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li/a[@title='Selenium Projects']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("q")).sendKeys("selenium");
    Thread.sleep(2000);
   
	}
}
