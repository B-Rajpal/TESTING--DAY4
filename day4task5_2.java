package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4task5_2 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();

		WebElement cloth = driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		cloth.click();
		
		List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"product-title\"]"));
		for(WebElement l:li)
			System.out.print(l.getText()+" ");
	}
}
