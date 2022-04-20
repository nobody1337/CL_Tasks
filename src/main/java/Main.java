import CodewarsTasks.Banjo.Banjo;
import CodewarsTasks.SumArrays.SumArray;
import CodewarsTasks.TransportationOnVacation.Transportation;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Main {
    @Test
    public static void testSum() {
        assertEquals(0,      SumArray.sum(new double[] { }),                1e-4);
        assertEquals(-2.398, SumArray.sum(new double[] {-2.398}),           1e-4);
        assertEquals(6,      SumArray.sum(new double[] {1, 2, 3}),          1e-4);
        assertEquals(6.6,    SumArray.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        assertEquals(9.2,    SumArray.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320,    SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }

    public static void main(String[] args) {
        //Tests der Aufgabe Banjo
        System.out.println(Banjo.areYouPlayingBanjo("Tom"));
        System.out.println(Banjo.areYouPlayingBanjo("Rita"));
        System.out.println(Banjo.areYouPlayingBanjo("Axel"));
        System.out.println(Banjo.areYouPlayingBanjo("Rapunzel"));
        System.out.println("--------");
        System.out.println(Banjo.areYouPlayingBanjo("tom"));
        System.out.println(Banjo.areYouPlayingBanjo("rita"));
        System.out.println(Banjo.areYouPlayingBanjo("axel"));
        System.out.println(Banjo.areYouPlayingBanjo("rapunzel"));
        System.out.println("--------");

        //Tests der Aufgabe SumArray
        System.out.println(SumArray.sum(new double[] {1, 2, 3}));
       //testSum();

        System.out.println("--------");
        System.out.println(Transportation.rentalCarCost(3));

    }
}
