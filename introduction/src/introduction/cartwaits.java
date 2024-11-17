package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class cartwaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String[] items= {"Cucumber","Beetroot","Carrot"};
		List<String> itemlist=Arrays.asList(items);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		additems(driver,itemlist);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		Assert.assertEquals(driver.findElement(By.cssSelector(".promoInfo")).getText(), "Code applied ..!");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement wb=driver.findElement(By.xpath("//div/select"));
		Select s1=new Select(wb);
		s1.selectByVisibleText("India");
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//div/button")).click();

	}

	public static void additems(WebDriver driver, List<String> itemlist) {
		List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));
		int count = 0;
		for (int i = 0; i < options.size(); i++) {

			String itemname = options.get(i).getText().split("-")[0].trim();
			if (itemlist.contains(itemname)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == itemlist.size()) {
					break;

				}
			}
		}

	}

}
