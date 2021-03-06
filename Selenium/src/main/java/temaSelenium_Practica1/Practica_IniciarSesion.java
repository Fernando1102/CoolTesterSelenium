package temaSelenium_Practica1;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practica_IniciarSesion {
	
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
		
		Thread.sleep(3000);
		//Metodos del explorador
		//Obtenemos el titulo de la pagina
		String title = driver.getTitle();
		System.out.println("El titulo es :" + title);
		
		//Obtener la url
		String urlDashboard = driver.getCurrentUrl();
		System.out.println("La url es :" + urlDashboard);
		
		//Cerrando el navegador
		//driver.close(); //cierra la ventana que el web driver est? utilizando
		driver.quit(); //cierra todas las ventanas del webdriver
		

	}
	
		
	
}
