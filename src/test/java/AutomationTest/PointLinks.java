package AutomationTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

    public class PointLinks {

        WebDriver driver;

        @Test

        public void OpenPage() throws InterruptedException{
            WebDriverManager.phantomjs().setup();

            driver = new PhantomJSDriver();
            //Punto 1: Links    -- comentario
            // Entrar al siguiente link:
            // http://sahitest.com/demo/linkTest.htm

            // A.	Dar clic a �linkByContent� por metodo LinkTest.
            //  B.	Dar clic a �linkByHtml� por metodo LinkTest.

            driver.get("http://sahitest.com/demo/linkTest.htm");
            driver.findElement(By.linkText("linkByContent")).click();
            driver.findElement(By.linkText("Back")).click();
            Thread.sleep(10);
            driver.findElement(By.linkText("linkByHtml")).click();
            driver.findElement(By.linkText("Back")).click();
            Thread.sleep(5);


            //Finalizar test
            driver.quit();

        }
        @Test
        public void EjecutaIE() throws InterruptedException{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            //Punto 1: Links
            // Entrar al siguiente link:
            // http://sahitest.com/demo/linkTest.htm

            // A.	Dar clic a �linkByContent� por metodo LinkTest.
            //  B.	Dar clic a �linkByHtml� por metodo LinkTest.

            driver.get("http://sahitest.com/demo/linkTest.htm");
            driver.findElement(By.linkText("linkByContent")).click();
            driver.findElement(By.linkText("Back")).click();
            Thread.sleep(10);
            driver.findElement(By.linkText("linkByHtml")).click();
            driver.findElement(By.linkText("Back")).click();
            Thread.sleep(5);


            //Finalizar test
            driver.quit();
        }


}
