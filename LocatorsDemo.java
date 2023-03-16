package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {


		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

		driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input.button[type='submit']")).click();

		driver.findElement(By.linkText("Logout")).click();

		


	}

}
