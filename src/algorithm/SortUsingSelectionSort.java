package algorithm;

import java.util.Arrays;

public class SortUsingSelectionSort {
    public static void main(String[] args) {
        int[] arr =
                //{2,4,6,8,9,10};
                  {13, 7, 6, 45, 21,18, 9, 101, 102};
        // System.out.println(sort(arr);
        System.out.println(sort(arr));
    }
    static String sort(int[] arr){
        int small;
        int n=arr.length;
        for (int i=0;i<n;i++){
            small =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
