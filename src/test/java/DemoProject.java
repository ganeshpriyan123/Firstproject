

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoProject {
	public static void main(String arg[]) throws InterruptedException
	{
		
		// launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    //launch demo page
		driver.get("https://demoqa.com/");
		
		// mouse click perform
		Actions mouse=new Actions(driver);
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS) ;
		
		// perform scroll down
		JavascriptExecutor scroll=(JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,200)", "");
		
		//click element Name
		  WebElement elementName = driver.findElement(By.xpath("(//*[contains(text(),'Elements')])[2]"));
		  mouse.click(elementName).perform();
		  Thread.sleep(1000);
		  
		  //click web table
		  WebElement webTable = driver.findElement(By.xpath("(//span[contains(text(),'Web Tables')])"));
		  mouse.click(webTable).perform();
		  Thread.sleep(500);
		  
		  // click add button
		  WebElement addBtn = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		  mouse.click(addBtn).perform();
		  Thread.sleep(1000);
		  
		  // enter the first name
		  WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		  firstName.sendKeys("Ganesh");
		  Thread.sleep(1000);
		  
		  // enter the last name
		  WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		  lastName.sendKeys("priyan");
		  Thread.sleep(1000);
		  
		  // enter email id
		  WebElement emailId = driver.findElement(By.xpath("//input[@id='userEmail']"));
		  emailId.sendKeys("xyz123@gmail.com");
		  Thread.sleep(1000);
		 
		  // enter age
		  WebElement ageDetails = driver.findElement(By.xpath("//input[@id='age']"));
		  ageDetails.sendKeys("30");
		  Thread.sleep(1000);
		  
		  // enter salary
		  WebElement salaryPerMonth = driver.findElement(By.xpath("//input[@id='salary']"));
		  salaryPerMonth.sendKeys("50000");
		  Thread.sleep(1000);
		
		  //enter department
		  WebElement depDetails = driver.findElement(By.xpath("//input[@id='department']"));
		  depDetails.sendKeys("IT");
		  Thread.sleep(1000);
		  
		  //click submit button
		  WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		  mouse.click(submitBtn).perform();
		  Thread.sleep(1000);
		  
		  // click search box
		  WebElement searchBoxclick = driver.findElement(By.xpath("//input[@id='searchBox']"));
		  mouse.click(searchBoxclick).perform();
		  Thread.sleep(1000);
		  
		  // enter search box
		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
		  searchBox.sendKeys("GANESH");
		  Thread.sleep(1000);
		  
		  // click edit button
		  WebElement editBtn = driver.findElement(By.xpath("//span[@title='Edit']"));
		  mouse.click(editBtn).perform();
		  Thread.sleep(1000);
		    
		  // click submit btn
		  WebElement editSubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		  mouse.click(editSubmitBtn).perform();
		  Thread.sleep(1000);
		  
		  
		  // click delete button
		  WebElement deleteBox = driver.findElement(By.xpath("//span[@title='Delete']"));
		  mouse.click(deleteBox).perform();
		  Thread.sleep(1000);
		  
		  driver.quit();
		  
		  
	}

}

