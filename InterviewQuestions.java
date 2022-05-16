package interviewConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestions {
	
	public static void main(String[] args) {
		/*
		System Set property
		--> WebDriverManager.chromedriver().setup();
		
		Driver Set property
		--> ChromeDriver driver = new ChromeDriver();
		
		For Window Maximize syntax- We can use the below syntax to maximize the window.
		--> driver.manage().window().maximize();
		
		Implicit Wait syntax- The Implicit Wait in Selenium is used to tell the web driver to wait for a
		certain amount of time before it throws a “No Such Element Exception”.
		--> driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Explicit Wait syntax- The Explicit Wait in Selenium is used to tell the Web Driver to wait 
		for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception.
		--> WebDriverWait Wait = new WebDriverWait(Driver,90);
		--> WebElement firstResult = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("")));		
		
		Alerts in Selenium
		Alert is a kind of pop up window or pop up message. We can't find locators for Alert, so to handle an alert we use a method called
		driver.switchTo().alert();
		Simple ALert --> accept();
		Confirm Alert --> accept(); dismiss();
		Prompt Alert --> sendKeys(); accept(); dismiss();
		
		Windows Handling
		Consider a webpage has multiple windows- Example 10 windows, if any actions performed in 2nd window it will throw NoSuchElement Exception 
		because the control will be still in the parent window (i.e) 1st window. Now if you want to switch to the second window, windows Handling is used.
		getWindowHandle()- Used to get Parent window id and return type is string.
		getWindowHandles()- Used to get all windows id's including parent window id and return type is Set<string>
		
		driver.switchTo().window(""); //Syntax for windows handling, We can switch window by using --> String Id, String URL, String Title
		getWindowHandle() --> to get parent window ID,
		getWindowHandles() --> to get all windows ID which returns Set<WebElements> because Set does not allows duplicate.
		

		webTable
		All the tables present in webpage is called webtable. First we need to fetch the rows using tag name "tr" and iterate the rows and
		then fetch the data using tag name "td" and then iterate the data and pick a particular data from the webtable using if conditions and
		then fetch the data using tag name "th" and then iterate the headers.
		-->There are two types -->Static - Data's are fixed.
		-->Dynamic - Data's keeps changing
		
		Exception Handling
		By using try, catch & Finally block we can handle the Exception.
		
		//Difference between get() and navigate()
		driver.get(""); //used to load url of the page and it will not store browser cookies, we cannot perform navigation- Forward, Refresh, Back
		driver.navigate(); //used to load url of the page and it will store browser cookies, we can perform navigation- Forward, Refresh, Back
		
		//WebElements
		WebElement is predefined interface
		findElement()
		findElements()
		sendkeys()
		click()
		getText();
		getAttributes()
		clear();
		isDisplayed()
		isSelected()
		isEnabled()
		
		
		driver.close(); //It will close the current focused window.
		driver.quit(); //It will quit entire browser.
		
		
		
		
		
		
		
		
		
		
		*/
		
	}

}
