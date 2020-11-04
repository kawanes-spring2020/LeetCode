package easy_complexity;

import java.util.*;
public class ComplementOfBase10Int {

    public int bitwiseComplement(int N) {
        if(N==0)
            return 1;
        int base = 2;
        int quotient = N;
        List<Integer> remainders = new ArrayList<>();
        while(N!=0){
            remainders.add(N%base);
            N = N/base;
        }
        int exp=remainders.size()-1;
        int output = 0;
        while(exp>=0){
            if(remainders.get(exp)==0)
                output+=Math.pow(base,exp);
            exp--;
        }
        return output;
    }

}
