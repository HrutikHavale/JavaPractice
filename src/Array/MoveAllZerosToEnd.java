package Array;

import java.util.*;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr={2,0,3,0,0,4,0,5};
        int n= arr.length;
       // moveend(arr,n);
        //moveAtEnd(arr,n);
        moveToend(arr,n);
    }

    static void moveend(int[] arr,int n){
        int count=0;
        for (int i=0;i< n;i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
            while (count<n){
                arr[count++]=0;
            }


        System.out.println(Arrays.toString(arr));
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void moveAtEnd(int[] arr, int n){
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                for (int j=i+1;j<n;j++){
                    if (arr[j]!=0){
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void moveToend(int[] arr, int n){
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i]+arr[count];
                arr[i]=arr[count]-arr[i];
                arr[count]=arr[count]-arr[i];
//                swap(arr,arr[i],arr[count]);
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
