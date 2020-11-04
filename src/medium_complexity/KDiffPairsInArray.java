package medium_complexity;

import java.util.*;

public class KDiffPairsInArray {


    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Set<Integer>> output = new HashSet<>();
        for(int val : nums){
            if(!map.containsKey(val))
                map.put(val,0);
            else
                map.put(val,1);
        }

        for(int i=0; i<nums.length; i++){
            Set<Integer>set = new HashSet<>();
            set.add(nums[i]);
            if(k==0) {
                if(( map.containsKey(nums[i]+k) && map.get(nums[i]+k)==1)){
                    set.add(nums[i]+k);
                    output.add(set);
                }
            }
            else {
                if(map.containsKey(nums[i]+k)) {
                    set.add(nums[i]+k);
                    output.add(set);
                }

            }
        }

        return output.size();

    }


}
