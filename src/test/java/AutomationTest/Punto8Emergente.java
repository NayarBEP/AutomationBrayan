package AutomationTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Punto8Emergente {
	WebDriver driver;

	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;
		
		//Entrar al siguiente link:https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window
		driver.get("https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window");
		
		//A. Realizar click al bot�n Calculadora (Se abrir� ventana emergente).
		driver.findElement(By.xpath("//*[@id='contenido']/article/div[4]/div[15]/div[3]/div[1]/input")).click();
		//B. Realizar click al n�mero 1, click al +, click al n�mero 3 y dar click en igual.
		//driver.switchTo().window("//*[@id='calculadora'])");
		
		Set<String> handles = driver.getWindowHandles(); // Obtener todas las ventanas abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cambiar a la ultima ventana (tu pop-up)

		driver.findElement(By.xpath("//*[@id='calculadora']/input[5]")).click();
		driver.findElement(By.xpath("//*[@id='calculadora']/input[8]")).click();
		driver.findElement(By.xpath("//*[@id='calculadora']/input[7]")).click();
		driver.findElement(By.xpath("//*[@id='calculadora']/input[26]")).click();
	
		Thread.sleep(60);	
		//C. Cerrar la ventana emergente y regresar a la ventana inicial y dar click en el bot�n abrir calculadora
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // Vuelve a la ventana principal
		
		Thread.sleep(600);
	 	//Finalizar test
	   	driver.quit();
	   	
		}
	
	@Test
	
	public void EjecutaIE() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;
		
		//Entrar al siguiente link:https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window
		driver.get("https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window");
		
		//A. Realizar click al bot�n Calculadora (Se abrir� ventana emergente).
		driver.findElement(By.xpath("Calculadora")).click();
		//B. Realizar click al n�mero 1, click al +, click al n�mero 3 y dar click en igual.
		//driver.switchTo().window("//*[@id='calculadora'])");
		
		Set<String> handles = driver.getWindowHandles(); // Obtener todas las ventanas abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cambiar a la ultima ventana (tu pop-up)

		driver.findElement(By.xpath("//*[@id='calculadora']/input[5]")).click();// #1
		driver.findElement(By.xpath("//*[@id='calculadora']/input[8]")).click();// operador +
		driver.findElement(By.xpath("//*[@id='calculadora']/input[7]")).click();// #3
		driver.findElement(By.xpath("//*[@id='calculadora']/input[26]")).click();// = Igual
	
		Thread.sleep(60);	
		//C. Cerrar la ventana emergente y regresar a la ventana inicial y dar click en el bot�n abrir calculadora
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // Vuelve a la ventana principal
		
		Thread.sleep(600);
	 	//Finalizar test
	   	driver.quit();
	   	
		}

}

