package Discount;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.concurrent.TimeUnit;


public class DiscountVsAfterHotelSR extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
        driver.get(test1+"domestichotels/eilat/");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        //Orig Trip After Disc########################

       for (int i = 1; i <= 5; i++)

        {

            String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div["+i+"]/article/div[2]/div[2]/div[2]/div[2]/span[1]")).getText();

                String discountPrice3 = " ";
            if (discountPrice1.length() == 5) {

                discountPrice3 = discountPrice1.substring(0, discountPrice1.length() - 4) + discountPrice1.substring(discountPrice1.length() - 3);


            } else {
                discountPrice3 = discountPrice1;
            }

            int discountPrice4 = Integer.parseInt(discountPrice3);
            System.out.print("After Discount" + " " + " : " + discountPrice4 + " ");

        }
    }}







