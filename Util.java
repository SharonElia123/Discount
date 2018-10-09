package Discount;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Util {
    static WebDriver driver;
    static String test1= "http://www.eshet.com/" ;
    static String test4 = "https://mvcsportest.eshet.com/sport/";
    static String test5 = "https://mvcsportest2.eshet.com/sport/";
    static String test6 = "https://sport.eshet.com/sport/";
    final static Logger logger = LoggerFactory.getLogger("Test:");
    private static final String FILE_NAME = "C:/shaf.xlsx";
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    public void openChrome() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(test1);
      driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    }



