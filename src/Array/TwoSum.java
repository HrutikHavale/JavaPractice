package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a= {5,8,7,2,9,8,3};
        int target =15;
       int[] b= display(a,target);
        System.out.println(Arrays.toString(b));
    }
    static int[] display(int[] a, int target){
        Map<Integer,Integer> dis = new HashMap<>();
        for (int i=0;i<a.length;i++){
            if(dis.containsKey(a[i])){
                return new int[] {dis.get(a[i]),i};
            }
            dis.put(target-a[i],i);
        }
        return new int[2];
    }
}
