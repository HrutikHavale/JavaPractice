import static java.lang.Math.max;
import static java.lang.Math.min;

public class Gcd_Hcf {

    public static void main(String[] args) {
        int n1 = 24, n2=20;
        System.out.println(checkGCD_HCF1(n1,n2));
    }

//    static int checkGCD_HCF(int n1, int n2){
//        int gcd=0;
//        for (int i=1;i<=min(n1,n2);i++){
//    if(n1%i==0 && n2%i==0){
//        gcd=i;
//    }
//        }
//        return gcd;
//    }

    static int checkGCD_HCF1(int n1, int n2){
        int gcd=0;
        for (int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}
