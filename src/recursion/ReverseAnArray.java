package recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr= {2,4,6,7,8};
        int n=5;
     //   fun(0,arr);
//        reverseArray(n,arr);
        reverseArray1(arr,n);
    }

//    static void fun(int i, int[] arr){
//        if (i>arr.length-1){
//            return;
//        }
//        fun(i+1,arr);
//        System.out.print(arr[i]+" ");
//    }

//    static void reverseArray(int n, int[] arr){
//        int[] rev = new int[n];
//        for (int i=n-1; i>=0; i--){
//            rev[n-i-1]=arr[i];
//        }
//        printArray(rev,n);
//    }
//
//    static void printArray(int[] rev, int n){
//        for (int i=0;i<n;i++){
//            System.out.print(rev[i]+" ");
//        }
//    }

    static void reverseArray1(int[] ans, int a){
        int p1=0, p2= a-1;
        while (p1<p2){
            int temp = ans[p1];
            ans[p1] =ans[p2];
            ans[p2] = temp;
            p1++;
            p2--;
        }
        printArray(ans,a);
    }

    static void printArray(int[] arr, int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
