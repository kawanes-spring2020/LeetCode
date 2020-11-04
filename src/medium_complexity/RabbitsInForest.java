package medium_complexity;

import java.util.*;

public class RabbitsInForest {

    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int number : answers){
            int count = 1;
            if(map.containsKey(number)){
                count = map.get(number);
                count++;
                map.put(number,count);
            }
            else{
                map.put(number,count);
            }

        }
        int finalValue = 0;
        for(int occurence : map.keySet()){
            int value = occurence;
            int frequency = map.get(occurence);
            int startValue = value+1;
            int counter = value+1;
            while(frequency>0){
                finalValue+=startValue;
                frequency = frequency - counter;
            }
        }
        return finalValue;
    }

}
