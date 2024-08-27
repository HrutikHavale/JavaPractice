package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,4};
        int k=removeDuplicates1(arr);
        for (int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void removeDuplicates(int[] arr){
        Set<Integer> s1=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            s1.add(arr[i]);
        }
        System.out.println(s1.size());
        System.out.println(s1);
    }

    public static int removeDuplicates1(int[] arr){
        int i=0;
        for (int j=1;j< arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;
    }
}
