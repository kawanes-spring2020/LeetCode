package easy_complexity;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        Boolean flag = false;

        for(int num = 0; num< nums.length-1; num++){
            if(Math.abs(nums[num]-nums[num+1])!=1){
                flag = true;
                return num+1;
            }
        }
        if(!flag){
            if(nums[0]==0)
                return nums.length;
        }

        return 0;
    }

}
