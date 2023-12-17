package DailyDSA.Day3;

import java.util.HashMap;

public class CheckPalindrome {
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
}
