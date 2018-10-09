package Discount;

import Kidum.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PageHomeDiscOrig.class, DiscountVsAfterOrigTrip.class,
               DiscountVsAfterHotelSR.class, DiscountVsAfterHP.class, DiscountVsAfterPacageVacation.class,
              DiscountVsAfterVacationISR.class,PageHomeBeforeDiscInvite.class})


public class junitTestSuiteSanity {

    public junitTestSuiteSanity() {
    }


}
