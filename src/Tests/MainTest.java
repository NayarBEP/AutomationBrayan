package Tests;

import ConfigDriver.Driver;
import Utils.CaptureScreenShot;
import Utils.ValueElements;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.PriorityQueue;

import static org.testng.Assert.*;

public class MainTest {

    public static WebDriver driver = null;

    public void setUp() {
        driver = new ChromeDriver();
    }

    public void setUpDown(){
        Boolean result = Driver.Close();
        System.out.println(result);
    }

    @Test (priority = 1)
    public void main() {
        setUp();
        driver.get("https://www.ifunkoshop.com/proyecto/faces/pages/other/login.xhtml");
        ValueElements.FindElements(driver);
        System.out.println("Completed");
        setUpDown();

    }

    @Test (priority = 2, enabled = false)
    public void dataExcel() throws IOException {
        File file = new File("/Users/brayanposada/IdeaProjects/TestingActions/src/Docs/UsersData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        String dato1 = sheet.getRow(1).getCell(2).getStringCellValue();
        System.out.println(dato1);
    }

    @Test (priority = 3, enabled = false)
    public void VerifyFacebookTitle(){
        File path = new File("/Users/brayanposada/Documents/phantomjs-2.1.1-macosx/bin/phantomjs");
        System.setProperty("phantomjs.binary.path",path.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        CaptureScreenShot cap = new CaptureScreenShot();
        cap.captureScreenShot(driver, "PhantomJsDriverExample2");
    }




}