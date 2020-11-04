package easy_complexity;

import java.util.Arrays;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(i==0)
                output[i] = nums[i];
            else {
                if(nums[i]>(output[i-1]+nums[i]))
                    output[i] = nums[i];
                else
                    output[i] = output[i-1]+nums[i];
            }

        }
        Arrays.sort(output);
        return output[output.length-1];

    }


}
