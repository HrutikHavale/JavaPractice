package Array;

import java.util.Arrays;

public class ArrayInsertOperations {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=8;
        arr[1]=9;
        arr[2]=5;
        arr[3]=3;
        arr[4]=7;
        int x=4, cap= arr.length, pos=3, n=5;
        //System.out.println(insertElementAtEnd(arr,x,cap,n));
        System.out.println(insertElementAtAnyPosition(arr,x,n,pos));

    }
    static int insertElementAtEnd(int[] arr,int x,int cap,int n){
//        for (int i=0;i<cap;i++){
//            if(i==n){
//                arr[i]=x;
//            }
//        }
        if (n>=cap){
            return n;
        }
        arr[n]=x;
        return n+1;
    }

    static String insertElementAtAnyPosition(int[] arr,int x,int n,int pos){
        if (pos>n){
            return "not a valid position";
        }
        for (int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=x;
        return Arrays.toString(arr);
    }
}
