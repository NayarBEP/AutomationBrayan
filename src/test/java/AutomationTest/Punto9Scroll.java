package AutomationTest;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Punto9Scroll {
	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Entrar al siguiente link:http://sahitest.com/demo/formTest.htm
		driver.get("http://sahitest.com/demo/formTest.htm");
		driver.switchTo().alert().accept();
		Thread.sleep(1200);

		//	A.	Mover scroll abajo hasta el final de la p�gina.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		

		//B.	Mover scroll arriba hasta la mitad de la p�gina.
		 js.executeScript("window.scrollBy(0,1000)"); 	

		Thread.sleep(60);
	 	//Finalizar test
	   driver.quit();
	   	
		}


@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Entrar al siguiente link:http://sahitest.com/demo/formTest.htm
		driver.get("http://sahitest.com/demo/formTest.htm");
		driver.switchTo().alert().accept();
		Thread.sleep(1200);

		//	A.	Mover scroll abajo hasta el final de la p�gina.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		

		//B.	Mover scroll arriba hasta la mitad de la p�gina.
		 js.executeScript("window.scrollBy(0,1000)"); 	

		Thread.sleep(60);
	 	//Finalizar test
	   driver.quit();
	}
}
