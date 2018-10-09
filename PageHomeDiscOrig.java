package Discount;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import javax.xml.soap.SOAPPart;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageHomeDiscOrig extends Util{

    @Before
    public void openwindow() throws InterruptedException {
    openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(1000L);


        List<WebElement> generalDiscount = driver.findElements(By.xpath("//*[@class='promo_price_text promo_prev_price calc-promo-discount']//*[@class='currency_span']"));

        Integer genDis =  generalDiscount.size();
        System.out.println(genDis);
        if (genDis>33)
        {
            System.out.println("Great General Discount Items!!!!!");
        }
        else
        {
            System.out.print("Bug General Discount Items!!!!!");
        }
        List<WebElement> generalDiscountIsr = driver.findElements(By.xpath("//*[@class='promo_price_text promo_prev_price calc-promo-discount']//*[@class='currency_span'][contains(text(),'₪')]"));

        Integer isrDis =  generalDiscountIsr.size();
        System.out.println(isrDis);
        if (isrDis>2)
        {
            System.out.println("Great General Discount Israel Items!!!!!");
        }
        else
        {
            System.out.print("Bug Discount Israel Items!!!!");
        }

        List<WebElement> generalDiscountAboard = driver.findElements(By.xpath("//*[@class='promo_price_text promo_prev_price calc-promo-discount']//*[@class='currency_span'][contains(text(),'$')]"));

        Integer aboardDis =  generalDiscountAboard.size();
        System.out.println(aboardDis);
        if (aboardDis>2)
        {
            System.out.println("Great General Discount Dolar Aboard Items!!!!!");
        }
        else
        {
            System.out.println("Bug Discount Dolar Aboard Items!!!!!");
        }
        List<WebElement> generalDiscountAboardEuro = driver.findElements(By.xpath("//*[@class='promo_price_text promo_prev_price calc-promo-discount']//*[@class='currency_span'][contains(text(),'€')]"));

        Integer aboardDisEu =  generalDiscountAboardEuro.size();
        System.out.println(aboardDisEu);
        if (aboardDis>2)
        {
            System.out.println("Great General Discount Euro Aboard Items!!!!!");
        }
        else
        {
            System.out.println("Bug Discount Euro Aboard Items!!!!!");
        }
       //Check if we got correct true#########

     //   driver.get(test1);
   //     driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        Thread.sleep(3000);
         //Orig Trip After Disc########################

            for (int i = 1; i <= 5; i++)

            {

               String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[4]/div/div/div/ul/li["+i+"]/article/div[2]/div[2]/div[2]/div[2]/span[1]")).getText();
                //  String discountPrice2 = discountPrice1.substring(1);
                     String discountPrice3=" ";
                if (discountPrice1.length()== 5)
                     {

                      discountPrice3= discountPrice1.substring(0,discountPrice1.length()-4)+discountPrice1.substring(discountPrice1.length()-3);


                     }

                     else
                     {
                         discountPrice3=discountPrice1;
                     }

                    int discountPrice4 = Integer.parseInt(discountPrice3);
                    Thread.sleep(2000);
                    Integer j=i+9;
                    driver.findElement(By.xpath("(//*[@class='promo_price flex-center'])["+j+"]")).click();
                    Thread.sleep(2000);
                    String discountPrice5 = driver.findElement(By.xpath("(//*[@class='value'])[1]")).getText();
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
                    if (discountPrice4 >= discountPrice8)

                    {
                        System.out.println("Great!!!!" + " " + i);
                    } else {

                        System.out.print("Bug in Discount!!!!");
                    }

                    Thread.sleep(1000);
                    driver.navigate().back();
                    Thread.sleep(2000);



                }
             //  driver.close();


            }
        }










