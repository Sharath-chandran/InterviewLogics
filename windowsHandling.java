package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.leafground.com/pages/Window.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
//		driver.findElement(By.xpath("//button[@id='home']")).click();
//		Thread.sleep(1500);
//		
//		driver.getWindowHandles();	
//		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent window key " + ParentHandle);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> ChildHandle = driver.getWindowHandles();
		for (String Handle : ChildHandle) {
			System.out.println(Handle);
			if (!Handle.equals(ParentHandle)) {
				driver.switchTo().window(Handle);
				driver.findElement(By.id("firstName")).sendKeys("Test");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentHandle);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
			
		
	}

}
	