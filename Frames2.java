import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.html']")));
	driver.findElement(By.xpath("//button[@id='Click1']")).click();
	Thread.sleep(1500);
	driver.switchTo().parentFrame();
	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
	System.out.println(findElements.size());
	driver.switchTo().parentFrame();
	List<WebElement> findElements2 = driver.findElements(By.tagName("iframe"));
	System.out.println(findElements2.size());
}
}
