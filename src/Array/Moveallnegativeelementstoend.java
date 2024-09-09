package Array;

import java.util.Arrays;

public class Moveallnegativeelementstoend {
    public static void main(String[] args) {

        int[] arr = {-5, 7, -3, -4, 9, 10, -1, 11};
                //{1, -1, 3, 2, -7, -5, 11, 6};
                //{-5, 7, -3, -4, 9, 10, -1, 11};
        int n = arr.length;
        move3(arr,n);
    }
        static void move ( int[] arr, int n){
            int count=0;
            for (int i=0;i<n;i++){
                if (arr[i]>=0){
                    if(i!=0) {
                        arr[count] = arr[i] + arr[count];
                        arr[i] = arr[count] - arr[i];
                        arr[count] = arr[count] - arr[i];
                    }
                    count++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        static void move1(int[] arr,int n){
        int bp=n-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]<0){
                int count=i;
                for (int j=i+1;j<=bp;j++){
                   // System.out.println(count+"  "+i);
                    arr[count] = arr[j] + arr[count];
                    arr[j] = arr[count] - arr[j];
                    arr[count] = arr[count] - arr[j];
                    count++;
                }
                bp--;
            }
        }
            System.out.println(Arrays.toString(arr));
        }

        static void move2(int[] arr,int n){
        int[] pos=new int[n];
        int pos1=0, neg1=0;
        int[] neg =new int[n];
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                pos[pos1++]=arr[i];
            }
            else
                neg[neg1++]=arr[i];
        }
        int k=0;
        for(int i=0;i<pos.length;i++){
        if(pos[i]!=0) {
            arr[k++] = pos[i];
        }
        }
        for (int i=0;i<neg.length;i++){
            if(pos[i]!=0) {
                arr[k++] = neg[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }

        static void move3(int[] arr,int n){
        int[] temp=new int[n];
        int j=0;
        for (int i=0;i<n;i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
            System.out.println(Arrays.toString(temp));
    }
}
