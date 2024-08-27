package String;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String nums="85946";
        System.out.println(oddNumber(nums));
    }
    static String oddNumber(String nums){
       int n=nums.length();
       for (int i=n-1;i>=0;i--){
           int a=nums.charAt(i)-48;
           if (a%2!=0)
               return nums.substring(0,i+1);
        }
       return "";
    }
}
