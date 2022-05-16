import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
//	driver.get("https://www.dinamalar.com/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.switchTo().alert().accept();
	
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	
	driver.switchTo().defaultContent();
	Thread.sleep(1500);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
	Thread.sleep(1500);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.html']")));
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[@id='Click1']")).click();
	
	driver.switchTo().defaultContent();
	
	
//	List<WebElement> Frames = driver.findElements(By.tagName("iframe"));
//	System.out.println(Frames.size());
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='countframes.html']")));
	
	List<WebElement> Frames = driver.findElements(By.tagName("iframe"));
	System.out.println(Frames.size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
