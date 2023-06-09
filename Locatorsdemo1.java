package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo1 {

	public static void main(String[] args) {


		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);


		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("tester");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input.button[type='submit'")).click();

		driver.findElement(By.xpath("//a[@id=\"ctl00_logout\"]")).click();
		driver.quit();

	}

}
