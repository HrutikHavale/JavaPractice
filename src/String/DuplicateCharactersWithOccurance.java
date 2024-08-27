package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersWithOccurance {

    public static void main(String[] args) {
        String str = "My name is Hrutik kumar";
        duplicateChar(str);
    }

    public static void duplicateChar(String str){

        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();

//        for (int i=0;i<ch.length;i++){
        for (char c: ch){
            if (c==' '){
                continue;
            } if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else {
                hm.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
