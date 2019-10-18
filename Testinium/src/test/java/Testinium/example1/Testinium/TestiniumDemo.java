package Testinium.example1.Testinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestiniumDemo {
	
	Actions action;

	public  TestiniumDemo(WebDriver driver) {
		action = new Actions(driver);
	}
	
	public void pressEnter() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MERT\\Downloads\\chrome-exe3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TestiniumDemo objSearch = new TestiniumDemo(driver);
		driver.get("https://www.hepsiburada.com/");
		driver.manage().window().maximize();
		
		WebElement inputSearch = driver .findElement(By.xpath("//*[@id=\"productSearch\"]"));
		inputSearch.sendKeys("bilgisayar");
		
		objSearch.pressEnter();
		
		WebElement pageTwo = driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a"));
		pageTwo.click();
		
		driver.get("https://www.hepsiburada.com/uyelik/giris?ReturnUrl=%2fara%3fq%3dbilgisayar%26sayfa%3d2");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("denemetestinium@gmail.com");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("testinium");
		
		objSearch.pressEnter();
				
		
		
		
		
	}

}
