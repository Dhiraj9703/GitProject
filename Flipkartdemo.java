package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Flipkartdemo {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);

		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();

		WebElement Electronics = 	driver.findElement(By.xpath("//img[@alt='Electronics']"));

		Actions actions = new Actions(driver);
		Action moveToFashionMenu= actions.moveToElement(Electronics).build();
		moveToFashionMenu.perform();
		Thread.sleep(2000);
		
	    WebElement gaming= driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
	    Action moveToGaming = actions.moveToElement(gaming).build();
	     moveToGaming.perform();
	     
	     actions.click(gaming);

	}

}
