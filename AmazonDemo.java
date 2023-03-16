package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonDemo {

	public static void main(String[] args) {


		String baseUrl = "https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(baseUrl);


		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");

		WebElement selectoption = driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
		WebDriverWait wait= new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(selectoption));
		selectoption.click();
		
		




	}

}
