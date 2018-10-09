package Discount;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class SportBeforeDiscInvite {

    static WebDriver driver;
    static String test1= "https://sportest.eshet.com/sport/" ;
    static String test2= "http://www.eshet.com/sport/" ;
    static String test3= "https://www.eshet.com/sport/" ;
    static String test5= "https://test2.eshet-tours.com/sport/" ;
    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test2+"/searchresults?DestinationCode=62246&EventId=&EventType=0&Performer=&DealType=Event&FromDate=01.06.2018&ToDate=31.07.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        //Sport Pac Before Disc########################
        for (int i = 1; i <= 1; i++)

        {

            String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"results\"]/div["+i+"]/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div[1]/div/span")).getText();

            String discountPrice2 = discountPrice1.substring(1);
            String discountPrice3=" ";
            if (discountPrice2.length()== 5)
            {

                discountPrice3= discountPrice1.substring(0,discountPrice1.length()-4)+discountPrice1.substring(discountPrice1.length()-3);


            }

            else
            {
                discountPrice3=discountPrice2;
            }

            int discountPrice4 = Integer.parseInt(discountPrice3);
            System.out.println(discountPrice4);
            Thread.sleep(2000L);
            driver.findElement(By.xpath("//*[@id=\"results\"]/div["+i+"]/div/div[3]/div[2]/div/div/div/div[2]/div[2]/a")).click();
            Thread.sleep(2000L);
            ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(windows.get(1));
            Thread.sleep(1000L);
            String discountPrice5 = driver.findElement(By.xpath("//*[@id=\"hotel-summery-box-section\"]/div[7]/div[2]/span/span[1]/span[2]")).getText();
            String discountPrice7=" ";
            if (discountPrice5.length()== 5)
            {

                discountPrice7= discountPrice5.substring(0,discountPrice5.length()-4)+discountPrice5.substring(discountPrice5.length()-3);


            }

            else
            {
                discountPrice7=discountPrice5;
            }

            int discountPrice8 = Integer.parseInt(discountPrice7);


            System.out.println(discountPrice8);
            if (discountPrice4 == discountPrice8)

            {
                System.out.println("Great Discount!!!!" + "  " + i);
            } else {

                System.out.println("Bug in Discount!!!!"+" " + i);
            }

            Thread.sleep(2000L);
            ArrayList<String> windows1 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(windows1.get(0));
            Thread.sleep(2000);



        }
        driver.close();
    }
}










