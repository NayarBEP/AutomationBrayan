package AutomationTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Punto3Frames {
	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
                 
		//Entrar al siguiente link:http://sahitest.com/demo/iframesTest.htm
 	    driver.get("http://sahitest.com/demo/iframesTest.htm");
 	    
	   //A.	Realizar click en cualquier link del primer frame.
 	   driver.switchTo().frame(0);
 	   driver.findElement(By.linkText("Link Test")).click();

 	   Thread.sleep(1000);
 	   driver.switchTo().parentFrame();

 	   //B. Realizar click en cualquier link del segundo frame. 
 	   driver.switchTo().frame(1);
 	   driver.findElement(By.linkText("Table Test")).click();

 	   driver.switchTo().parentFrame();

 	   //C. Realizar click en el bot�n Click me de la ventana principal.
 	   driver.findElement(By.xpath("//input[contains(@value, 'Click me')]")).click();
 	   
	
	   	Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	   	
		}
	
	@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        
		//Entrar al siguiente link:http://sahitest.com/demo/iframesTest.htm
 	    driver.get("http://sahitest.com/demo/iframesTest.htm");
 	    
	   //A.	Realizar click en cualquier link del primer frame.
 	   driver.switchTo().frame(0);
 	   driver.findElement(By.linkText("Link Test")).click();

 	   Thread.sleep(100);
 	   driver.switchTo().parentFrame();

 	   //B. Realizar click en cualquier link del segundo frame. 
 	   driver.switchTo().frame(1);
 	   driver.findElement(By.linkText("Table Test")).click();

 	   driver.switchTo().parentFrame();

 	   //C. Realizar click en el bot�n Click me de la ventana principal.
 	   driver.findElement(By.xpath("//input[contains(@value, 'Click me')]")).click();
 	   
	
	   	Thread.sleep(60);
	 	//Finalizar test
	   	driver.quit();
	}
}
