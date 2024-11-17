package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//radio button with calendar date
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}


		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());



		//checkboxes
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//counting no of chckboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();


	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "6 Adult");
		}
}
