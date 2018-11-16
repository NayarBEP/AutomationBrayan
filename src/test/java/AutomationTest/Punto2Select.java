package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Punto2Select {
	@Test
	
	public void EjecutaChrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/ana.palacios/Desktop/Automatizacion/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
                 
		//Entrar al siguiente link:http://sahitest.com/demo/selectTest.htm
	   	driver.get("http://sahitest.com/demo/selectTest.htm");
	   	
	    //A.En el primer select seleccionar por el m�todo click a cualquier opci�n.
	   	WebElement select = driver.findElement(By.id("s1Id"));
	   	List<WebElement> options = select.findElements(By.tagName("option"));
	   	for (WebElement option : options) {
	   	if("o2".equals(option.getText()))
	   	option.click();
	 
	   	}
	   	
	    //B.En el segundo select seleccionar por el m�todo VisibleText a cualquier opci�n.
	   	new Select(driver.findElement(By.id("s2Id"))).selectByVisibleText("o3");
	   	
	    //C.En el tercero select seleccionar por el m�todo Index a cualquier opci�n.
	   	Select list3 = new Select(driver.findElement(By.id("s3Id")));
	   	list3.selectByIndex(1);
	   	
  	    //D.En el cuarto select seleccionar por el m�todo value a cualquier opci�n.
	   	Select list4 = new Select(driver.findElement(By.id("s4Id")));
	   	list4.selectByValue("o2val");
	   	
	    //E.En el quinto select seleccionar por el m�todo SendKeys a cualquier opci�n.
	   	WebElement select2 = driver.findElement(By.id("s1"));
	   	select2.sendKeys("Mail");

	   	Thread.sleep(30);
	 	//Finalizar test
	   	driver.quit();
	   	
		}
	
	@Test
	public void EjecutaIE() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "/Users/ana.palacios/Desktop/Automatizacion/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
        
		//Entrar al siguiente link:http://sahitest.com/demo/selectTest.htm
	   	driver.get("http://sahitest.com/demo/selectTest.htm");
	   	
	    //A.En el primer select seleccionar por el m�todo click a cualquier opci�n.
	   	WebElement select = driver.findElement(By.id("s1Id"));
	   	List<WebElement> options = select.findElements(By.tagName("option"));
	   	for (WebElement option : options) {
	   	if("o2".equals(option.getText()))
	   	option.click();
	 	   	}
	   	
	    //B.En el segundo select seleccionar por el m�todo VisibleText a cualquier opci�n.
	   	new Select(driver.findElement(By.id("s2Id"))).selectByVisibleText("o3");
	   	
	    //C.En el tercero select seleccionar por el m�todo Index a cualquier opci�n.
	   	Select list3 = new Select(driver.findElement(By.id("s3Id")));
	   	list3.selectByIndex(1);
	   	
  	    //D.En el cuarto select seleccionar por el m�todo value a cualquier opci�n.
	   	Select list4 = new Select(driver.findElement(By.id("s4Id")));
	   	list4.selectByValue("o2val");
	   	
	    //E.En el quinto select seleccionar por el m�todo SendKeys a cualquier opci�n.
	   	WebElement select2 = driver.findElement(By.id("s1"));
	   	select2.sendKeys("Mail");

	   	Thread.sleep(30);
	 	//Finalizar test
	   	driver.quit();
	}
}
