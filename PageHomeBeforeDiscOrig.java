package Discount;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageHomeBeforeDiscOrig extends Util{


     @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);

            //Orig Trip Before Disc########################
            for (int i = 1; i <= 4; i++)

            {

                String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[4]/div/div/div/ul/li["+i+"]/article/div[2]/div[2]/div[2]/div[1]/div")).getText();

                     String discountPrice2 = discountPrice1.substring(1);
                     String discountPrice3=" ";
                if (discountPrice2.length()== 5)
                     {

                      discountPrice3= discountPrice2.substring(0,discountPrice2.length()-4)+discountPrice2.substring(discountPrice2.length()-3);


                     }

                     else
                     {
                         discountPrice3=discountPrice2;
                     }

                    int discountPrice4 = Integer.parseInt(discountPrice3);

                    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[4]/div/div/div/ul/li["+i+"]/article/div[2]/div[2]/div[2]/div[2]/span[1]")).click();

                    String discountPrice5 = driver.findElement(By.xpath("//*[@class='value-before-discout']")).getText();


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
                        System.out.println("Great!!!!" + "  " + i);
                    } else {

                        System.out.println("Bug in Discount!!!!"+" " + i);
                    }

                   Thread.sleep(1000);
                   driver.navigate().back();
                   Thread.sleep(2000);



                }
      //  driver.close();
            }
        }










