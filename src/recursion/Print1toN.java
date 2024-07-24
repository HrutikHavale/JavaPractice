package recursion;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print n");
        int n=sc.nextInt();
        fun(1,n);
    }

    static void fun(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        fun(i+1,n);

    }
}
