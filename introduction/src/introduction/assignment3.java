package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String text=driver.findElement(By.cssSelector(".text-center.text-white")).getText();
		String[] arr=text.split(" ");
		String usr=arr[2].trim();String paswd=arr[6].trim();
		StringBuffer sb=new StringBuffer(paswd);
		sb.deleteCharAt(sb.length()-1);
		//System.out.println(sb);
		driver.findElement(By.id("username")).sendKeys(usr);
		driver.findElement(By.id("password")).sendKeys(sb);
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(5));
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement web=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select s=new Select(web);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
		List<WebElement> options=driver.findElements(By.cssSelector(".btn.btn-info"));
		for (WebElement option : options) {
			option.click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();

		System.out.println("End to end test complete");

		}

}
