package easy_complexity;

import java.util.*;
public class HappyNumber {

    public boolean isHappy(int num) {

        int number=num;
        Set<Integer> visited = new HashSet<>();
        while(number>1) {
            String s = String.valueOf(number);
            String[] arr = s.split("");
            int i=0;
            number=0;
            while(i<arr.length) {
                number+=(Integer.parseInt(arr[i])*Integer.parseInt(arr[i]));
                i++;
            }
            Boolean flag = visited.add(number);
            if(!flag)
                return false;
        }
        return true;
    }

}
