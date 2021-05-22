package temaSelenium_Practica2;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practica_DropDown {
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
		
		WebElement assgLeave = driver.findElement(By.className("quickLinkText"));
		assgLeave.click();
		Thread.sleep(3000);
		
		//declarando elementos del tipo dropdown
		Select dropDown = new Select(driver.findElement(By.id(("assignleave_txtLeaveType"))));
		dropDown.selectByVisibleText("US - FMLA");
		
		
		
		
		//Cerrando el navegador
		//driver.close(); //cierra la ventana que el web driver está utilizando
		//driver.quit(); //cierra todas las ventanas del webdriver
		

	}
	

}
