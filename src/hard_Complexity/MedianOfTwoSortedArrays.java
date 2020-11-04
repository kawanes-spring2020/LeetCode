package hard_Complexity;

import java.util.*;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==0)
            return 0.0;
        else{
            double median = 0.0;
            List<Integer> list1 = new ArrayList<>();
            for(int number : nums1){
                list1.add(number);
            }
            List<Integer> list2 = new ArrayList<>();
            for(int number1 : nums2){
                list2.add(number1);
            }
            list1.addAll(list2);
            Collections.sort(list1);
            if(list1.size()%2!=0){
                median = list1.get(list1.size()/2);
            }
            else{
                median = (list1.get(list1.size()/2)+list1.get(list1.size()/2-1))/2.0;
            }
            return median;
        }
    }

}
