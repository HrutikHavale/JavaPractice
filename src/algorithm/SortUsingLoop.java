package algorithm;

import java.util.Arrays;

public class SortUsingLoop {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21,7, 9, 101, 102};
        // System.out.println(sort(arr);
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp =0;
                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //System.out.println(Arrays.toString(arr));
    }
}
