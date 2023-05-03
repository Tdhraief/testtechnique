package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserFromPage {
	private static WebElement element = null;
	
	
	
public static WebElement  kind_scrallbar (WebDriver driver) {
	element = driver.findElement(By.xpath("//select[@id='gender']"));
	return element ;
	
	
}
public static WebElement first_name_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@id='first-name']"));
	return element ;
}
public static WebElement name_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@id='last-name']"));
	return element ;
}
public static WebElement company_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@id='company']"));
	return element ;
}
public static WebElement phone_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@id='phone']"));
	return element ;
}
public static WebElement message_title_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@id='message-title']"));
	return element ;
}
public static WebElement your_message_field (WebDriver driver) {
	element = driver.findElement(By.xpath("//textarea[@id='message']"));
	return element ;
}

public static WebElement LgnBtn(WebDriver driver) {
	element = driver.findElement(By.id("submit-button"));
	return element ;
}
}


