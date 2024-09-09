package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] arr={1 ,5, 7, 9, 1, 10, 2};
        int n=arr.length;
       // System.out.println(peakElement(arr));
        System.out.println(peak(arr,n));
    }
    static int peakElement(int[] arr){

        for (int i=0;i<arr.length;i++){
            if (i==0){
                if(arr[i]>arr[i+1]){
                    return 1;
                }
            }
            else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    return 1;
                }
            }
            else {
                if (arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                    return 1;
                }
            }
        }
        return 0;
    }

    static String peak(int[] arr,int n){
        List<Integer> list =new ArrayList<>();
        if(n==1){
            //return 0;
            list.add(arr[0]);
        }
        if(arr[0]>=arr[1]){
           //return 0;
            list.add(arr[0]);
        }
        if(arr[n-1]>=arr[n-2]){
           // return n-1;
            list.add(arr[n-1]);
        }
        for(int i=1;i<n-1;i++){
            if (arr[i]>=arr[i+1]&&arr[i]>=arr[i-1]){
                list.add(arr[i]);
               // return i;
            }
        }
       return list.toString();

    }

}
