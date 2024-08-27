package Array;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,5};
        for (int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                System.out.println(a[i]);
                break;
            }
        }
    }
}
