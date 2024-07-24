public class Havale {
    public static void main(String[] args) {
        int n =23;
        System.out.println(remove(n));

    }
    static int remove(int n){
        int k=0;
//        while (n>0){
//            k++;
//           n= n/10;
//        }

        while (n>0){
            int a=n%10;
            if(n%a==0){
                k++;
            }
            a=n/10;
        }


        return k;
    }
}
