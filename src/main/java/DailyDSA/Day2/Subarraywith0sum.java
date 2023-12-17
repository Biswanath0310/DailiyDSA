package DailyDSA.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Subarraywith0sum {
    public class Solution {
        // Do not write code to include libraries, main() function or accept any input from the console.
        // Initialization code is already written and hidden from you. Do not write code for it again.
        public int solve(ArrayList<Integer> A) {
            // Just write your code below to complete the function. Required input is available to you as the function arguments.
            // Do not print the result or any output. Just return the result via this function.

            ArrayList<Long> prefixSum = new ArrayList<>(A.size());

            long sum = A.get(0);
            prefixSum.add(sum);
            for (int i = 1; i < A.size(); i++) {
                sum = sum + A.get(i);
                if (sum == 0) return 1;
                prefixSum.add(sum);
            }

            if (sum == 0) {
                return 1;
            }

            Set<Long> store = new HashSet<>();

            for (int i = 0; i < prefixSum.size(); i++) {
                if (store.contains(prefixSum.get(i))) {
                    return 1;
                }
                store.add(prefixSum.get(i));
            }

            return 0;
        }
    }
}
