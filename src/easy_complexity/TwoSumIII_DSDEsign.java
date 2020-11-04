package easy_complexity;
import java.util.*;
public class TwoSumIII_DSDEsign {

    /** Initialize your data structure here. */
    Map<Integer,Integer> map;
    public TwoSumIII_DSDEsign() {
        map = new HashMap<>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(!map.containsKey(number)){
            map.put(number, 0);
        }
        else{
            int count = map.get(number);
            count++;
            map.put(number,count);
        }

    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        int remaining = 0;
        boolean flag = false;

        for(int num:map.keySet()){
            if(value>num){
                remaining = value - num;
                if(remaining==num){
                    if(map.containsKey(remaining) && map.get(num)<=0)
                        flag = false;
                    else
                        return true;
                }
                else{
                    if(map.containsKey(remaining)){
                        return true;
                    }
                }

            }
            else{
                remaining = value - num;
                if(remaining==num){
                    if(map.containsKey(remaining) && map.get(num)<=0)
                        flag = false;
                    else
                        return true;
                }
                else{
                    if(map.containsKey(remaining)){
                        return true;
                    }
                }
            }
        }
        return flag;
    }

}
