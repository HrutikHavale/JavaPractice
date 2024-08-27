package Number;

import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        checkfibonaci(a);
    }

    static void checkfibonaci(int n){
        int p1 =0, p2=1, i=2;
        System.out.print(p1+" "+p2+" ");
        while (i<=n){
            int res=p1+p2;
            p1 =p2;
            p2=res;
            System.out.print(res+" ");
            i++;
        }
    }
}
