package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n =arr.length,  d = 2;
        rotate1(arr,n,d);
    }
    static void rotate(int[] arr,int n,int d){
        int[] res=new int[n];
        int k=0;
        for (int i=d;i<n;i++){
            res[k++]=arr[i];
        }
        for (int i=0;i<d;i++){
            res[k++]=arr[i];
        }
        for (int i=0;i<n;i++){
            arr[i]=res[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    static void rotate1(int[] arr,int n,int d){
        int p=1;
        while (p<=d){
            int last=arr[0];
            for (int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
