package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopeweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//1. get the count of all links in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
 //2. count of tags in footer section
		WebElement footdriver =driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
 // 3.count of links in first column under footer section
		WebElement columndriver=footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
//4 check the links of all given in above scope and get text  of those websites
		int length1=columndriver.findElements(By.tagName("a")).size();
		for (int i=0;i<length1;i++) {
			String keys1=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(keys1);
			Thread.sleep(2000);
		}
		Set<String>abc=driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
