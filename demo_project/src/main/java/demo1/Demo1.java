package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.browserstack.com");
	      WebElement cookies=driver.findElement(By.id("accept-cookie-notification"));
	      cookies.click();
	      WebElement signin=driver.findElement(By.xpath("//a[text()='Sign in']"));
	      signin.click();
	      //WebElement signup=driver.findElement(By.cssSelector("a[href*='/users/sign_up']"));
	      //signup.click();
	      //driver.findElement(By.id("user_full_name"));
	      //WebElement fullname=driver.findElement(By.id("user_full_name"));
	      //driver.findElement(By.id("user_email_login"));
	      //WebElement email=driver.findElement(By.id("user_email_login"));
	      //driver.findElement(By.id("user_password"));
	      //WebElement password=driver.findElement(By.id("user_password"));
	      //WebElement check=driver.findElement(By.id("tnc_checkbox"));
	      //WebElement signme_up=driver.findElement(By.name("commit"));
	      //fullname.sendKeys("jyothi");
	      //email.sendKeys("bodapatibhagyalakshmi462@gmail.com");
	      //password.sendKeys("password@1234");
	      //check.click();
	      //signme_up.click();
	      //System.out.println("Page Navigated:"+ driver.getTitle());
	      //WebElement signin1=driver.findElement(By.cssSelector("a[href*='/users/sign_in']"));
	      //signin1.click();
	      driver.findElement(By.id("user_email_login"));
	      WebElement email=driver.findElement(By.id("user_email_login"));
	      driver.findElement(By.id("user_password"));
	      WebElement password=driver.findElement(By.id("user_password"));
	      WebElement check=driver.findElement(By.id("tnc_checkbox"));
	      WebElement signme_in=driver.findElement(By.name("commit"));
	      email.sendKeys("bodapatibhagyalakshmi462@gmail.com");
	      password.sendKeys("password@1234");
	      check.click();
	      signme_in.click();    
	      
	}

}
