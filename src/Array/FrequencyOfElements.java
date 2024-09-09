package Array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4,1,2,5,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int value=hm.getOrDefault(arr[i],0);
            hm.put(arr[i],value+1);
        }
        for (Map.Entry<Integer,Integer> it:hm.entrySet()) {
            if (it.getValue() >= 3) {
                System.out.println(it.getKey() + "  " + it.getValue());
            }
        }
    }
}
