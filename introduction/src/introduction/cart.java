package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		String[] items= {"Cucumber","Beetroot","Carrot"};
		List<String> itemlist=Arrays.asList(items);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> options=driver.findElements(By.cssSelector("h4.product-name"));
		int count=0;
		for (int i=0;i<options.size();i++) {

			String itemname=options.get(i).getText().split("-")[0].trim();
			if(itemlist.contains(itemname)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(count==itemlist.size()) { break;

			}
		}
	}

}
}
