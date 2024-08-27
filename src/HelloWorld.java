import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] arr ={3,6,4,8,2,9,1};
        System.out.println(sort(arr));
    }
    static Object sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        return Arrays.toString(arr);

    }
}
