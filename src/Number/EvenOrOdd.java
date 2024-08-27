package Number;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        checkEvenOrOdd(a);
    }

    static void checkEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("Given Number "+n+"is Even");
        }
        else {
            System.out.println("Given Number "+n+" is odd");
        }
    }
}
