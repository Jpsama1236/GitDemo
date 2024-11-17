package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'Nested')]")).click();
		//System.out.println(driver.findElements(By.tagName("frameset")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
