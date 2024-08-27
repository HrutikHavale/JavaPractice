package Number;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        if (checkPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    static boolean checkPrime(int n){
        int count =0;
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==1){
            return true;
        }
        return false;
    }
//    static void checkPrime(int n) {
//        int count = 0, i = 2;
//        while (i <= n/2 ) {
//            if (n % i == 0) {
//                count++;
//            }
//            i++;
//        }
//        if (count==0){
//            System.out.println("Given Number "+n+" is Prime");
//        }
//        else {
//            System.out.println("Given Number "+n+" is Not a Prime");
//        }
//    }
}
