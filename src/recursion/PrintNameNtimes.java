package recursion;

import java.util.Scanner;

public class PrintNameNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print N");
        int n = sc.nextInt();
        fun(n);
    }

    static void fun(int n){
        if (n<1){
            return;
        }
        System.out.println("name");
        fun(n-1);
    }
}
