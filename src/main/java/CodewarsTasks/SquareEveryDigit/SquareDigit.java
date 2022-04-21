package CodewarsTasks.SquareEveryDigit;

/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
 */

import java.util.Arrays;

public class SquareDigit {
    public static int squareDigits(int n) {

        String zahl = String.valueOf(n);
        int[] zahlen= new int[zahl.length()];
        for (int i = 0; i < zahlen.length ; i++) {
            zahlen[i]=zahl.charAt(i)-'0';
            zahlen[i]=zahlen[i]*zahlen[i];
        }
        StringBuilder a = new StringBuilder();
        for (int b:zahlen) {
            a.append(b);
        }
        return Integer.parseInt(a.toString());
    }
}
