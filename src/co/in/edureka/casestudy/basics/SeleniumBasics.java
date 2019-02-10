package co.in.edureka.casestudy.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasics {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Chrome Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		//driver.navigate().to("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		//Using ID
		driver.findElement(By.id("search-inp")).sendKeys("Search for a course");
		
		//Using name and Xpath
		//driver.findElement(By.name("//input[@name='user_v1[query]']")).sendKeys("Search for a course");
		
		//Using Class
		//driver.findElement(By.className("//input[@class='search_inp collapse giTrackElementHeader']")).sendKeys("Search for a course");
		
		//Using CSS
		//driver.findElement(By.cssSelector("input[id='search-inp']")).sendKeys("Search for a course");
	
		//Getting Link Text
		//WebElement login = driver.findElement(By.linkText("Log In"));
		//System.out.println(login.getText());
		
		//Getting PartialLink text
		WebElement partial = driver.findElement(By.partialLinkText("Log"));
		System.out.println(partial.getText());


	}

}
