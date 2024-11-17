package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

	}

}
