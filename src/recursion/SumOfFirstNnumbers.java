package recursion;

import java.util.Scanner;
public class SumOfFirstNnumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print N");
        int n = sc.nextInt();
        System.out.println(fun(1,n));
    }

    static int fun(int i,int n){
        if (n<1){
            return 0;
        }
        return n+fun(i,n-1);
    }
}
