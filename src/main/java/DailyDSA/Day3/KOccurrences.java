package DailyDSA.Day3;

import java.util.ArrayList;
import java.util.HashMap;

public class KOccurrences {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(Integer ele : C){
            if(store.containsKey(ele)){
                int fre = store.get(ele);
                store.put(ele,++fre);
            }else{
                store.put(ele,1);
            }
        }
        long ans = 0;
        boolean flag = false;
        for(Integer key : store.keySet()){
            int fre = store.get(key);
            if(fre == B){
                flag = true;
                ans += key;
                ans = ans % 1000000007;
            }
        }

        if(!flag) return -1;
        return (int)ans;
    }
}
