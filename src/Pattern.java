import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int n = sc.nextInt();
        patternPrint2(n);

    }

    static void patternPrint1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternPrint2(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternPrint3(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patternPrint4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void patternPrint5(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternPrint6(int n){
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void patternPrint7(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void patternPrint8(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void patternPrint9(int n){
        for (int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void patternPrint10(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void patternPrint11(int n){

        for (int i=1;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(0);
            }
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
