package algorithm;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,5,4,9,1,7};
//        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(4);
        int x= 8;
        System.out.println(searchElement1(arr,x));
    }
    static int searchElement(int[] arr, int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    static int searchElement1(int[] arr, int x){
        int i=0;
        for (int a:arr){
            if(a==x){
                return i;
            }
            i++;
        }
        return -1;
    }
}
