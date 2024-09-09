package Array;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr={ -1, 2,4, -1, 3, 2};
        int n=arr.length;
        System.out.println(nonRepeating(arr,n));
    }
    static Integer nonRepeating(int[] arr, int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for (int i=0;i<n;i++){
            if (hm.get(arr[i])==1){
                return arr[i];
            }
        }
//        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
//            if(entry.getValue()<=1){
//                return entry.getKey();
//            }
//        }
        return 0;
    }
}
