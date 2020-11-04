package easy_complexity;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x>=0){
            int rem = 0;
            int revNum = 0;
            int length = (int)(Math.log10(x)+1);
            boolean flag = true;
            while(x>0){
                length-=1;
                rem = x%10;
                x = x/10;

                revNum += rem*Math.pow(10,length);
                if(revNum >= Integer.MAX_VALUE || revNum <= Integer.MIN_VALUE)
                    return false;
            }
            if( num ==0 || revNum==num){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

}
