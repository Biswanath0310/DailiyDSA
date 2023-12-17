package DailyDSA.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KOccurrences kOccurrences = new KOccurrences();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000000000,1000000000,999999999,999999998,1));
        System.out.println(kOccurrences.getSum(5,2, input));

        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.solve("abcda"));
    }
}
