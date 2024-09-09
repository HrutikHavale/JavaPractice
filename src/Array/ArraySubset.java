package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6,7,8};
                //{11, 7, 1, 13, 21, 3, 7, 3};
        int[] a2 = {1,2,3,1};
                //{11, 3,7, 1, 7};
       // System.out.println(subSet(a1,a2));
        System.out.println(subSet1(a1,a2));
    }
    static String subSet(int[] a1, int[] a2){
        Set<Integer> hashset = new HashSet<>();
        for (int hash:a1){
            hashset.add(hash);
        }
        for (int num:a2){
            if (!hashset.contains(num)){
                return "false";
            }
        }
        return "true";
    }

    static String subSet1(int[] a1, int[] a2){
        for (int i=0;i<a2.length;i++){
            String res="false";
            for (int j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    res="true";
                    break;
                }
            }
            if (res.equals("false")){
                return "No";
            }
        }
        return "Yes";
    }

    static String subSet2(int[] a1,int[] a2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            // int value=hm.getOrDefault(a1[i],0)+1;
            hm.put(a1[i], hm.getOrDefault(a1[i], 0) + 1);
        }
        for (int i=0;i<a2.length;i++){
            if (hm.containsKey(a2[i])){
                if(hm.get(a2[i])==1){
                 hm.remove(a2[i]);
                }
                else
                    hm.put(a2[i],hm.get(a2[i])-1);
            }
            else
                return "No";
        }
        return "Yes";
    }
}
