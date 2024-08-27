package Array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] a ={6,54,18,34,2,12};
//        int max=a[0];
//        for (int i=1;i<a.length;i++){
//            if (a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);
        int max=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>a[max]){
                max=i;
            }
        }
        System.out.println(max+"   "+a[max]);
    }
}
