package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialandLinkTestDemo {

	public static void main(String[] args) throws InterruptedException {


		String baseUrl= "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.findElement(By.className("txt")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input.button[value='Login']")).click();
		
		driver.findElement(By.partialLinkText("View")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("View all products")).click();
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		
	}

}
