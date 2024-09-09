package algorithm;

import java.util.Arrays;

public class SortUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr =
                //{2,4,6,8,9,10};
                {13, 7, 6, 45, 21,7, 9, 101, 102};
        // System.out.println(sort(arr);
        System.out.println(sort(arr));
    }
    static String sort(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    count++;
                }
            }
                if(count==0){
                   return "Array is Already Sorted";

                }
            }
          return Arrays.toString(arr);
    }
}
