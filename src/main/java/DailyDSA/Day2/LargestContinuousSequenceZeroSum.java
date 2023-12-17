package DailyDSA.Day2;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        HashMap<Long,Integer> prefixSumMap = new HashMap<>();
        long prefixSum = 0;
        int max = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;

        prefixSumMap.put(0L,-1);

        for (int i = 0; i < A.size(); i++) {
            prefixSum += A.get(i);

            // If prefixSum is zero or already seen before, there exists a subarray with sum zero
            if (prefixSumMap.containsKey(prefixSum)) {
                int prevIndex = prefixSumMap.get(prefixSum);
                if(max < i - prevIndex){
                    start = prevIndex+1;
                    end = i+1;
                    max = i - prevIndex;
                }
            }else{
                prefixSumMap.put(prefixSum,i);
            }


        }

        if((start != -1) && (end != -1)){
            return new ArrayList<>(A.subList(start, end));
        }
        return new ArrayList<>();
    }
}
