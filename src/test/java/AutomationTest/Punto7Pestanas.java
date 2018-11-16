package AutomationTest;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Punto7Pestanas {
@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		
		//Entrar al siguiente link:http://sahitest.com/demo/index.htm
		driver.get("http://sahitest.com/demo/index.htm");

		//A. Realizar clic al link Window Open Test
		driver.findElement(By.linkText("Window Open Test")).click();
		Thread.sleep(100);
		driver.switchTo().window(parentWindowHandler);
		//B. En la nueva pesta�a dar clic a cualquier link
		driver.findElement(By.linkText("Table Test")).sendKeys(Keys.CONTROL +"t");
		
		Thread.sleep(100);
	 	//Finalizar test
	   	driver.quit();		
		
	   	
		}

@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		
		//Entrar al siguiente link:http://sahitest.com/demo/index.htm
		driver.get("http://sahitest.com/demo/index.htm");

		//A. Realizar clic al link Window Open Test
		driver.findElement(By.linkText("Window Open Test")).click();
		Thread.sleep(100);
		driver.switchTo().window(parentWindowHandler);
		//B. En la nueva pesta�a dar clic a cualquier link
		driver.findElement(By.linkText("Table Test")).sendKeys(Keys.CONTROL +"t");

		Thread.sleep(100);
	 	//Finalizar test
	   	driver.quit();
	}
}
