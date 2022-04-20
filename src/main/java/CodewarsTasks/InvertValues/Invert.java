package CodewarsTasks.InvertValues;
/*
*Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
*and the negatives become positives.
* invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
* invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
* invert([]) == []
*/

public class Invert {
    public static int[] invert(int[] array) {
        int [] ergebnis = new int[array.length];
        for (int i = 0; i < ergebnis.length ; i++) {
            ergebnis[i]=(array[i])*-1;
        }
        return ergebnis;
    }
}
