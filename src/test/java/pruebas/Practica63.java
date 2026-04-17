package pruebas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practica63 {
WebDriver driver;
	
	String URL="https://practice-automation.com/popups/";
	
	@BeforeSuite
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
public void alertaNotificacion() {
		
		WebElement btnButton=driver.findElement(By.id("alert"));
		btnButton.click();
		
		Alert Alerta=driver.switchTo().alert();
		
		Alerta.accept();

		
		
	}
	
	@AfterMethod
	public void  teardown() {
		
		driver.quit();
		
	}

}






