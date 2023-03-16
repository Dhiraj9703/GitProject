package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDemo {

	public static void main(String[] args) {


		String baseUrl= "https://www.gmail.com/";

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dhirajpatil769@gmail.com");
		driver.findElement(By.xpath("//div[@id=\"identifierNext\"]/div/button/span")).click();
		
		
		
	}
}
