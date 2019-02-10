package co.in.edureka.casestudy.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathAndWaitCaseStudy {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Chrome Driver\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				
				driver.manage().deleteAllCookies();

				//WebDriverWait wait = new WebDriverWait(driver, 20);
				
				driver.navigate().to("https://www.edureka.co/");
				driver.manage().window().maximize();
				
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("<<<<<<<<>>>>>>>>");
				
				WebElement selSearch = driver.findElement(By.id("search-inp"));
				selSearch.sendKeys("Selenium");
				
				
				selSearch.sendKeys(Keys.ENTER);
				//Add explicit wait for page to navigate to selenium course and click on the course
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				System.out.println("<<<<<<<<>>>>>>>>");
				
				driver.findElement(By.xpath("//img[@src='https://d1jnx9ba8s6j9r.cloudfront.net/imgver.1538723273/img/s/co_img_535_1529999716.png']")).click();
				
				//Wait for the whole selenium course page to be loaded and get the title of the page
				
				String title = driver.getTitle();
								
				System.out.println(title);
				
				//Validate the page title to be “Selenium 3.0 WebDriver Online Training”
				
				if (title.matches("Selenium 3.0 WebDriver Online Training"))
				{
					System.out.println("Title is same");
				} 
				else {
					
					System.out.println("Title is not same as per requirment");
				}
				
				
				//Navigate back to the previous page
				
				driver.navigate().back();
				
				
				//Wait for whole page to be loaded and now select “All courses” from the menu option
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//clicking on Courses
				driver.findElement(By.xpath("(//a[@href='/all-courses'])[4]")).click();
				
				//clicking on All courses
				
				driver.findElement(By.xpath("//a[@class='active']")).click();
				
				System.out.println("Clicked on All courses option");
				
				
				
				
				
			}
	
		
}
