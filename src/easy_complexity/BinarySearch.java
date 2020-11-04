package easy_complexity;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int startIndex = 0;
        int lastIndex = nums.length-1;
        int arrLength = lastIndex - startIndex + 1;
        int midIndex = 0;
        if(arrLength%2==0)
            midIndex = (arrLength/2)-1;
        else
            midIndex = arrLength/2;

        while(startIndex!=lastIndex){
            if(nums[midIndex]==target){
                return midIndex;
            }
            if(target < nums[midIndex]){
                if(midIndex==0)
                    return -1;
                lastIndex = midIndex-1;
                arrLength = lastIndex - startIndex + 1;
                if(arrLength%2==0)
                    midIndex = startIndex + (arrLength/2)-1;
                else
                    midIndex = startIndex + arrLength/2;

            }
            if(target > nums[midIndex]){
                startIndex = midIndex+1;
                arrLength = lastIndex - startIndex + 1;
                if(arrLength%2==0)
                    midIndex = startIndex + arrLength/2-1;
                else
                    midIndex = startIndex + arrLength/2;
            }

        }
        if(nums[startIndex]==target){
            return startIndex;
        }

        return -1;

    }

}
