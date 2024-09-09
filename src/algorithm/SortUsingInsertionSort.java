package algorithm;

import java.util.Arrays;

public class SortUsingInsertionSort {
    public static void main(String[] args) {
        int[] arr =
               // {2,4,6,8,9,10};
                {13, 7, 6, 45, 21,7, 9, 101, 102};
        // System.out.println(sort(arr);
        System.out.println(sort(arr));
    }
    static String sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return Arrays.toString(arr);
    }
}
