package Discount;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;


public class DiscountVsAfterPacageVacation extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
        driver.get(test1+"deals" );//********************************************************************
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
       //Orig Trip After Disc########################

        for (int i = 1; i <= 5; i++)

        {
            try {
            String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div["+i+"]/article/div[2]/div[2]/div[2]/div[2]/span[1]")).getText();
            String discountPrice3 ;
            if (discountPrice1.length() == 5) {

             discountPrice3=discountPrice1.substring(0);
            } else {
                discountPrice3 = discountPrice1;
            }

            int discountPrice4 = Integer.parseInt(discountPrice3);
            System.out.print("After Discount" + " " + " : " + discountPrice4 + " ");

            String discountPrice5 = driver.findElement(By.xpath("//*[@id='promotion-group-tab-0']/div[1]/div/div["+i+"]/article/div[2]/div[2]/div[2]/div[1]/div")).getText();

            String discountPrice7 = " ";
            if (discountPrice5.length() == 5) {

                discountPrice7 = discountPrice5.substring(0, discountPrice5.length() - 4) + discountPrice5.substring(discountPrice5.length() - 3);


            } else {
                discountPrice7 = discountPrice5.substring(1);
            }

            int discountPrice8 = Integer.parseInt(discountPrice7);

            System.out.println(":" + " " + "Before Discount" + ":" + discountPrice8);
            if (discountPrice4 > discountPrice8 - (discountPrice8 * 0.5))

            {
                System.out.println("Great Discount is O.k VS Before");
            } else {

                System.out.println("Bug in Discount!!!!");
            }}
          catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();

            System.err.println(shortenedStackTrace(e, 1));


        }
           Thread.sleep(2000);
        }}


    public  String shortenedStackTrace(Exception e, int maxLines) {
        StringWriter writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));
        String[] lines = writer.toString().split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(lines.length, maxLines); i++) {
            sb.append(lines[i]).append("\n");
        }
        return sb.toString();
    }

}







