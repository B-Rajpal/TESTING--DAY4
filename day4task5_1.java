package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4task5_1 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		String title=driver.getCurrentUrl();
		if(title.equals("https://j2store.net/free/"))
			System.out.println("Title validated");
		else
			System.out.println("Title  not validated");
		WebElement cloth = driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		cloth.click();
		String clothtitle=driver.getCurrentUrl();
		if(clothtitle.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
			System.out.println("clothing Title validated");
		else
			System.out.println("clothing Title  not validated");
	}
}
