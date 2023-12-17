package DailyDSA.Day2;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {

        HashMap<Integer,Integer> store = new HashMap<>();
        Integer smallest = Integer.MAX_VALUE ;
        //Go through the list and put the values and its index
        for(int i = 0 ; i < A.size() ; i++ ){
            Integer ele = A.get(i);
            if(store.containsKey(ele)){
                int index = store.get(ele);
                smallest = Math.min(smallest,index);
            }else{
                store.put(ele,i);
            }
        }

        if(smallest != Integer.MAX_VALUE){
            return A.get(smallest);
        }

        return -1;
    }
}
