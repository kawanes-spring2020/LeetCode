package medium_complexity;

import java.util.*;
public class DivideArrayinSetsOfKCosnsecutive {

    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0)
            return false;
        Map<Integer,Integer> map = new TreeMap<>();

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                int freq = map.get(num);
                freq++;
                map.put(num,freq);
            }

        }
        int size = k;
        int iter = nums.length/k;

        while(iter>0) {
            k= size;
            for(int key:map.keySet()){
                if(k>1) {
                    if(map.get(key)>0){
                        if(map.containsKey(key+1) && map.get(key+1)>0){
                            int value = map.get(key);
                            value--;
                            map.put(key,value);
                            k--;
                        }
                        else{
                            return false;
                        }
                    }
                }
                else if(k==1){
                    int value = map.get(key);
                    value--;
                    map.put(key,value);
                    k--;
                }
            }
            iter--;
        }
        return true;
    }

}
