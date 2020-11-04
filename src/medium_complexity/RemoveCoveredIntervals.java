package medium_complexity;

import java.util.*;
public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        List<List<Integer>> intervalList = new ArrayList<>();
        List<List<Integer>> removalList = new ArrayList<>();
        for(int i=0; i<intervals.length;i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j=0; j< intervals[i].length; j++){
                tempList.add(intervals[i][j]);
            }
            intervalList.add(tempList);

        }

        int size = intervalList.size()-1;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size+1; j++) {
                if(i!=j) {
                    if(((intervalList.get(j).get(0)<= intervalList.get(i).get(0)) && (intervalList.get(i).get(1)<= intervalList.get(j).get(1)))){
                        removalList.add(intervalList.get(i));
                    }
                    if(((intervalList.get(i).get(0)<= intervalList.get(j).get(0)) && (intervalList.get(j).get(1)<= intervalList.get(i).get(1)))){
                        removalList.add(intervalList.get(j));
                    }
                }

            }

        }
        for(List<Integer> rmIndex:removalList) {
            intervalList.remove(rmIndex);
        }

        return intervalList.size();
    }


}
