package easy_complexity;
import java.util.*;

public class ValidParanthese {
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        String[] arr = s.split("");
        Map<String,String> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        map.put("(",")");
        map.put("[","]");
        map.put("{","}");
        if(map.containsKey(arr[0])){

            for(String val : arr){
                if(map.containsKey(val))
                    stack.push(val);
                else{
                    if(stack.isEmpty())
                        return false;
                    if(!map.get(stack.pop()).equals(val))
                        return false;
                }
            }
            if(stack.isEmpty())
                return true;
        }
        return false;
    }

}
