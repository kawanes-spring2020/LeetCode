package easy_complexity;

public class ReverseInteger {
    public int reverse(int x) {
        if(-2147483648<x && x<2147483647){
            if(x == 0){
                return 0;
            }
            else if(x>0){
                return reverseNumber(String.valueOf(x));
            }
            else{
                int positive = x*(-1);
                return (-1)*reverseNumber(String.valueOf(positive));
            }
        }
        else{
            return 0;
        }

    }

    public int reverseNumber(String x){
        StringBuilder sb = new StringBuilder();
        String[] val = x.split("");
        for(int i=val.length-1;i>=0;i--){
            sb.append(val[i]);
        }
        int value = 0;
        try{
            value = Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            return value;
        }

        return value;
    }


}
