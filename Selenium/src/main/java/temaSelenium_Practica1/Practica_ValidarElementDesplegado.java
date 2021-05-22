package temaSelenium_Practica1;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practica_ValidarElementDesplegado {
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

		//utilizamos un objeto tipo boleano para verificar que se despliega el elemento imagen
		
		boolean imagenDesplegada = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")).isDisplayed();
		if(imagenDesplegada) {
			System.out.println("La imagen se despliega correctamente");
		}
		
		//obtenemos el texto del elemento
		//Validamos el elemento mediante el texto
		String txtWelcome = driver.findElement(By.id("welcome")).getText();
		if(txtWelcome.contains("Paul")) {
			System.out.println(" El mensaje tiene el nombre de Paul");
		}else {
			System.out.println("El elemento no tiene el texto Paul");
		}
		
		//Cerrando el navegador
		//driver.close(); //cierra la ventana que el web driver está utilizando
		driver.quit(); //cierra todas las ventanas del webdriver
		

	}
	

}
