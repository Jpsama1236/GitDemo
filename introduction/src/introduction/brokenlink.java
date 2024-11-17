package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a=new SoftAssert();
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement e: links) {
			String url=e.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			a.assertTrue(respcode<400,"The link with text "+"*"+e.getText()+"*"+" is broke and is giving the error code - "+respcode);
			
			}
			//System.out.println();
		a.assertAll();
		}
		
		
		
		
		

	}

