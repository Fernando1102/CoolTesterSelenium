package temaSelenium_Practica1;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practica_MouseOver {
	public static void main(String[] args) throws InterruptedException {
		// Setear la ruta 
		String exePath  = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		//agregando la propiedad con la ruta del chrome driver
		System.setProperty ("webdriver.chrome.driver", exePath + "chromedriver.exe");
		//inicializando nuestro chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.click();
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();
		
		
		//Realizamos la acción de pasar el mouse sobre el navegador
		
		WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement nationalities = driver.findElement(By.id("menu_admin_nationality"));
		
		
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(adminMenu).perform();
		Thread.sleep(3000);
		nationalities.click();
		
		
		
		
		
		//Cerrando el navegador
		//driver.close(); //cierra la ventana que el web driver está utilizando
		driver.quit(); //cierra todas las ventanas del webdriver
		

	}
	

}
