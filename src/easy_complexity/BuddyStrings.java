package easy_complexity;

import java.util.*;
public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {

        if(B.length()==0 && A.length()==0){
            return false;
        }
        if(A.equals("") && !B.equals(""))
            return false;
        if(!A.equals("") && B.equals(""))
            return false;
        if(A.length()!=B.length())
            return false;

        Map<Character,Integer> map1 = new TreeMap<>();
        Map<Character,Integer> map2 = new TreeMap<>();
        boolean flag = false;
        for(int i = 0; i< A.length(); i++){
            if(!map1.containsKey(A.charAt(i)))
                map1.put(A.charAt(i),1);
            else{
                int val = map1.get(A.charAt(i));
                val++;
                map1.put(A.charAt(i),val);
            }
            if(!map2.containsKey(B.charAt(i)))
                map2.put(B.charAt(i),1);
            else{
                int val = map2.get(B.charAt(i));
                val++;
                map2.put(B.charAt(i),val);
            }
        }
        if(A.equals(B) && map1.size()==1){
            if(map1.get(A.charAt(0))==1)
                return false;
            if(map1.get(A.charAt(0))>=2)
                return true;
        }

        if(A.equals(B) && map1.size()>=2 ){
            for(Character c:map1.keySet()){
                if(map1.get(c)==1)
                    flag = true;
                else
                    return true;
            }
            if(flag)
                return false;

        }

        boolean flag1 = false;
        int count = 0;
        if(!A.equals(B)&& map1.equals(map2)){
            for(Character c:map1.keySet()){
                if((int)map1.get(c)==(int)map2.get(c)){
                    flag1 = true;
                }
                else{
                    return false;
                }
            }
            if(flag1){
                if(A.length()>2){
                    for(int i = 0; i< A.length(); i++){
                        char xoredChar = (char) (A.charAt(i) ^ B.charAt(i));
                        if((int)xoredChar!=0){
                            count++;
                        }
                    }
                    if(count==2)
                        return true;
                }
                count = 0;
                if(A.length()==2){
                    for(int i = 0; i< A.length(); i++){
                        char xoredChar = (char) (A.charAt(i) ^ B.charAt(i));
                        if((int)xoredChar==0){

                            count++;
                        }
                    }
                    if(count==0)
                        return true;
                }
            }

        }
        return false;

    }

}
