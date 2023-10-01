package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("fshimra2000@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("#Sn2704#");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
