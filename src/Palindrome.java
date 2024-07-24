public class Palindrome {
    public static void main(String[] args) {
        int a = 12215;
        int rev=0, dup=a;
        while (a>0){
           rev = rev*10 +a%10;
           a =a/10;
        }
        if (dup==rev){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
