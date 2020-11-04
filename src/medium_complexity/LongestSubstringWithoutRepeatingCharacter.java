package medium_complexity;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if(s.length()>0){
            int count = 0;
            int temp = 0;
            boolean flag = false;
            while(temp<s.length()){
                for(int i=temp;i<s.length();i++){
                    if(!map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i),0);
                        count++;
                    }
                    else{
                        flag =true;
                        list.add(count);
                        map.clear();
                        count = 0;
                        break;

                    }
                }
                temp++;
            }
            if(!flag)
                list.add(count);
            return Collections.max(list);
        }
        return 0;

    }
}
