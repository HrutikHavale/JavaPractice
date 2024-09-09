package Array;

public class ArraySearchOperation {
    public static void main(String[] args) {
        int[] arr={ 2, 3, 4, 10, 40};
        int n=arr.length, x=10;
       // System.out.println(linearSearch(arr,n,x));
        System.out.println(binarySearch(arr,n,x));
    }
    static int linearSearch(int[] arr,int n,int x){
        for (int i=0;i<n;i++){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int n,int x){
        int low=0, high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
             if (arr[mid]==x)
                 return mid;
            else if(arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
