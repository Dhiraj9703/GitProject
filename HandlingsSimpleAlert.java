package handlingPopuos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingsSimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl="file://E:/alert_demo.html";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

		driver.findElement(By.id("cmdClick")).click();

		Thread.sleep(1000);

		String message = driver.switchTo().alert().getText();
		System.out.println(message);

		driver.switchTo().alert().accept();

		Thread.sleep(1000);

		driver.quit();

	}

}
