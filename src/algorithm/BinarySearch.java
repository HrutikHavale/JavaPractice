package algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9,11};
//        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(4);
        int x = 3;
        System.out.println(searchElement(arr, x));
    }
    static int searchElement(int[] arr,int x){
        int min =0, max=arr.length-1;
        while (min<=max){
            int mid = (max+min)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x) {
                min = mid + 1;
            }
            else
                max = mid-1;
        }
        return -1;
    }
}
