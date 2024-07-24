public class ReverseNumber {
    public static void main(String[] args) {
        int n =9852;

        while (n>0){
            int rev=0;
            rev = rev*10+n%10;
            n=n/10;
            System.out.print(rev);
        }
    }
}
