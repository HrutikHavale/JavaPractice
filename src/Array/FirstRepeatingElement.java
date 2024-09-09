package Array;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr={ 1, 5, 3, 4, 5, 3, 6};
        int n=arr.length;
        System.out.println(firstRepeating(arr,n));
    }
   // 1, 5, 3, 4, 3, 5, 6
    static Integer firstRepeating(int[] arr,int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for (int i=0;i<n;i++){
            if (hm.get(arr[i])>1){
                return i+1;
            }
        }
//        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
//            if(entry.getValue()<=1){
//                return entry.getKey();
//            }
//        }
        return -1;
    }
}
