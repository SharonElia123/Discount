package Discount;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class PageHomeBeforeDiscInvite extends Util{

    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
       driver.get(test1+"/Organized/SearchResults?ContinentName=%D7%90%D7%99%D7%A8%D7%95%D7%A4%D7%94&ContinentCode=38158&CountryName=%D7%94%D7%9B%D7%9C&CountryCode=&MonthAndYearHe=%D7%94%D7%9B%D7%9C&MonthAndYear=&capacity.Adults=2&capacity.Children=0&capacity.Infants=0");
       driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
       }

    @Test
    public void Test1() throws InterruptedException, FindFailed {

       String discountPrice1;
        //Orig Trip Before Disc########################
        for (int i = 2; i <= 4; i++)

        {
            driver.manage().window().maximize();
            Thread.sleep(2000L);
            try {
             discountPrice1 = driver.findElement(By.xpath("(//*[@class='priceSortJS'])["+i+"]")).getText();
                Thread.sleep(2000);
            }
            catch (Exception var4) {
                discountPrice1 = driver.findElement(By.xpath("//*[@id=\"results\"]/div["+i+"]/div[1]/div[2]/div[1]/span[2]")).getText();
                Thread.sleep(2000);
            }
            System.out.println(discountPrice1);
            String discountPrice3 = " ";

            if (discountPrice1.length() == 5) {

                discountPrice3 = discountPrice1.substring(0, discountPrice1.length() - 4) + discountPrice1.substring(discountPrice1.length() - 3);


            } else {
                discountPrice3 = discountPrice1;
            }

            int discountPrice4 = Integer.parseInt(discountPrice3) * 2;
            System.out.print(discountPrice4);
            driver.findElement(By.xpath("(//*[@class='col-md-12 margin-x-small-top padd-large-horizontal'])["+i+"]")).click();
            Thread.sleep(2000);
            ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(windows.get(i-1));
            Thread.sleep(2000);
            String  discountPrice5 = driver.findElement(By.xpath("//*[@id=\"productPageSummeryWrapper\"]/div[1]/div[2]/div/div[3]/div/div/div[5]/div[3]/div[2]/span[2]/span")).getText();

             String discountPrice7 = " ";
                if (discountPrice5.length() == 5) {

                    discountPrice7 = discountPrice5.substring(0, discountPrice5.length() - 4) + discountPrice5.substring(discountPrice5.length() - 3);


                } else {
                    discountPrice7 = discountPrice5;
                }

                int discountPrice8 = Integer.parseInt(discountPrice7);


                System.out.println("\t"+ "="+ "\t"+ discountPrice8);
                if (discountPrice4 == discountPrice8)

                {
                    System.out.println("Great!!!!"+"=" + "\t"+ i );
                } else {

                    System.out.print("Bug in Discount!!!!" + "\t"+ i);
                }
            Thread.sleep(2000);
            driver.switchTo().window(windows.get(0));
            Thread.sleep(2000);


            }
     // driver.close();
        }
    }









