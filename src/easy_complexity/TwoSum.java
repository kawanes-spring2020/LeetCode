package easy_complexity;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int reqNum = target - nums[i];
            if(map.containsKey(reqNum)){
                return new int[] {map.get(reqNum), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
