package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("name")).sendKeys("JP");
		driver.findElement(By.name("email")).sendKeys("jp@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ironman@1236");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement e1=driver.findElement(By.id("exampleFormControlSelect1"));
		Thread.sleep(2000);
		Select s1=new Select(e1);
		s1.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
