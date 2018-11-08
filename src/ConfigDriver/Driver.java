package ConfigDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver driver = null;

    public static WebDriver Firefox(){
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver Chrome(){
        driver = new ChromeDriver();
        return driver;
    }
    public static boolean Close(){
        try{
            driver.quit();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

}
