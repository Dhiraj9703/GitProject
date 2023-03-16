package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledemo2 {

	public static void main(String[] args) {

		String baseUrl= "https://www.saucedemo.com/";

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		
		driver.findElement(By.xpath("//a[@id=\"inventory_sidebar_link\"]")).click();
	}   
}

