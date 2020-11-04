package easy_complexity;

import java.util.Arrays;

public class ArrayWithXElemGreaterThanEqualToX {

    public int specialArray(int[] nums) {
        int iter = nums.length;
        Arrays.sort(nums);

        for(int i=iter; i >0;i--){
            int val = 0;
            if(i<=iter){
                for(int j=0; j<nums.length;j++){
                    if(nums[j]>=i)
                        val++;
                }
                if(val == i)
                    return i;
                else
                    val = 0;
            }
        }
        return -1;
    }

}
