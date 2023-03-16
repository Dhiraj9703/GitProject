package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {


		String baseUrl= "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement parent =   driver.findElement(By.xpath("//form[@name='aspnetForm']/div[3]/parent::*"));
		
		System.out.println(parent.getTagName());
	}

}
