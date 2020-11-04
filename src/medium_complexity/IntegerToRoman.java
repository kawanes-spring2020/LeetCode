package medium_complexity;

import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(123));
    }

    public static String intToRoman(int num) {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        List<String> list = new ArrayList<>();
        int rem = num;
        for(int key : map.keySet()){
            if(map.containsKey(rem)){
                list.add(map.get(rem));
                rem-=key;
                if(rem ==0)
                    break;
            }
            else{
                while(rem>=key){
                    list.add(map.get(key));
                    rem -= key;
                }
            }
        }
        return String.join("",list);
    }

}
