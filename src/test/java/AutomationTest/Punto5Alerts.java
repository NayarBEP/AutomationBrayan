package AutomationTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Punto5Alerts {
	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Entrar al siguiente link:http://sahitest.com/demo/confirmTest.htm
		driver.get("http://sahitest.com/demo/confirmTest.htm");

		//A. Realizar un clic en el bot�n que dice �Click For Confirm� y aceptar la alerta que aparece. */
		driver.findElement(By.xpath("//input[contains(@name, 'b1')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//B. Realizar un clic en el bot�n que dice �Click For Confirm� y cancelar la alerta que aparece. */
		driver.findElement(By.xpath("//input[contains(@name, 'b1')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	   	Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	   	
		}
	
	@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        
		//Entrar al siguiente link:http://sahitest.com/demo/iframesTest.htm
 	    driver.get("http://sahitest.com/demo/clicks.htm");
 	    
		//A. Realizar un click en el bot�n que dice �click me�.
  	    driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
  	    //B. Realizar doble click en bot�n que dice �dbl click me�.
  	    Actions action = new Actions(driver); 
  	    action.moveToElement(driver.findElement(By.xpath("/html/body/form/input[2]"))).doubleClick().build().perform();
		
  	    //C. Realizar un click derecho en el bot�n que dice �right click me�.
  	    	// 1. elecciona el elemento que deseas hacer clic derecho
  	    	WebElement elementToRightClick = driver.findElement(By.xpath("/html/body/form/input[4]"));
  	    	// 2. Crear objeto que ejecutar� la acci�n
  	    	Actions action1 = new Actions(driver);
  	    	action1.contextClick(elementToRightClick);
  	    	// 3. Ejecutar la acci�n
  	    	action1.perform();

	   	Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	}
}
