import CodewarsTasks.ANeedleInTheHaystack.SearchNeedle;
import CodewarsTasks.AllStarCodeChallenge18.Occurrences;
import CodewarsTasks.AreaOrPerimeter.Area;
import CodewarsTasks.Banjo.Banjo;
import CodewarsTasks.BasicMathematicalOperations.BasicOperations;
import CodewarsTasks.ConvertAStringToAnArray.Solution;
import CodewarsTasks.EvenOrOdd.EvenorOdd;
import CodewarsTasks.ExpressionsMatter.Expressions;
import CodewarsTasks.HowGoodAreUReally.HowGood;
import CodewarsTasks.InvertValues.Invert;
import CodewarsTasks.OppositeNumber.Opposite;
import CodewarsTasks.RemoveFirstAndLastCharackter.RemoveChars;
import CodewarsTasks.SumArrays.SumArray;
import CodewarsTasks.TransportationOnVacation.Transportation;
import CodewarsTasks.YouCantCodeUnderPressure1.CodeUnderPressure;
import CodewarsTasks.YouOnlyNeedOne.FindValue;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

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
        //Tests zur Aufgabe TransportationOnVacation
        System.out.println("--------");
        System.out.println(Transportation.rentalCarCost(3));
        //Tests zur Aufgabe Opposite
        System.out.println("--------");
        System.out.println(Opposite.opposite(3067));
        //Tests zur Aufgabe ConvertAStringToAnArray
        for (String a:Solution.stringToArray("Hallo Welt")) {
            System.out.println(a);
        }
        //System.out.println(Solution.stringToArray("Hallo Welt"));

        //Tests zur Aufgabe RomoveFirstAndLastCharackter
        System.out.println("--------");
        System.out.println(RemoveChars.remove("Hallo"));
        System.out.println(RemoveChars.remove("Hallo Welt"));

        //Tests zur Aufgabe YouOnlyNeedOne
        System.out.println("-------");
        System.out.println(FindValue.check(new Object[]{2,3,4,5,6},4));

        //Tests zur Aufgabe InvertValues
        System.out.println("--------");
        for (int a: Invert.invert(new int[]{1,2,3,4,-18,-20})) {
            System.out.println(a);
        }

        //Tests zur Aufgabe AreaOrPerimeter
        System.out.println("-------");
        System.out.println(Area.areaOrPerimeter(2,2));
        System.out.println(Area.areaOrPerimeter(5,10));

        //Tests zur Aufgabe YouCantCodeUnderPressure
        System.out.println("-------");
        System.out.println(CodeUnderPressure.doubleInteger(2));

        //Tests zur Aufgabe HowGoodAreUReally
        System.out.println("-------");
        System.out.println(HowGood.betterThanAverage(new int[]{2,3},5));
        System.out.println(HowGood.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88},75));
        System.out.println(HowGood.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90},69));
        System.out.println(HowGood.betterThanAverage(new int[]{100,90},11));

        //Tests zur Aufgabe ANeedleInTheHaystack
        System.out.println("--------");
        System.out.println(SearchNeedle.findNeedle(new Object[]{1,"needle","Luft","Erde","Wasser","Feuer"}));

        //Tests zur Aufgabe AllStarCodeChallenge
        System.out.println("--------");
        System.out.println(Occurrences.strCount("hallo",'p'));

        //Tests zur Aufgabe ExpressionsMatter
        System.out.println("--------");
        System.out.println(Expressions.expressionsMatter(1,1,1));
        System.out.println(Expressions.expressionsMatter(5,3,2));

        //Tests zur Aufgabe EvenOrOdd
        System.out.println("------");
        System.out.println(EvenorOdd.even_or_odd(6));
        System.out.println(EvenorOdd.even_or_odd(7));

        //Tests zur Aufgabe BasicMathematicalOperations
        System.out.println("-------");
        System.out.println(BasicOperations.basicMath("+",2,2));
        System.out.println(BasicOperations.basicMath("-",2,2));
        System.out.println(BasicOperations.basicMath("*",2,2));
        System.out.println(BasicOperations.basicMath("/",2,2));

    }
}
