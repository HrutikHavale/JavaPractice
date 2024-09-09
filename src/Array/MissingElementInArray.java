package Array;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] a={9,6,4,2,3,5,7,0,1};
        int n=a.length;
        System.out.println( missing(a,n));
    }
    static int missing(int[] a,int n){
        int sum=0;
        for (int i=0;i<a.length;i++){
//            if(a[i]==0){
//                n--;
//                continue;
//            }
            sum+=a[i];
        }
        int sumOfN=(n*(n+1))/2;
        int res = sumOfN-sum;
       // System.out.println(res);
        return res;
    }
}
