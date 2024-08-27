import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1, 2, 7, 22, 6, 8, 9};
        int n=arr.length;
        System.out.println(sortArray(arr,n));
    }
    static String sortArray(int[] arr,int n){
        int swapcount =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                    swapcount ++;
                }
            }
            if (swapcount==0)
                return "Array is already Sorted";
        }
        return Arrays.toString(arr);
    }
}
