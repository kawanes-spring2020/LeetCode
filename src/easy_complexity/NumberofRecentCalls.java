package easy_complexity;

import java.util.*;
public class NumberofRecentCalls {

    int rangeUpperLimit;
    int rangeLowerLimit;
    List<Integer> requests;
    public NumberofRecentCalls() {
        requests = new ArrayList<>();
    }

    public int ping(int t) {
        this.rangeUpperLimit = t;
        this.rangeLowerLimit = t-3000;
        requests.add(t);

        while(requests.get(0)<this.rangeLowerLimit){
            requests.remove(0);
        }
        return requests.size();
    }

}
