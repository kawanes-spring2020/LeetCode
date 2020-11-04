package medium_complexity;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        else{
            StringBuilder sb = new StringBuilder();
            int maxStep = (numRows-1)+(numRows-1-1); // for row1
            List<Integer> list = new ArrayList<>();
            while(maxStep>=-1){
                if(maxStep==-1){
                    list.add(0);
                }
                list.add(maxStep);
                maxStep -= 2;

            }
            for(int i=0;i<numRows;i++){
                int count = 1;
                int firstStep = list.get(i);
                int secondStep = list.get(numRows-1-i);
                int j=i;
                boolean flag = false;
                while(j<s.length()){

                    if(!flag){
                        flag = true;
                        sb.append(s.charAt(j));
                    }
                    if(firstStep == 0)
                        j = j + firstStep;
                    else{
                        j = j + firstStep + 1;
                        if(j<s.length()){
                            sb.append(s.charAt(j));
                        }

                    }

                    if(secondStep == 0)
                        j = j + secondStep;
                    else{
                        j = j + secondStep + 1;
                        if(j<s.length()){
                            sb.append(s.charAt(j));
                        }


                    }

                }
            }
            return sb.toString();
        }

    }

}
