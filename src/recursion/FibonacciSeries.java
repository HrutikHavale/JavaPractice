package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Print N");
        int n=sc.nextInt();
//        printFibonacciSeries(n);
        printFibonacciSeries1(n);
    }
//    static void printFibonacciSeries(int n){
//        if (n==0){
//            System.out.println(n);
//        }
//        else {
//            int[] fib = new int[n];
//            fib[0] = 0;
//            fib[1] = 1;
//            for (int i = 2; i < n; i++) {
//                fib[i] = fib[i - 1] + fib[i - 2];
//            }
//            // System.out.println(Arrays.toString(fib));
//            for (int i = 0; i < n; i++) {
//                System.out.print(fib[i] + " ");
//
//            }
//        }
//    }
      static void printFibonacciSeries1(int n){
          if (n==0){
            System.out.println(n);
          }
          else {
              int start = 0, secondLast = 1, temp = 0;
              System.out.print(start + " " + secondLast + " ");

              for (int i = 2; i < n; i++) {
                  temp = start + secondLast;
                  start = secondLast;
                  secondLast = temp;
                  System.out.print(temp + " ");
              }
          }
      }
}
