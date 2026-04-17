package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticaM6 {

WebDriver driver;
	
	String URL="https://demo.guru99.com/test/upload";
	
	@BeforeSuite
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void cargarArchivo() {
		
		WebElement rutaArchivo=driver.findElement(By.id("uploadfile_0"));
		rutaArchivo.sendKeys("C:\\Users\\cesar\\eclipse-workspace\\educa_v1\\prueba1.txt");
		
	}
	
	@AfterMethod
	public void  teardown() {
		
		driver.quit();
		
	}

	

}

