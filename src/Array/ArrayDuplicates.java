package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {3 ,2, 1, 2, 3};
        int n = arr.length;
        System.out.println(duplicate1(arr, n));
    }
    static ArrayList<Integer> duplicate(int[] arr, int n){
        ArrayList<Integer> a1=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if (!a1.contains(arr[i])) {
                        a1.add(arr[i]);
                        break;
                    }
                }
            }
        }
        if (a1.isEmpty()){
            a1.add(-1);
        }
        return a1;
    }

    static ArrayList<Integer> duplicate1(int[] arr, int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int k: arr){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        boolean isDuplicate=false;
        for (Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                isDuplicate=true;
                list.add(entry.getKey());
            }
        }
        if (!isDuplicate){
            list.add(-1);
        }
        return list;
    }
}
