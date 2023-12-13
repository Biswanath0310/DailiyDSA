package DailyDSA.Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test Case 1: Basic test with common elements
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> B1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> expected1 = CommonElement.findCommonElements(A1,B1);
        // Print the ArrayList using a loop
        System.out.println("Test Case 1:");
        for (Integer element : expected1) {
            System.out.println(element);
        }

        // Test Case 2: No common elements
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> B2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> expected2 = CommonElement.findCommonElements(A2,B2);
        System.out.println("Test Case 2:");
        for (Integer element : expected2) {
            System.out.println(element);
        }

        // Test Case 3: One common element with duplicates
        ArrayList<Integer> A3 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
        ArrayList<Integer> B3 = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 5));
        ArrayList<Integer> expected3 = CommonElement.findCommonElements(A3,B3);
        System.out.println("Test Case 3:");
        for (Integer element : expected3) {
            System.out.println(element);
        }
    }

}
