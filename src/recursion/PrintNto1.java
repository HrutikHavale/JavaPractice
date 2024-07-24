package recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print N");
        int n = sc.nextInt();
        fun(1,n);
    }
    static void fun(int i, int n){
        if (n<i){
            return;
        }
        System.out.println(n);
        fun(i,n-1);
    }
}
