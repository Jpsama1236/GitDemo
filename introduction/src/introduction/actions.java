package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
// this is edited by git_X user
	// this is edited for branching
// this edit done by gitx teamuser for develop branch
//this is for merge conflict

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.google.co.in/");
		Actions a=new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
		a.moveToElement(move).contextClick().build().perform();
	}

}
