package Number;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a = 153;
        System.out.println(armstrong(a));
    }

    static boolean armstrong(int a){
        int rev =0, dup=a;
      while (a>0){
          rev = rev+(a%10)*(a%10)*(a%10);
          a=a/10;
      }
        return rev == dup;
    }
}
