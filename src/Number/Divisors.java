package Number;

public class Divisors {
    public static void main(String[] args) {
        int a = 36;
        int[] arr1=div(a);
        for (int x:arr1){
            if (x==0){
                continue;
            }
            System.out.print(x+" ");
        }
    }

//        for (int i=1;i<=a;i++){
//            if (a%i==0){
//                System.out.print(i+" ");
//            }
//        }
//        List<Integer> l1=new ArrayList<>();
//        for (int i=1;i*i<=36;i++){
//            if(a%i==0){
//                l1.add(i);
//                if (a/i!=i){
//                    l1.add(a/i);
//                }
//            }
//        }
//        for (int l2:l1){
//            System.out.print(l2+" ");
//        }

    static int[] div(int a){
        int[] arr=new int[a];
        int count=0;
        for (int i=1;i<=a;i++){
            if (a%i==0){
                arr[count++]=i;
            }
        }

        return arr;
    }
}
