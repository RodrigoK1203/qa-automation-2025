package educacionit.educait_aut_81534;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Ejercicio1 {
	String url = "https://www.saucedemo.com/";
	//String urlAuthentication= "https://www.saucedemo.com/inventory.html";
	
	public void ordendecompra()throws InterruptedException{
		
	//(1)Definir qué navegador queremos usar	
	WebDriver driver=new ChromeDriver();

	//(2) Abrir el navegador que queremos usar

	driver.get(url);
	
	// (3) Maximizar el navegador

	driver.manage().window().maximize();
	
	WebElement txtUsername = driver.findElement(By.id("user-name"));
	txtUsername.sendKeys("standard_user");
	
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys("secret_sauce");
	
	WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login-button']"));
	btnLogin.click();
	
	// Selección de Producto 
	WebElement btnAddToCart = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
	btnAddToCart.click();
	WebElement btnCart = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
	btnCart.click();
	
	// Avance en la compra
	WebElement btnCheckout = driver.findElement(By.name("checkout"));
	btnCheckout.click();
	
	//Datos Personales
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
	txtFirstName.sendKeys("Fernando");
	
	WebElement txtLastName = driver.findElement(By.cssSelector("#last-name"));
	txtLastName.sendKeys("Barraza");
	
	WebElement txtZipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
	txtZipcode.sendKeys("90120");
	
	WebElement btnContinue = driver.findElement(By.cssSelector("#continue"));
	btnContinue.click();
	
	// Confirmación Final
	WebElement btnFinish = driver.findElement(By.id("finish"));
	btnFinish.click();
	}

}
