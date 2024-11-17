package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthnumber="06";
		String date="14";String year="2028";
		String[] arr={year,monthnumber,date};
		String expecteddate=String.join("-",arr);
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
	System.out.println(driver.findElement(By.xpath("//div/input[@name='date']")).getAttribute("value"));
	Assert.assertEquals(driver.findElement(By.xpath("//div/input[@name='date']")).getAttribute("value"),expecteddate );
	}

}
