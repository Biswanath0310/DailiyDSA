package DailyDSA.Day3;

import java.util.HashSet;
import java.util.Set;

public class CheckPalindrome2 {
    public int solve(String A) {
        int store[] = new int[26];
        for(int i = 0 ; i < A.length() ; i++){
            store[A.charAt(i)-'a']++;
        }

        int freq = 0 ;
        for(int i = 0 ; i < 26 ; i++){
            freq += store[i]%2;
        }

        if(freq < 2){
            return 1;
        }
        return 0;

    }

    public int solve1(String A){
        Set<Character> store = new HashSet<>();
        for(int i = 0 ; i < A.length() ; i++){
            if(store.contains(A.charAt(i))) {
                store.remove(A.charAt(i));
            }else{
                store.add(A.charAt(i));
            }
        }
        if(store.size()<=1){
            return 1;
        }
        return 0;
    }
}
