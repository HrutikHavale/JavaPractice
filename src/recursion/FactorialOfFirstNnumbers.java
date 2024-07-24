package recursion;

import java.util.Scanner;

public class FactorialOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print N");
        int n = sc.nextInt();
        System.out.println(fun(1,n));
    }

    static int fun(int i, int n){
        if (n<i){
            return 1;
        }
        return n * fun(i,n-1);
    }
}
