package AutomationTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Punto6AlertText {
	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Entrar al siguiente link:http://sahitest.com/demo/promptTest.htm
		driver.get("http://sahitest.com/demo/promptTest.htm");

		//A. Realizar un clic en el bot�n que dice �Click For Prompt�, escribir �Hola Mundo!� en la alerta y aceptar la alerta. */
		driver.findElement(By.xpath("//input[contains(@name, 'b1')]")).click();
		driver.switchTo().alert().sendKeys("Hola Mundo!");
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		//B. Extraer el texto que se muestra en el input tras aceptar el alert e imprimirlo en consola. */
		System.out.println("Valor Input: "+driver.findElement(By.xpath("//input[contains(@name, 't1')]")).getAttribute("value"));

		Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	   	
		}


	@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        
		//Entrar al siguiente link:http://sahitest.com/demo/promptTest.htm
		driver.get("http://sahitest.com/demo/promptTest.htm");

		//A. Realizar un clic en el bot�n que dice �Click For Prompt�, escribir �Hola Mundo!� en la alerta y aceptar la alerta. */
		driver.findElement(By.xpath("//input[contains(@name, 'b1')]")).click();
		driver.switchTo().alert().sendKeys("Hola Mundo!");
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		//B. Extraer el texto que se muestra en el input tras aceptar el alert e imprimirlo en consola. */
		System.out.println("Valor Input: "+driver.findElement(By.xpath("//input[contains(@name, 't1')]")).getAttribute("value"));

		Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	}
}
