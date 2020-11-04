package easy_complexity;
import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int number : nums) {
            Boolean n=set.add(number);
            map.put(number, n);
        }
        for(int number : map.keySet()) {
            if(map.get(number))
                return number;
        }
        return 0;
    }

}
