package recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ABcdyCBA";
        if(checkPalindrome1(str,0))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
//    static boolean checkPalindrome(String str){
//        int p1=0, p2=str.length()-1;
//
//        while (p1<p2){
//            if (str.toLowerCase().charAt(p1)!=str.toLowerCase().charAt(p2)){
//                return false;
//
//            }
//            p1++;
//            p2--;
//        }
//        return true;
//    }

    static boolean checkPalindrome1(String str, int i){
        if (i>=str.length()/2) return true;

        if (str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(str.length()-i-1)) return false;

        return checkPalindrome1(str,i+1);
    }
}
