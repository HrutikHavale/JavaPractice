package Array;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = {10,10,10};
        secondMax(arr);
    }

//    static void secondMax(int[] arr) {
//        int max = 0, secMax = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[max]) {
//                max = i;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > secMax && arr[i] != arr[max]) {
//                secMax = arr[i];
//            }
//        }
//
//        System.out.println(  "  " + arr[max]);
//        System.out.println(secMax + "  " );
//    }

    static void secondMax(int[] arr){
        int max=0, secMax=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i]<max&&arr[i]>secMax) {
                secMax=arr[i];
            }
        }
        System.out.println(max+"   "+secMax);
    }
}
