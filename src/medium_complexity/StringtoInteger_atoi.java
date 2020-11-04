package medium_complexity;

public class StringtoInteger_atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("4192 with words"));
    }

    public static int myAtoi(String str) {

        String trimStr = str.trim();
        if(trimStr.equals(null) || trimStr.equals(""))
        {
            return 0;
        }
        else if(trimStr.length()==1 && trimStr.matches("[0-9]")){
            return convertToStr(trimStr);
        }
        else if(trimStr.length()>=2){
            if(trimStr.substring(0,2).matches("([+-])?\\d+([+-])?\\.?\\d*([+-])?\\w*([+-])?")){
                if(trimStr.startsWith("+"))
                    return convertToStr(trimStr.substring(1,trimStr.length()));
                else
                    return convertToStr(trimStr);
            }
        }

        return 0;
    }

    public static int convertToStr(String trimStr){
        Boolean flag = false;
        String reqStr = trimStr.split(" ")[0];
        if(reqStr.startsWith("-"))
            flag = true;
        StringBuilder sb = new StringBuilder();
        String[] arr = reqStr.split("");
        int startval = 0;
        if(reqStr.startsWith("-")){
            sb.append(arr[0]);
            startval = 1;
        }
        for(int i=startval;i<arr.length;i++){
            if(arr[i].matches("[0-9]")){
                sb.append(arr[i]);
            }
            else{
                break;
            }
        }
        try{
            int retNum = 0;
            if(!sb.toString().equals("")){
                retNum = Integer.parseInt(sb.toString());
            }

            return retNum;
        }catch(Exception e){
            if(flag)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }



}
