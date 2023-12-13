package DailyDSA.Day1;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {
    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        HashMap<Integer,Integer> countHashMap = new HashMap<>();

        for (Integer ele : A) {
            if (!countHashMap.containsKey(ele)) {
                countHashMap.put(ele,1);
            }else{
                int count = countHashMap.get(ele);
                countHashMap.put(ele,++count);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer ele : B) {
            if (countHashMap.containsKey(ele)) {
                int count = countHashMap.get(ele);
                ans.add(ele);
                count--;
                if(count > 0){
                    countHashMap.put(ele,count);
                }else{
                    countHashMap.remove(ele);
                }
            }
        }
        return ans;
    }
}
