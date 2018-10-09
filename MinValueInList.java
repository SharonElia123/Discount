package Discount;
import com.beust.jcommander.internal.Lists;
import org.apache.tools.ant.types.resources.Sort;
import org.bridj.cpp.std.list;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;

import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class MinValueInList extends Util{
    static double  som = 0;
    static double average = 0;

    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
       driver.get("https://www.eshet.com/deals/georgia/batumi/");
    }
    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        List<WebElement> priceRoom = driver.findElements(By.xpath("//*[@class='promo_price flex-center']"));
        List<Integer> nums = new ArrayList();
        List<Double> nums1 = new ArrayList();
        for (int s = 0; s <= 6; s++)

           {
            String value3;
            String value1 = ((WebElement) priceRoom.get(s)).getText();
            String value2 = value1.substring(0,3);
            Integer valueP = Integer.parseInt(value2);
            nums.add(valueP);
           }
       Collections.sort(nums);
       System.out.println(nums);
        Double average = nums.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println(average);
        for (int s = 0; s <= 6; s++)

        {
            double Value4=Math.abs(average-nums.get(s));
            nums1.add(Value4);
        }
        Double minElement = Collections.min(nums1);
        Integer minElement1 =(int) (average-minElement);
        Integer minElement2 =nums.indexOf(554);
        System.out.println(minElement1+" "+ minElement2);

/*

        //Orig Trip After Disc########################
        List<Integer> CENTERS_ROOKIE_YEAR = Lists.newArrayList(
                1946, 1988, 1970, 1931,
                1940, 1920, 1980, 1953,
                1960, 1974, 1987);
        Integer minElement = Collections.min(CENTERS_ROOKIE_YEAR);
        assertEquals(new Integer(1920), minElement);
        //   -------------------------------------------------

*/
        // Corner cases





    }}


