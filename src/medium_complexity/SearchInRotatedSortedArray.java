package medium_complexity;

import java.util.HashMap;
import java.util.Map;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    public static int search(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int num:nums){
            map.put(num,i);
            i++;
        }
        if(!map.containsKey(target)){
            return -1;
        }
        else{
            return map.get(target);
        }
    }

}
