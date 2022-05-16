package WindowsHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafWindow {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		String Parent = driver.getWindowHandle();
		System.out.println("Parent Key- "+Parent);
		
		Thread.sleep(1500);		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> Child = driver.getWindowHandles();
		for (String Handle : Child) {
			System.out.println(Handle);
			if(!Handle.equals(Parent)) {
				driver.switchTo().window(Handle);
				driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Thread.sleep(1500);
	
	
	
	
	
	
	}
	

}
