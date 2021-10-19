import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ndemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		//d.findElement(By.xpath("//*[@id='\btn2\']")).click();
		List<WebElement>options=d.findElements(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li"));
		System.out.println(options.size());
		
		for(WebElement option:options) {
			if(option.getText().contains("Practice Site")) {
			Thread.sleep(2000);
			option.click();
		}
	}
	
	}
}
