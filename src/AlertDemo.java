import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/a[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		driver.switchTo().alert().accept();;
	}

}
